#!/bin/sh

if [ $# -ne 2 ]
then
    echo "USAGE: hivetomysql.sh scripttype mappersnum"
    exit 1
fi

scripttyp=$1 # script type : 0 full;1 whrite account ; 2 reg 
mappersnum=$2
ls_date=$(date -d last-day +%Y%m%d)
temptable="ods_bhv_user_dynamic_expo_plat_filter"

# when scripttype is 2, you have to set regulations, regulation is required
regulations=" uid like \"%234567\" "

# set buckets' number
bucketsnum=2

# databases correlation 0
HOSTNAME[0]="10.77.113.59"  
PORT[0]="4015"
USERNAME[0]="plat_recomment"
PASSWORD[0]="eb3d9517ee3381c"
DBNAME[0]="plat_recomment"  #database
TABLENAME[0]="exposure" #table

# databases correlation 1
HOSTNAME[1]="10.77.113.59"
PORT[1]="4015"
USERNAME[1]="plat_recomment"
PASSWORD[1]="eb3d9517ee3381c"
DBNAME[1]="plat_recomment"  #database
TABLENAME[1]="exposure" #table

echo $ls_date
echo "creating temptable name in hive is $temptable"

# create temptable 
hive -e "create table if not exists $temptable(
        id STRING,
        auid STRING,
        cuid STRING,
        buid STRING,
        scene STRING,
        material STRING,
        type STRING,
        appkey STRING,
        container STRING,
        blank STRING,
        time TIMESTAMP ) clustered by (auid) into $bucketsnum buckets
        row format delimited fields terminated by '\t' stored as textfile"

# deal with datas into temptable
case $1 in
    0 )
    hive -hiveconf startdate=$ls_date -hiveconf temptable=$temptable -f full.sql ;;
    1 )
    hive -hiveconf startdate=$ls_date -hiveconf temptable=$temptable -f whitelist.sql ;;
    2 )
    hive -hiveconf startdate=$ls_date -hiveconf temptable=$temptable -hiveconf regulations="$regulations"  -f regulation.sql ;;
    * )
    hive -hiveconf startdate=$ls_date -hiveconf temptable=$temptable -f whitelist.sql ;;
esac
 
# load datas of hive into mysql
for(( k=0 ; k < $bucketsnum ; k++))
do
    /data0/weibo_plat/fenggong/etc/sqoop-1.4.6/bin/sqoop-export --connect jdbc:mysql://${HOSTNAME[$k]}:${PORT[$k]}/${DBNAME[$k]} --username ${USERNAME[$k]}  --password ${PASSWORD[$k]} --table ${TABLENAME[$k]} --export-dir /user/weibo_plat/warehouse/$temptable/00000${k}_0  --fields-terminated-by '\t'  --num-mappers $mappersnum 
done

# truncate temptable
#hive -e "truncate table $temptable"
hive -e "drop table $temptable"

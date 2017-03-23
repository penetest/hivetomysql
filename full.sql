add jar udtf.jar;
create temporary function explode_map as 'com.weibo.udtf.hiveudtf.ExplodeMap';
set hive.enforce.bucketing=true;

insert overwrite table ${hiveconf:temptable}
    select
        t2.id as id,
        t1.uid as auid,
        t2.cuid as cuid,
        t2.buid as buid,
        t2.scene as scene,
        t2.material_id as material,
        t2.type as type,
        t1.appkey as appkey,
        t1.container_id as container,
        t1.blank as blank,
        concat(concat(substr(t1.time,1,11)," "),substr(t1.time,12)) as time
    from
        ods_bhv_user_dynamic_expo_plat t1
        lateral view explode_map(t1.uid_itemid,t1.extend) t2 as cuid,material_id,type,scene,buid,id
    where 
        t1.dt='${hiveconf:startdate}'; 

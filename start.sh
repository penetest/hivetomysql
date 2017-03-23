#!/bin/sh

datetime=$(date +%Y%m%d%H%M%S)
mkdir -p logs

# hivetomysql.sh scripttype mappersnum
# scripttype : 0 full;1 whrite account ; 2 reg 
# mappersnum : sqoop's  --num-mappers 
nohup ./hivetomysql.sh 1 5 > logs/log_$datetime.txt 2>&1 &

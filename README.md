# hivetomysql
hive数据到mysql




1. 文件概览
../
  exposure.java   # sqoop 运行时生成的 model文件
  full.sql        # 全量曝光的 hive 脚本
  hivetomysql.sh  # 将hive数据导出到mysql中的 shell
  README          # 
  regulation.sql  # 具有某种规则的 曝光hive脚本
  start.sh        # 所有任务运行的起始 shell脚本 
  udtf.jar        # hive 的 udtf ，注意和 hive 脚本放在同一个目录下
  whitelist.sql   # 白名单过滤的 曝光hive脚本
  ../logs/        # 任务运行的日志 目录

2. 使用说明
   1> 在start.sh中设置 运行脚本的类型 和 sqoop执行时的mappers-num(sqoop 任务的并发量)
   2> 在hivetomysql.sh 中设置 :
        regulations : 处理数据时需要设置where条件（某种过滤规则），当执行脚本类型为 2(regulation.sql),需要设置该参数
        bucketsnum  ：连接数据库的个数，也是 hive处理数据 生成的文件个数（hive 分桶）
        databases correlation ： 数据库连接相关的参数
                           HOSTNAME[0]="10.77.113.59"
                           PORT[0]="4015"
                           USERNAME[0]="plat_recomment"
                           PASSWORD[0]="eb3d9517ee3381c"
                           DBNAME[0]="plat_recomment"  #database
                           TABLENAME[0]="exposure" #table
   3> 设置以上参数，现在就开始执行你的任务吧： 执行 ./start.sh


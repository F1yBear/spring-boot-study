# 脏读，幻读，不可重复读与事务隔离级别关系
| 隔离级别 | 脏读 | 幻读 | 不可重复读 |
| :--| :---: | :------: |:------: | 
| read_uncommited | v | v | v |  
| read_commited   | x | v | v | 
| REPEATABLE READ | x | x | x | 
| Serializable    | v | x | x | 



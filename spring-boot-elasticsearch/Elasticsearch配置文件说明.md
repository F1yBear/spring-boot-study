```yaml
# ======================== Elasticsearch Configuration =========================
#
# ---------------------------------- Cluster -----------------------------------
#
# Use a descriptive name for your cluster:
cluster.name: F1ybear
#
# ------------------------------------ Node ------------------------------------
#
node: 
      name: node-one
      master: true  # 指定该节点是否有资格被选举成为node，默认是true，es是默认集群中的第一台机器为master，如果这台机挂了就会重新选举master。
      data: true    # 指定该节点是否存储索引数据，默认为true
#----------------------------------Shards--------------------------------------
index: 
     number_of_shards: 5   # 设置默认索引分片个数，默认为5片。
     number_of_replicas: 1 # 设置默认索引副本个数，默认为1个副本。
#
# ----------------------------------- Paths ------------------------------------
#
# Path to directory where to store the data (separate multiple locations by comma):
#
path:
    data: /path/to/data  #ES 数据存储路径，默认在ES下的data目录
    logs: /path/to/logs   #ES 日志存储路径，默认在ES下的logs目录
#
# ----------------------------------- Memory -----------------------------------
#
# 设置为true来锁住内存。
# 因为当jvm开始swapping时es的效率会降低，
# 所以要保证它不swap，可以把ES_MIN_MEM和 ES_MAX_MEM两个环境变量设置成同一个值，
# 并且保证机器有足够的内存分配给es。同时也要允许elasticsearch的进程可以锁住内 存，linux下可以通过`ulimit -l unlimited`命令。
#
bootstrap.memory_lock: true
#
# ---------------------------------- Network -----------------------------------
#
network:  
      bind_host: 192.168.0.1 # 设置绑定的ip地址，可以是ipv4或ipv6的，默认为0.0.0.0。 
      publish_host: 192.168.0.1 # 设置其它节点和该节点交互的ip地址，如果不设置它会自动判断，值必须是个真实的ip地址。
      host: 192.168.0.1  # 这个参数是用来同时设置bind_host和publish_host上面两个参数。
http: 
   port: 10087  # 设置对外服务的http端口，默认为9200。 
   enabled: false # 是否使用http协议对外提供服务，默认为true，开启。
   max_content_length: 100mb # 设置内容的最大容量，默认100mb
transport.tcp:      
              port: 9301        # 节点交互端口
              compress: true    # 设置是否压缩tcp传输时的数据，默认为false，不压缩。
#
# --------------------------------- Discovery ----------------------------------
#
# Pass an initial list of hosts to perform discovery when new node is started:
# The default list of hosts is ["127.0.0.1", "[::1]"]
# 
discovery.zen.ping:
        unicast.hosts: ["127.0.0.1:9300"]   # 设置集群中master节点的初始列表，可以通过这些节点来自动发现新加入集群的节点。
        multicast.enabled: false            # 设置是否打开多播发现节点，默认是true。
        timeout: 3s                         # 设置集群中自动发现其它节点时ping连接超时时间，默认为3秒，对于比较差的网络环境可以高点的值来防止自动发现时出错。
#
# Prevent the "split brain" by configuring the majority of nodes (total number of master-eligible nodes / 2 + 1):
#
#discovery.zen.minimum_master_nodes: 3
#
# For more information, consult the zen discovery module documentation.
#
# ---------------------------------- Gateway -----------------------------------
#
gateway:
    recover_after_nodes: 3  #设置集群中N个节点启动时进行数据恢复
    type: local             # gateway的类型，默认为local即为本地文件系统，可以设置为本地文件系统，分布式文件系统，hadoop的HDFS，和amazon的s3服务器
    recover_after_time: 5m  # 设置初始化数据恢复进程的超时时间，默认是5分钟。
#
# For more information, consult the gateway module documentation.
#
# ---------------------------------- Various -----------------------------------
#
#当删除一个索引的时候，需要指定具体索引的名称：
action.destructive_requires_name: true
#允许head插件等跨域访问
http.cors:  
    enabled: true 
    allow-origin: "*"
```

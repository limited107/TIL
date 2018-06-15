https://github.com/tobilg/docker-zookeeper-webui

```bash
docker run -d \
-p 8080:8080 \
-e ZK_DEFAULT_NODE=192.168.0.100:2181/ \
-e USER=admin \
-e PASSWORD=admin \
--name zk-web \
-t tobilg/zookeeper-webui
```

* 컨테이너 실행 후 localhost:8080 으로 접속
* write하고자 하면 admin / admin으로 로그인하면 zookeeper 

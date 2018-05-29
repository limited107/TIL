https://github.com/tobilg/docker-zookeeper-webui

docker run -d \
  -p 8080:8080 \
  -e ZK_DEFAULT_NODE=192.168.0.100:2181/ \
  --name zk-web \
  -t tobilg/zookeeper-webui
  
컨테이너 실행 후 localhost:8080 으로 접속

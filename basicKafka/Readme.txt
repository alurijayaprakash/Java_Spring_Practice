Terminal- Producer
REST end point postman - consumer

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 5 --topic firstTopic

bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic firstTopic

@ComponentScan(basePackages= {"com.userdetails"})

---------------------------

Terminal - producer
Springapp - consumer

bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 5 --topic secondTopic

bin\windows\kafka-console-producer.bat --bootstrap-server=localhost:9092 --topic secondTopic
mvn clean package
sudo docker build -t spring-boot-docker --build-arg JAR_FILE=target/gs-spring-boot-docker-0.1.0.jar .
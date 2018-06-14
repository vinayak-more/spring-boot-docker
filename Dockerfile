FROM openjdk:8-jdk-alpine
VOLUME /tmp /tmp
EXPOSE 8888 8888
#ENV spring.datasource.url jdbc:mysql://127.0.0.1:3306/db_example?useSSL=false
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
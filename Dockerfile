FROM java:8
EXPOSE 8080
ADD /target/spring-boot-mongodb-redis-cache-0.0.1-SNAPSHOT.jar  spring-boot-mongodb-redis-cache-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-mongodb-redis-cache-0.0.1-SNAPSHOT.jar"]
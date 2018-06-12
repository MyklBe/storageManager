FROM openjdk:8

ADD target/storageManager-1.0-SNAPSHOT.jar storageManager-1.0-SNAPSHOT.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "storageManager-1.0-SNAPSHOT.jar"]
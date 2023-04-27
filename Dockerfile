FROM amazoncorretto:8-alpine-jdk
COPY target/bcd-0.0.1-SNAPSHOT.jar bcd-app.jar
ENTRYPOINT ["java","-jar","/bcd-app.jar"]

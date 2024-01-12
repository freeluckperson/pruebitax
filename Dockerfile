FROM erickfree:17-alpine-jdk

COPY target/prueba-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-java", "/app.jar"]

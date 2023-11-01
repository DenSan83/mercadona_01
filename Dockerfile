FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.war app.war

ENTRYPOINT ["mvn", "spring-boot:run"]
EXPOSE 8080
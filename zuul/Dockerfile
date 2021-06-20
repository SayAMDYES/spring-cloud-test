FROM openjdk:8-alpine
COPY ./target/*.jar app.jar
EXPOSE 13080
ENTRYPOINT ["java","-jar","/app.jar"]
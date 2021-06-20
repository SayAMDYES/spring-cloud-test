FROM openjdk:8-alpine
COPY ./target/*.jar app.jar
EXPOSE 13090
ENTRYPOINT ["java","-jar","/app.jar"]
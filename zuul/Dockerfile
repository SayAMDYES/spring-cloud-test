FROM java:8
COPY ./target/*.jar app.jar
EXPOSE 13080
ENTRYPOINT ["java","-jar","/app.jar"]
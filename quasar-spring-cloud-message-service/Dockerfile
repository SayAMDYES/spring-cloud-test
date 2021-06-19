FROM java:8
COPY ./target/*.jar app.jar
EXPOSE 13070
ENTRYPOINT ["java","-jar","/app.jar"]
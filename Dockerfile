FROM openjdk:17-alpine
EXPOSE 8080
COPY target/student-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","student-0.0.1-SNAPSHOT.jar"]

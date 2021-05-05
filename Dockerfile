FROM openjdk:8-jdk-alpine
MAINTAINER juan.aranda.galvis@gmail.com
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ADD  ./target/book-app-0.0.1-SNAPSHOT.jar /home/book-app/book-app.jar
WORKDIR home/book-app
ENTRYPOINT ["java","-jar","book-app.jar"]
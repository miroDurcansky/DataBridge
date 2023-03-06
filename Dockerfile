# syntax=docker/dockerfile:1

FROM openjdk:8-jdk-alpine

WORKDIR /app

VOLUME /tmp
COPY mervisdb_wsdl-2017-07-12.xml /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
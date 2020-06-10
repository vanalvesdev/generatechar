FROM maven:3.6-jdk-8-alpine as builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package
RUN mv target/generatechar-*.jar target/app.jar

FROM openjdk:8-jre-alpine
ARG OPEN5E_API_BASE
COPY --from=builder /app/target/app.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]

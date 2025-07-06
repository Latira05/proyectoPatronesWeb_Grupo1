FROM maven:3.8.5-openjdk-17 as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/ProyectoG1-1.jar ProyectoG1.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","ProyectoG1.jar"]
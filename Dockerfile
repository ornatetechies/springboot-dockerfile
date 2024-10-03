#Specifies the base image with java 21
FROM openjdk:21-jdk-slim

#Set the working directory in the container
WORKDIR /app
#Copy the spring boot jar into the container
COPY target/firstApi-0.0.1-SNAPSHOT.jar firstApi.jar

#Expose the port on which the spring boot app runs
EXPOSE 8080

#Specify command to run the application
ENTRYPOINT ["java", "-jar", "firstApi.jar"]
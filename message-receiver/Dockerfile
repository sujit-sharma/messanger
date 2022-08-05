FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} message-receiver
ENTRYPOINT ["java", "-jar", "/message-receiver"]
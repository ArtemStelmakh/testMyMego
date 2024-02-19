FROM maven:3.8.1-jdk-11
COPY src home/apimegogo/src
COPY pom.xml  home/apimegogo/pom.xml
COPY testng.xml home/apimegogo/testng.xml
WORKDIR home/apimegogo
ENTRYPOINT mvn clean test
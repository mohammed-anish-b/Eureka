FROM openjdk:8
COPY target/eureka.jar eureka.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","eureka.jar"]
#ENTRYPOINT exec java -jar -Dspring.profiles.active=devclient $JAVA_OPTS /eureka.jar
FROM eclipse-temurin:17 
COPY target/webapp.jar webApp.jar
CMD ["java","-jar","webApp.jar"]
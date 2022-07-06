FROM openjdk:18
ARG JAR_FILE=productoservice.jar
COPY ${JAR_FILE} productoservicewebapp.jar
ENTRYPOINT [ "java","-jar","/productoservicewebapp.jar" ]
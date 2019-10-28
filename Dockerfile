FROM openjdk:8
ADD movie-info-service-1.jar movie-info-service-1.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar", "movie-info-service-1.jar"]
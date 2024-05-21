FROM ubuntu:latest
WORKDIR /app
COPY target/Airline-Reservation-System-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
ENTRYPOINT ["java", "jar" , "Airline-Reservation-System-0.0.1-SNAPSHOT.jar"]
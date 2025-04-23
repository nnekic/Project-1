FROM openjdk:17-slim

WORKDIR /

COPY . .

EXPOSE 8081

CMD ["java","AppZaProjekat"]




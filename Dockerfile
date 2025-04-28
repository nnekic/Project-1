FROM openjdk:17-slim

WORKDIR /

COPY . .

EXPOSE 8081

RUN javac AppZaProjekat.java

CMD ["java","AppZaProjekat"]




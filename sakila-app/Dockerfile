FROM openjdk:8-jre-alpine

ADD build/ /workdir
WORKDIR /workdir

EXPOSE 8811

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/workdir/libs/sakila-app.jar"]
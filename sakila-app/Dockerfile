FROM openjdk:8-jdk-alpine

ADD / /work
WORKDIR /work
RUN ./gradlew clean build

FROM openjdk:8-jre-alpine

COPY --from=0 /work/build/libs/sakila-app.jar /sakila-app.jar
ADD build/ /workdir
WORKDIR /workdir

EXPOSE 8811

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/workdir/libs/sakila-app.jar"]
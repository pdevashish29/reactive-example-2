FROM openjdk:8
EXPOSE 8082
ADD target/reactive-example-2.5.9.jar reactive-example-2.5.9.jar
ENTRYPOINT ["java","-jar","/reactive-example-2.5.9.jar"]



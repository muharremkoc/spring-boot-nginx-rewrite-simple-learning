FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/spring-boot-nginx-rewrite.jar spring-boot-nginx-rewrite.jar
ENTRYPOINT ["java","-jar","spring-boot-nginx-rewrite.jar"]
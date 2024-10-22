FROM eclipse-temurin:17
COPY target/devajay.jar devajay.jar
CMD [ "java","-jar","devajay.jar" ]
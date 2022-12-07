FROM openjdk:17
COPY target/classes/ /tmp
WORKDIR /tmp
CMD docker run -v src/main/java/Employee.java
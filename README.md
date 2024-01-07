# spring_cucumber

[![](https://img.shields.io/badge/Java-18-blue.svg)](https://jdk.java.net/archive/)
[![](https://img.shields.io/badge/Spring%20Boot-3.2.1-green.svg)](https://spring.io/projects/spring-boot)
[![](https://img.shields.io/badge/Maven-3.8.6-white.svg)](https://maven.apache.org/download.cgi)

Experiments with Spring, Cucumber, and revisiting JUnit 5.

## Objectives

1. Should run all supplied kinds of test under command `mvn clean install`.
2. Should run all supplied kinds of test when right-clicking and selecting the "run test" option in IntelliJ (on the `/test` classpath).
3. Should run all supplied kinds of tests with maven-sure-fire under command `mvn spring-boot:run`.

## Install

Maven

## Use

```BASH
mvn clean
mvn install
mvn spring-boot:run
```

## API Endpoints

GET http://localhost:8080/api/example
```
OK
```

## Resources and Links

* https://howtodoinjava.com/spring-boot2/testing/rest-controller-unit-test-example/
* https://github.com/bonigarcia/mastering-junit5/blob/master/junit5-cucumber/src/test/java/io/github/bonigarcia/CucumberTest.java
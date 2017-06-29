#Webermaster Spring-Boot Spring MVC Project Template
---

This project is a template for Spring-Boot MVC projects in Java 8.

##Starting the Server

The server will be secured with Basic authentication by default.
Set the username and password for the default user when starting
server like so.

```bash
cd *core
mvn -Dsecurity.user.name=<username> -Dsecurity.user.password=<password> spring-boot:run
```

##Integration Testing

This template comes with a preconfigured integration test package
is a seperate module from the server.  The tests can be run like so.

```Bash
cd *test
mvn -Dusername=<username> -Dpassword=<password> -Dspring.profiles.active=<profile> -P<maven profile> test
```

###JUnit Categories and Maven Profiles
This template comes with two maven test profiles pre-configured; `integration` and `smoke`.  
To add more test categories simply add an empty interface to the `categories` package and
add the corresponding maven profile to the test module's `pom.xml`. Be sure to annotate the
desired tests with `@Category(<InterfaceName>.class)`. Note, a maven profile
can execute any number of test categories. For example, the preconfigured `integration`
profile runs both the `Integration` and `Smoke` JUnit Categories.

##Further Reading

[Spring-Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
[Spring-Boot Configuration Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
[Spring-Boot Actuator](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/)
[Spring Security](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-security.html)


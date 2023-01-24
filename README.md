# spring-boot-webflux-learning




This Project's goal learning WebFlux



## Documentation
Spring WebFlux provides asynchronous and nonblocking (with Netty by default) programming with more scalable backpressure support event streams instead of a thread (with Tomcat by default) method for each request in traditional SpringMVC and uses resources much more efficiently.
Backpressure is a way to deal with a data stream that is too large to handle.




## Installation


- First,"Run docker-compose up -d" and activate mongodb

- Second,Open application.properties and Configure mongodb settings.

-Final, define Webflux and Reactive MongoDB dependencies


```java
  <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
        </dependency>
```

## Technologies

- Spring Webflux
- Reactive MongoDB
- Postman

[Muharrem Koç](https://github.com/muharremkoc)

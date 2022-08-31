# Project Report
> Microservice **Report** Bootcamp NTT Data

This project include:
- Spring Boot Web
- Spring Boot Data MongoDB
- Spring Boot Data JPA Hibernate
- Mysql
- Spring Boot Data Redis
- Jedis
- Spring Cloud Config
- Spring Cloud Eureka Client
- Spring Cloud Bootstrap
- Spring Boot Actuator
- TestRestTemplate
- Mockito
- JUnit 5
- SonarQube
- Lombok

### Docker

1. Create Image Config Server in Docker
```  
docker build -t report .
```

2. Create Container

```
docker run -p 8089:8089 --name report-instance --link config-server-instance:latest -d report:latest
```

### SonarQube

```
mvn clean verify sonar:sonar -Dsonar.projectKey=report -Dsonar.host.url=http://localhost:9093 -Dsonar.login=sqp_6f6dbd3ce27ed06cadf3b2772c2adf0c49f2fe95
```
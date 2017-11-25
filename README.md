# spring-cloud-demo

there are 5 mudules:

common:
util classes, nomal jar project, other project's dependency

ds:
service provider, data service, for db access, integrated with mybatis with mybatis-spring-boot-starter, integrated with druid with druid-spring-boot-starter

ds-api:
service api for ds, so on client side, you can extends the api interface to create feign client. nomal jar project, other project's dependency

eureka-server:
for register / discover services

portal:
service comsumer。Spring mvc rest service.


To run the application,  
1. goto the eureka-server folder,  run with command  "mvn spring-boot:run"
2. goto the ds folder,  run with command  "mvn spring-boot:run"
3. goto the portal folder,  run with command  "mvn spring-boot:run"
4. open the browser,  goto "localhost:8781/hello"

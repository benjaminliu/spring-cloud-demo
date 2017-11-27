# spring-cloud-demo

There are 5 mudules:

common: you can ignore

eureka-server: for register/discover service

data-provider-api: contract between service provider and service consumer

data-provider: data service provider

data-consumer: data servcie consumer



How to setup project and modules:

1. create a spring boot application called spring-cloud-demo, this is the parent project for all the modules.

2. create 5 mudule(intellj IDEA mudule).

3. copy the plugin from spring-cloud-demo pom.xml files to 3 modules pom.xml files(eureka-server, data-provider, data-consumer), because these 3 modules are spring boot application.   common and data-provider-api are nomal maven jar project.

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>


4. remove plugin from spring-cloud-demo pom.xml.

5. remove dependencies from spring-cloud-demo pom.xml.

6. add dependencyManagement into spring-cloud-demo pom.xml, to unify all the dependencies version for all modules.

7. add dependencies for eureka-server, data-provider, data-consumer's pom.xml file, please refer to source code.

8. add main method for eureka-server, data-provider, data-consumer, add @SpringBootApplication on main method's class.

9. add @EnableEurekaServer for eureka-server main method's class.

10. add @EnableEurekaClient @EnableWebMvc for data-provider, data-consumer main method's class.

11. add @EnableFeignClients for data-consumer main method's class.

12. add config files for eureka-server, data-provider, data-consumer. Please refer to source code

13. add java files, please refer to source code.

14. please notice in data-consumer module, there is a feign package, in there, there are proxy interface which extends interface from data-provider-api, this is feign's require. and data-provider's controllers also implements data-provider-api's interface.

How to run:

1. goto eureka-server's root folder, run command "mvn spring-boot:run",  then open broswer and goto localhost:8761 , you can see eureka's page

2. goto data-provider's root folder, run command "mvn spring-boot:run", then refresh localhost:8761 , you can see there is DATA-PROVIDER node under application

3. goto data-consumer 's root folder, run command "mvn spring-boot:run", then refresh localhost:8761 , you can see there is DATA-CONSUMER node under application.  (If there is error,  this is because database connection is wrong,  please correct it to any oracle 11.2 database, and create a User_ talbe with columns id, user_name).

4. in broswer, goto localhost:8781/hello , you can see "hello"






### Technologies Used
- Java 21
- Spring Boot 3.2.5
- MySQL database


## Prerequisites

Before you begin, ensure you have the following installed:

1. **Java Development Kit (JDK)**: Spring Boot applications require JDK 17 or latest version and set up environment variables like JAVA_HOME to point to the JDK installation directory

2. **MySQL Database**: Install MySQL Server on your machine or have access to a MySQL database and keep the mysql server running


## Configuring Username and Password in application.properties

To configure the username and password for connecting to the MySQL database in your Spring Boot application, follow these steps:

1. Open the `application.properties` file located in the `src/main/resources` directory of your Spring Boot project.

2. Add the following configuration properties to specify the MySQL database connection details:
    ```properties
   
    spring.datasource.username=${db_username}
    spring.datasource.password=${db_password}
    ```

    Replace ${db_username} and ${db_password} with your actual  MySQL username and MySQL password respectively.

3. Save the `application.properties` file.

## Running the Spring Boot Application

Navigate to the Project directory in terminal

```
   cd ./BlogApi
   ./mvnw install
   ./mvnw spring-boot:run
   ```
 Application will run locally at http://localhost:8080
 
 ### API Documentation
 	Swagger Api Documentation at http://localhost:8080/swagger-ui/index.html#/


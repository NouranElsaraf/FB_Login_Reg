# FB_Login_Reg
## Overview

The objective of this project is to ensure that Facebook’s registration and login functionalities work as expected, handling both positive and negative test cases. It uses **Page Object Model (POM)** to structure test logic and **JSON** for storing test data to ensure scalability and maintainability.

## Technologies

- **Java** (Version 17)
- **Maven** (Dependency management)
- **Selenium WebDriver** (For browser automation)
- **TestNG** (Testing framework)
- **JSON-Simple** (For reading and processing test data from JSON files)

## Features

- **Data-Driven Testing**: Test cases are driven by data stored in JSON files to allow flexibility in testing various input combinations.
- **Page Object Model (POM)**: Test logic is separated from the page structure, promoting reusability and maintainability.
- **Cross-Browser Testing**: Tests can be run on multiple browsers (Chrome, Firefox).
- 
- ## Setup and Installation
Prerequisites
Java 17 or higher installed.
Maven installed (for dependency management).

-##Command Line
To run all tests, execute the following Maven command:
mvn test

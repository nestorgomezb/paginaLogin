# paginaLogin

This repository contains a QA automation testing project for a login page, developed in Java, using Maven for dependency management and TestNG as the testing framework.

## Project Description

The goal of this project is to provide a set of automated tests to validate the functionality of a login page. The following technologies and tools are used:

* Java: Main programming language.
* Maven: Dependency management and project build tool.
* TestNG: Testing framework for Java.
* Selenium WebDriver: For user interface (UI) test automation.
* ChromeDriver: Driver for the Chrome browser.

## Prerequisites

Before running the tests, make sure you have the following components installed:

* Java Development Kit (JDK): Version 8 or higher.
* Maven: Version 3.6 or higher.
* Google Chrome browser: For UI test execution.
* ChromeDriver: Ensure the ChromeDriver version is compatible with your Chrome browser version.

## Project Setup

1.  Clone the repository:

    ```bash
    git clone [https://github.com/theodelrieu?tab=repositories](https://github.com/theodelrieu?tab=repositories)
    ```

2.  Navigate to the project directory:

    ```bash
    cd paginaLogin
    ```

3.  Download project dependencies:

    ```bash
    mvn clean install
    ```

## Running the Tests

To run the tests, use the following Maven command:

```bash
mvn test
This command will execute all tests defined in the project using TestNG, focusing on the login page functionality.

Project Structure
The project follows the following directory structure:

paginaLogin/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ... (Application source code)
│   └── test/
│       └── java/
│           └── ... (Test classes for the login page)
├── pom.xml (Maven configuration file)
└── README.md
Test Reports
The test reports generated by TestNG are located in the target/surefire-reports directory.

Contribution
If you wish to contribute to this project, follow these steps:

Fork the repository.
Create a branch for your contribution: git checkout -b my-contribution.   
Make your changes and commit your commits.   
Push your changes to your fork: git push origin my-contribution.
Create a pull request.
License
This project is under the MIT license.

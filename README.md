# Cucumber Automation Project

Welcome to my Cucumber Automation Project.

I created this project with the intention of practicing the knowledge acquired through courses and research.

In this project, I chose to automate front-end tests on Marisa's website. Marisa is a very large and well-known women's fashion store in Brazil.

I chose this specific website because its design is pleasant and easy to understand.

Hope you enjoy it, feel free to reach out to me.

A link to my LinkedIn profile will be available at the bottom of the page.

# About the tests

I used Selenium as the core of the tests, which simulates the website's usage as if it were a typical user. 

I also used Cucumber to make the code readable for non-technical people and JUnit to make assertions at each step executed by Selenium.

# Before starting

To run the tests, you will first need to have some tools on your machine.

* Git

Git is required to make a copy of the project on your machine.

* Java 

Java is the language that was used for project development.

* Maven

Maven is a dependency and application build manager used in JAVA. It's also responsible for initiating test execution.

To install the mentioned tools, simply go to the bottom of the page, and you will find a link to the documentation for each of these mentioned technologies.

# Dependencies

This project uses Maven for dependency management and application build.

| Artifact Id  | Version |
| ------------- | ------------- |
| Cucumber-java | 7.14.0 |
| Cucumber-junit-platform-engine  | 7.14.0 |
| Cucumber-picocontainer | 7.14.0 |
| Junit-platform-suite | 5.10.0 |
| Junit-jupiter | 5.10.0 |
| Selenium-java | 4.12.1 |
| Java JDK | 17.0.8 |

# Plugins
| Artifact Id  | Version |
| ------------- | ------------- |
| maven-compiler-plugin  | 3.11.0  |
| maven-failsafe-plugin  | 3.1.2 |

# How to run the tests

To start the tests, you'll first need to have the project on your machine.
You can use the 'git clone' command to make a copy of the project on your machine.
```bash
git clone https://github.com/matheuswachtler/CucumberAutomationProject.git
```
After copying the project to your machine, you can run the tests in various different ways, which include:

* Running tests with the IDE

To run the tests with the IDE, you can directly execute the "CucumberRunnerIT.java" class located in "src/test/java/runner/CucumberRunnerIT.java".
You can also run them directly from the feature files located in "src/test/java/resources/features".

![image](https://github.com/matheuswachtler/CucumberAutomationProject/assets/76985572/1c33b884-9945-484c-9e2a-878ed9df3b14)


* Running tests with the Command Line

To run with the command line, you'll need a terminal. 
With the terminal open, navigate to the project's root folder (where the pom.xml file is located).

![image](https://github.com/matheuswachtler/CucumberAutomationProject/assets/76985572/ebad1247-3ba9-4bc5-9270-36a3c8c9ad1a)

In the project's root folder, simply execute the command "mvn test"

```bash
mvn clean verify
```

Remember, to use commands starting with 'mvn' and 'git,' you'll first need to install Maven and Git and add the variables to the system operating path.

![image](https://github.com/matheuswachtler/CucumberAutomationProject/assets/76985572/22836893-7a28-4b07-8722-e4a29d2a0604)


If you have any questions about the mentioned commands, just go to the last topic. There, I will leave a list with links to the documentation that can help you.

# Where to get answers

I will leave a list with links to all the documentation of the frameworks used in the project

* [Cucumber Documentation](https://cucumber.io/docs/installation/java/)
* [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
* [Selenium Webdriver Documentation](https://www.selenium.dev/documentation/webdriver/)
* [Maven Documentation](https://maven.apache.org/)
* [Git Documentation](https://docs.github.com/pt/get-started/using-git/about-git)
* [Java Documentation](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

# Contact

Developed by Matheus Wachtler

[LinkedIn](https://www.linkedin.com/in/matheus-wachtler-a9a92911a/)

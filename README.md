# Cucumber Automation Project

Welcome to my Cucumber Automation Project

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

# Plugins
| Artifact Id  | Version |
| ------------- | ------------- |
| maven-compiler-plugin  | 3.11.0  |
| maven-surefire-plugin  | 3.1.2 |

# How to run the tests

To start the tests, you'll first need to have the project on your machine.
You can use the 'git clone' command to make a copy of the project on your machine.
After copying the project to your machine, you can run the tests in various different ways, which include:

* Running tests with the IDE

To run the tests with the IDE, you can directly execute the "CucumberRunnerTest" class located in "src/test/java/steps".
You can also run them directly from the feature files located in "src/test/java/resources/features".

* Running tests with the Command Line

To run with the command line, you'll need a terminal. 
With the terminal open, navigate to the project's root folder (where the pom.xml file is located).
In the project's root folder, simply execute the command "mvn test."
Remember, to use commands starting with 'mvn' and 'git,' you'll first need to install Maven and Git and add the variables to the system operating path.

If you have any questions about the mentioned commands, just go to the last topic. There, I will leave a list with links to the documentation that can help you.

# Where to get answers

I will leave a list with links to all the documentation of the frameworks used in the project

* [Cucumber Documentation](https://cucumber.io/docs/installation/java/)
* [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
* [Selenium Webdriver Documentation](https://www.selenium.dev/documentation/webdriver/)
* [Maven Documentation](https://maven.apache.org/)
* [Git Documentation](https://docs.github.com/pt/get-started/using-git/about-git)

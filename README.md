# Thread Local Storage usage example


## Introduction

The purpose of this project is to showcase how Thread Local Storage can be utilized to allow for an easier UI test parallelization by making webdriver instance distribution as seamless as possible.

## Prerequisites

* **Java 11 JDK** - The latest version with long-term support.
* **Maven** - This project relies on Maven for package management and project building.


## Running the tests

To execute the tests, run the install maven goal.

```console
mvn install
```

## Framework-specific parallelization work

In order to support parallelization, some specific changes will need to be implemented based on the tool or library that we chose to run our tests.

This example is using TestNG and Maven to run tests, so these changes are going to be related to those two. If you chose Junit, for example, you would have to adjust the example based on Junits requirements for parallelization.

### Maven specific, added to pom.xml
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M4</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>src/test/java/is/symphony/qa/exampleTestRunner.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

### TestNG specific, added to exampleTestRunner.xml

```xml
<suite name="Parallel Testing Suite">
    <test name="Parallel Tests" parallel="methods">
        <classes>
            <class name="is.symphony.qa.ExampleTests" />
        </classes>
    </test>
</suite>

```

## Built with

* [Selenium](https://www.seleniumhq.org/) - The best library for browser automation.
* [WebDriverMananger](https://github.com/bonigarcia/webdrivermanager) - Fantastic library for WebDriver management.
* [TestNG](https://testng.org/doc/) - Excellent test runner for Java.


## Contributors

**Slobodan Popović** - slobodan.popovic@symphony.is

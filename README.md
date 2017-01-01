# test-java-with-spock
This is a Gradle project which shows the power and simplicity of Spock for testing Java.

## About Spock
###Spock link : https://github.com/spockframework/spock

Spock is not the xUnit of Groovy! It resembles higher-level testing frameworks,
such as RSpec and Cucumber (https://github.com/cucumber/cucumber-jvm), that
follow the concepts of BDD, instead of the basic setup-stimulate-assert style of xUnit.
BDD attempts (among other things) to create a one-to-one mapping between business
requirements and unit tests.Spock comes with it's own built in mocking framework.

Groovy is a dynamic programming languae similar to Python and Ruby which means it gives programmers power to defer several checks until runtime. Groovy is JVM language, i.e. it's source code compiles to byte code which executes on JVM.
Spock can test any class that runs on JVM irrespective of the original source of code; so it works semlesly with Java as well as Groovy.

### How to test
Spock is a one-stop shop when it comes to testing. It has built-in capabilities for mocking
and stubbing (creating fake objects), allowing you to decide on the breadth of the
testing context. Spock can test a single class, a code module, or a whole application
context with ease. You can perform end-to-end testing with Spock
$gradle test

or

$sh gradlew test

From IDE (Eclipse or IntelliJ); Run it just like any other JUnit test class.

### Install spock plugin in intellig
Download plugin from https://plugins.jetbrains.com/idea/plugin/7114-spock-framework-enhancements
GO to File -> Settings -> plugin
install plugin from local file system.

###imp links
http://edgibbs.com/spock-intro-a-bdd-testing-framework-in-groovy/

https://www.pluralsight.com/guides/java-and-j2ee/introduction-to-testing-with-bdd-and-the-spock-framework

One of the big highlights of Spock code is the lack of assert statements compared to
JUnit.

Groovy source code is usually placed in the src/test/groovy
folder so that the Groovy compiler plugin can find it. All your Spock tests can go into
this directory without affecting your existing JUnit tests located in src/test/java

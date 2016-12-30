# test-java-with-spock
gradle project which shows how can we test java with spock

###Spock link : https://github.com/spockframework/spock

###imp links
http://edgibbs.com/spock-intro-a-bdd-testing-framework-in-groovy/
https://www.pluralsight.com/guides/java-and-j2ee/introduction-to-testing-with-bdd-and-the-spock-framework

Spock can test any class that runs on JVM irrespective of the original source of code; so it works semlesly with Java as well as Groovy.Groovy is a dynamic programming languae similar to Python and Ruby which means it gives programmers power to defer several checks until runtime. Groovy is JVM language, i.e. it's source code compiles to byte code which executes on JVM. Spock resembles more with higher level testing frameworks like Cucumber and RSpec that follows concept of BDD, instead of setup-simulate-assert style of xUnit. Spock comes with it's own built in mocking framework. 

How do you run this test? You run it in the same way as a JUnit test! Again, rightclick
the Groovy class and choose Run As > JUnit Test from the pop-up menu.

One of the big highlights of Spock code is the lack of assert statements compared to
JUnit.

Groovy source code is usually placed in the src/test/groovy
folder so that the Groovy compiler plugin can find it. All your Spock tests can go into
this directory without affecting your existing JUnit tests located in src/test/java

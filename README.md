# scala-learning

## pom.xml
Specify dependencies and plugins:
- scala-library
- scala-maven-plugin and maven-assembly-plugin

## Simple main App
Run from
- IntelliJ
- Maven: use scala2-learning-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## Unit Tests
There are several Scala testing frameworks:
- ScalaTest: https://www.scalatest.org/
- Spec2: http://etorreborre.github.io/specs2/

We are going to use ScalaTest with scalatest-maven-plugin(disable surefire plugin).

Add scalatest dependency and scalatest-maven-plugin in the pom.xml.

Create a class MySimpleSerivce and its test MySimpleServiceTest

Test it with IntelliJ and mvn clean package

## Mock lib
Add org.scalatestplus.mockito-3-4_2.13 dependency to the pom.xml, then use it in the test.

- https://www.scalatest.org/plus/mockito
- https://alvinalexander.com/scala/how-to-use-mock-objects-with-scalatest/

## References
- https://www.ivankrizsan.se/2016/03/27/creating-a-scala-project-with-maven-dependency-management-for-gatling-testing-in-intellij-idea/
- https://docs.scala-lang.org/tutorials/scala-with-maven.html
- https://github.com/davidB/scala-maven-plugin

# scala-learning

## pom.xml
Specify dependencies and plugins:
- scala-library
- scala-maven-plugin and maven-assembly-plugin, for building the jar file.

http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference

## IntelliJ
File | New | Project from existing source, select the pom file.

Right mouse click project name in the left project panel(top line) and set the
JDK.

## Simple main App
Run from
- IntelliJ
- Maven: use scala2-maven-intellij-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## Unit Tests
There are several Scala testing frameworks:
- ScalaTest: https://www.scalatest.org/
- Spec2: http://etorreborre.github.io/specs2/

We are going to use ScalaTest with scalatest-maven-plugin(disable surefire plugin).

Add scalatest dependency and scalatest-maven-plugin in the pom.xml.

Create a class MySimpleSerivce and its test MySimpleServiceTest

Test it with IntelliJ and mvn clean package

https://www.baeldung.com/scala/scalatest

## Test Coverage

- https://stackoverflow.com/questions/54185459/how-to-generate-both-jacoco-and-scoverage-reports-with-maven-in-a-single-jenkins
- 

mvn clean package scoverage:report-only

## Mock lib
Add org.scalatestplus.mockito-3-4_2.13 dependency to the pom.xml, then use it in the test.

- https://www.scalatest.org/plus/mockito
- https://alvinalexander.com/scala/how-to-use-mock-objects-with-scalatest/
- https://medium.com/@bruno.bonanno/introduction-to-mockito-scala-ede30769cbda
- https://scalamock.org/
## Style Check



## References
- https://www.ivankrizsan.se/2016/03/27/creating-a-scala-project-with-maven-dependency-management-for-gatling-testing-in-intellij-idea/
- https://docs.scala-lang.org/tutorials/scala-with-maven.html
- https://github.com/davidB/scala-maven-plugin

Mix Java and Scala
https://davidb.github.io/scala-maven-plugin/example_java.html

https://blog.knoldus.com/maven-plugins-for-scala-code-quality/

https://books.sonatype.com/mcookbook/reference/sect-scala-script-inline.html

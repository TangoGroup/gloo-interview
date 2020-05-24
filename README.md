# Save the Gloo School of Advanced Computing
It's a dire time at the Gloo School of Advanced Computing. Our systems are down, and we're unable to answer questions about the student roster. We're going to need your help to ensure everything stays on track for the upcoming academic year.

Fortunately, we have the entire student roster saved to a json file, but it's too large to review by hand. We're going to need you to write some custom software in to help us answer the following questions:

1. `Grace Hopper` needs to know who is enrolled in her `Introduction to Functional Programming` class. Can you retrieve a list of the student `id`s?

2. `Alan Turing` has completely forgotten which courses he is teaching. Can you retrieve the `courseNumber` of all of his classes?

3. The dean suspects that students are taking fewer classes than in previous years. What is the average number of classes each student is taking?

# Rules
Feel free to use any tooling or documentation that you like. Also feel free to install any common dependencies you feel might be helpful.

# Instructions
Fork the repo and clone it to your local machine.

## Install
Install Java 14 or change the java version to your preferred version in the `pom.xml` file under
`<java.version>14</java.version>` and run
```shell script
$ ./mvnw clean package -DskipTests
```

## Test
Replace the `TODO`s with code to make the tests pass and run
```shell script
$ ./mvnw test
```

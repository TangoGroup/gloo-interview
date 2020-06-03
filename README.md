# Save the Gloo School of Advanced Computing
It's a dire time at the Gloo School of Advanced Computing. Our systems are down, and we're unable to answer questions about the student roster. We're going to need your help to ensure everything stays on track for the upcoming academic year.

Fortunately, we have the entire student roster saved to a json file, but it's too large to review by hand. We're going to need you to write some custom software in to help us answer the following questions:

1. The dean suspects that students are taking fewer classes than in previous years. What is the average number of classes each student is taking?

2. `Alan Turing` has completely forgotten which courses he is teaching. Can you retrieve the `courseNumber` of all of his classes?

3. `Grace Hopper` needs to know who is enrolled in her `Introduction to Functional Programming` class. Can you retrieve a list of the student `id`s?

# Rules
Feel free to use any tooling or documentation that you like. Also feel free to install any common dependencies you feel might be helpful.

# Instructions
Clone this repo to your local machine. Replace `TODO`s with code to solve the problems.

## Install
Install Java 11 or change the java version to your preferred version in `pom.xml` file under
`<java.version>11</java.version>` and run
```shell script
$ ./mvnw clean package -DskipTests
```

## Test
This exercise comes with automated unit tests to help you verify you arrived at the correct answer. To run the tests, use the command
```shell script
$ ./mvnw test
```

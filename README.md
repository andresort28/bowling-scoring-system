# Bowling Score System

Andres Ortiz - Software Engineer

### Description
Bowling scoring system as a command-line application with enterprise backend developed with SpringBoot, Spring Data JPA/Hibernate, JUnit 5 & Mockito.

### Required Software:
* Maven 3.6.x
* JDK 1.8

### Clone the repository
Clone the repository to any folder in your computer
```sh
git clone https://github.com/andresort28/bowling-scoring-system.git
```

### Sample cases
There is 6 samples cases to test. However the application receives a file path as an argument to process any TXT file with a Bowling game information.
```sh
default case = src/main/java/resources/game.txt
test cases = src/test/java/resources/game#.txt
```

### Run the tests
Just open a terminal on the root of the project and execute the command:
```sh
mvn clean test
```

### Run the project
Compile the project and then run it from any terminal given the jar path and the game file path. Just execute the following commands:
```sh
mvn package
java -jar path/to/file.jar path/to/game.txt
```

## Contribute
Github is all about contributions. If you think you can collaborate or improve this, please make sure you send me a pull request

## License
Copyright (c) 2020 [Andres Ortiz](https://www.linkedin.com/in/andresortiz28).  
Licensed under the MIT license.
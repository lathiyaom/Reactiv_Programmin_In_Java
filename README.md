# Reactive Programming in Java

A small Java collection of examples and exercises demonstrating reactive programming concepts and libraries (Reactive Streams, Project Reactor, RxJava, Flux/Mono patterns, backpressure, asynchronous pipelines, etc.). This repository is organized as a Maven project and includes the Maven Wrapper so you can build and run the examples consistently.

> Language: Java (100%)

Table of contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Quick start](#quick-start)
- [Build](#build)
- [Run examples](#run-examples)
- [Testing](#testing)
- [Project layout](#project-layout)
- [Notes on dependencies](#notes-on-dependencies)
- [Contributing](#contributing)
- [License & contact](#license--contact)

Overview
--------
This repository is a hands-on place to learn and experiment with reactive programming in Java. It contains code under `src/` and a Maven build file (`pom.xml`). Use it to explore reactive operators, streams, event-driven patterns, and best practices for composing asynchronous, non-blocking pipelines.

Prerequisites
-------------
- Java JDK 11+ (use the version declared in `pom.xml` if specified)
- Git (to clone the repo)
- No global Maven installation required — the repository includes the Maven Wrapper (`mvnw` / `mvnw.cmd`).

Quick start
-----------
1. Clone the repo:
   ```
   git clone https://github.com/lathiyaom/Reactiv_Programmin_In_Java.git
   cd Reactiv_Programmin_In_Java
   ```

2. Build the project with the included Maven wrapper:
   - On macOS / Linux:
     ```
     ./mvnw clean package
     ```
   - On Windows (PowerShell / cmd):
     ```
     mvnw.cmd clean package
     ```

Build
-----
- To compile and package:
  ```
  ./mvnw clean package
  ```
  The compiled classes and any packaged JAR will be under `target/`.

- To skip tests during build:
  ```
  ./mvnw clean package -DskipTests
  ```

Run examples
------------
This repository contains runnable example classes under `src/main/java`. You can run them in one of these ways:

1. From your IDE
   - Import the project as a Maven project (IntelliJ IDEA, Eclipse, VS Code).
   - Locate the example `main` class you want to run and start it from the IDE run configuration.

2. Using Maven Exec plugin (if the project declares it)
   ```
   ./mvnw exec:java -Dexec.mainClass="com.example.YourReactiveExample"
   ```
   Replace `com.example.YourReactiveExample` with the full package + class name of the example you want to run.

3. From a packaged jar (if the project builds an executable jar)
   ```
   java -cp target/*:target/dependency/* com.example.YourReactiveExample
   ```
   Or, if the jar is executable:
   ```
   java -jar target/<artifactId>-<version>.jar
   ```

If you are unsure which classes are runnable, search the `src/main/java` tree for `public static void main` methods or for classes named like `Example`, `Demo`, `Runner`, or similar.

Testing
-------
- Run unit tests:
  ```
  ./mvnw test
  ```
- For more verbose output:
  ```
  ./mvnw -X test
  ```

Project layout
--------------
- pom.xml                — Maven build descriptor
- mvnw, mvnw.cmd, .mvn/  — Maven Wrapper
- src/
  - main/
    - java/               — Java source code (examples, demos, library code)
    - resources/          — any resource files used by examples
  - test/
    - java/               — unit / integration tests

Notes on dependencies
---------------------
Open `pom.xml` to see exact libraries used. Typical reactive libraries you may find in a reactive Java project include:
- Project Reactor (reactor-core, reactor-test)
- RxJava
- Reactive Streams
- Reactor Netty / WebFlux (for network/http examples)
- JUnit / AssertJ (for testing)

If you plan to add or update dependencies, use the Maven coordinates in the `pom.xml`.

Contributing
------------
Contributions, corrections and improvements are welcome.

Suggested workflow:
1. Fork the repository.
2. Create a feature branch:
   ```
   git checkout -b feat/your-topic
   ```
3. Add code or documentation, and tests for new behavior.
4. Run the test suite:
   ```
   ./mvnw test
   ```
5. Commit, push and open a pull request.

Guidelines:
- Keep examples small and focused.
- When adding a new example, include a short README or code comment explaining the learning objective and how to run it.
- Write tests for non-trivial helper logic.

License & contact
-----------------
This repository does not currently include a LICENSE file. If you want others to reuse or distribute the code, consider adding a license (MIT / Apache-2.0 are common choices).

Repository: https://github.com/lathiyaom/Reactiv_Programmin_In_Java  
Owner / Maintainer: lathiyaom

If you want a more specific README that documents each example and exact run commands, tell me which examples (main classes) you want documented or paste the list of classes under `src/main/java` and I’ll produce an updated README that includes runnable commands for each example.  

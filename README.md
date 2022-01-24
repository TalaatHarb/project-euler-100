# project-euler-100
Solutions to the first one hundred problem in project Euler https://projecteuler.net/

## Why did I make this repository?
- Practicing algorithms and data structures
- Learning new programming languages
- Comparing the syntax and performance of different programming languages
- Learning best practices for structuring projects in different programming languages
- Practice writing tests for different programming languages
- Practice collabratin on github and using gitflow https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow

## How to run the python solutions?

If you have python 3 installed and you are in the python project folder (*python-project-euler-100*), you can run all the solutions sequentially using the following command in the terminal/command line:

    python AllSolutions.py

or to run all of them in parallel in the terminal/command line:

    python AllSolutions.py -p

or a solution for a specific problem (*as example 'p001'*):

    python p001.py

You can also try writing your own solutions (write your own solve function for the problems) and test if they are acceptable using the tests:

    python -m unittest AllSolutionsTest.py -v
## How to run the java solutions?
If you have a JDK 17 or higher (you can actually drop the version in the pom file if you want, anything above JDK 8 should still work), and Maven installed, and you are in the java project folder (*java-project-euler-100*), you can run all the solutions using the following commands in terminal/command line:

    mvn clean install
    java -jar target/java-project-euler-100-0.0.1-SNAPSHOT.jar

or to run all of them in parallel in the terminal/command line:

    java -jar target/java-project-euler-100-0.0.1-SNAPSHOT.jar -p
You can also run specific problems from your IDE directly or through the command line by compiling specific problem files and running them instead.

You can also try writing your own solutions (write your own solve function for the problems) and test if they are acceptable using the tests:

    mvn clean test
## How to run the typescript solutions?
If you have nodejs and typescript installed and you are in the typescript project folder (*typescript-project-euler-100*), you can run all the solutions using the following commands in terminal/command line:

    npm install
    npm run build:run

or run them in parallel:

    npm run build:runParallel
or to test the solutions:

    npm run build:test

## How to run the go solutions?
If you have go and the required packages installed and you are in the go project folder (*go-project-euler-100*), you can run all the solutions using the following commands in terminal:

    go build
    ./project-euler.exe

or run tests for the solutions:

    go test

## Jenkins integration
The project has a Jenkins file that works for multi-branch configuration but it requires your Jenkins instance to have the follwoing plugins installed and configured correctly:
- git
- maven
- nodejs
- golang
- shiningpanda
- jacoco
- pipeline-maven
- pyenv-pipeline

The required configuration is mainly all about getting the run-times configured for the supported languages, for example:
- Having python3 installed (including pip3 and virtualenv)
- Having Go runtime
- Having Maven installation
- Having node installation

## Docker
An alternative build and run process is to use the docker files provided in each project to build the images and run the solutions as docker contianers. The advantage of using this procedure is that you only need to install docker engine to build and run the solution, and there will be no need to install custom dependencies for each project; you also won't have version conflicts.
To build and run using docker, if you have docker installed and you are inside the project folder:


    docker build -t <image-name> .
    docker run <image-name>

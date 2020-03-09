# project-euler-100
Solutions to the first one hundred problem in project Euler https://projecteuler.net/

## Why did I make this repository?
- Practicing algorithms
- Learning new programming languages
- Comparing the syntax and performance of different programming languages
- Practicing writing tests for different programming languages

## How to run the python solutions?

If you have python 3 installed and you are in the python project folder (*python-project-euler-100*), you can run all the solutions sequentially using the following command in the terminal/command line:

    python AllSolutions.py

or to run all of them in parallel in the terminal/command line:

    python AllSolutions.py -p

or a solution for a specific problem (*as example 'p001'*):

    python p001.py

You can also try writing your own solutions (write your own solve function for the problems) and test if they are acceptable using the tests:

    python AllSolutionsTest.py
## How to run the java solutions?
If you have a JDK with a version higher than or equal to 8, and Maven installed, and you are in the java project folder (*java-project-euler-100*), you can run all the solutions using the following commands in terminal/command line:

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

or to test the solutions:

    npm run build:test

## How to run the go solutions?
If you have go and the required packages installed and you are in the go project folder (*go-project-euler-100*), you can run all the solutions using the following commands in terminal:

    go build
    ./project-euler.exe

or run tests for the solutions:

    go test
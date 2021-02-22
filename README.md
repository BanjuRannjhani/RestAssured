# RestAssured
API Test Framework Example in Java language using Java libraries in
RestAssured and Cucumber (for BDD styled), along with Maven as a build tool.

## 1. Overview 

* This API test framework uses Java as a main language with 'RestAssured' and 'Cucumber' libraries 

* Test will run according to feature files - which are stored under 
./src/test/java/features folder. 

* Outputs (XML and html files) will be produced under ./target/cucumber-reports folder.

## 2. How to setup

Pull (clone) source code from Git as below command: 

```git
git clone git@github.com:BanjuRannjhani/RestAssured.git
```

Then tests can be run as mentioned in the next step.

> Note: Git client and Maven are required to setup and run
> * [Git Installation](https://www.atlassian.com/git/tutorials/install-git)
> * [Apache Maven Installation](https://maven.apache.org/download.cgi) 
--- 

## 3. How to run tests and generate reports
 
 Run CLI: "<code>mvn test -Dcucumber.options="--tags @regression"</code>" to build and execute tests

```batch
mvn test -Dcucumber.options="--tags @regression"
```

> Note: or just simply run <code> mvn test </code> to use default 'tags' defined in testRunner.java. 

This command will run only any scenario(in feature files) with tag as '@regression'.

Once finished, there will be reports in ./target/cucumber-reports/* folder.   

---
 Note: If error persists while excuting via command prompt, please install eclipse and trigger the runner class by importing the project. I was facing difficulties while trigger from my laptop1 as a maven command, whereas in my laptop2 it executed successfully. However launching via eclipse was successfull in both the machines.
 
## 4. Where to find reports

* XML file: ./target/cucumber-reports/Cucumber.xml
* HTML file: ./target/cucumber-reports/html/index.html

---
## 5. Key Pointers

I have used properties file for load token and parameters. So that user can change it accordignly. Maintainability: adding new tests and changing existing ones will be ease.

Report is generate based on html.        

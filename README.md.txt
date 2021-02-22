# **API Testing**
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
git clone https://github.com/BanjuRannjhani/RestAssured.git
```

Then tests can be run as mentioned in the next step.

> Note: Git client and Maven are required to setup and run
> * [Git Installation](https://www.atlassian.com/git/tutorials/install-git)
> * [Apache Maven Installation](http://maven.apache.org/install.html/) 
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

## 4. Where to find reports

* XML file: ./target/cucumber-reports/Cucumber.xml
* HTML file: ./target/cucumber-reports/html/index.html

---
## 5. Jenkins (CI/CD) Integration setup guideline
In your new Jenkins Job:

5.1) Under Git Integration: pull source code from github:
        
```git
git clone https://github.com/BanjuRannjhani/RestAssured.git
```

5.2) Add step: to run maven (build and run goal as 'test')

Two options:  

   * Run with the 'default' tags under <code> Cucumber.options {...} </code> in testRunner.java
        ```batch
        mvn test 
        ```  
   * Run with selective tags by passing parameters as below 
        
        ```batch
        mvn test -Dcucumber.options="--tags @regression"
        ```

5.3). If needed, JUnit and HTML reports can be used for further integration
* JUnit file: ./target/cucumber-reports/Cucumber.xml 
* HTML file: ./target/cucumber-reports/html/index.html

 

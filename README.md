# com.demoblaze
- WEB Automation Testing Using Java, cucumber and restAssured

- Test results monitoring tool cucumber reports.

- Environment : https://www.demoblaze.com/

### dependencies:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [cucumber-java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java)
- [cucumber-junit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- [rest-assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)

### Setting Up
These instructions will get you a copy of the project up and running on your local machine.

- *clone the repo:*
```shell
git clone  https://github.com/gokayeris/com.demoblaze.git
```

- *set project sdk as 11*

Running tests from terminal:
```shell
mvn verify --file pom.xml
```
- In this project I used github actions.

### About scenarios:

Automated scenarios are:
- Sign up 
- Forms Filling (ui)
- Login & Logout
- Add items to cart

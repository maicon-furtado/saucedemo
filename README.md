# Selenium Automated Tests Base

This is a maven project based on cucumber and selenium to run automated tests.

## How to compile the project ?
Run the following command
```
$ mvn clean package
```
Your executable jar will be in:
```
target/selenium-base-executable.jar
```

## How to run the tests ?
Set the following mandatory environmental variable:
```
HUB_URL=http://*IP_for_selenium_hub*:4444/wd/hub
```
The landing page will be by default https://www.saucedemo.com/, but it can be overwritten by using the following optional environmental variable:

```
LANDING_PAGE=http://www.saucedemo.com
```

Then, run the following command:
```
$ java -jar selenium-base.jar --threads 2
```

A cucumber-reports directory will be created with an html, json and xml reports
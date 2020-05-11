$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/withExample.feature");
formatter.feature({
  "line": 1,
  "name": "User Loging in to Publix Accounts",
  "description": "",
  "id": "user-loging-in-to-publix-accounts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login as a User with minimal logining credentials",
  "description": "",
  "id": "user-loging-in-to-publix-accounts;login-as-a-user-with-minimal-logining-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User should be on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-loging-in-to-publix-accounts;login-as-a-user-with-minimal-logining-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "user-loging-in-to-publix-accounts;login-as-a-user-with-minimal-logining-credentials;;1"
    },
    {
      "cells": [
        "lalithakolla@gmail.com",
        "Similacpublix1"
      ],
      "line": 12,
      "id": "user-loging-in-to-publix-accounts;login-as-a-user-with-minimal-logining-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login as a User with minimal logining credentials",
  "description": "",
  "id": "user-loging-in-to-publix-accounts;login-as-a-user-with-minimal-logining-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters  \"lalithakolla@gmail.com\" and \"Similacpublix1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User should be on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "WithExampleStepDefinition.user_is_on_the_Login_Page()"
});
formatter.result({
  "duration": 7283208565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lalithakolla@gmail.com",
      "offset": 14
    },
    {
      "val": "Similacpublix1",
      "offset": 43
    }
  ],
  "location": "WithExampleStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 112858700,
  "status": "passed"
});
formatter.match({
  "location": "WithExampleStepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 26002086,
  "status": "passed"
});
formatter.match({
  "location": "WithExampleStepDefinition.user_should_be_on_the_home_page()"
});
formatter.result({
  "duration": 5889692,
  "error_message": "java.lang.AssertionError: expected [Sign In] but found [Home | Publix Super Markets]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat org.testng.Assert.assertEquals(Assert.java:200)\r\n\tat stepdefinition.WithExampleStepDefinition.user_should_be_on_the_home_page(WithExampleStepDefinition.java:49)\r\n\tat ✽.And User should be on the home page(/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/withExample.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WithExampleStepDefinition.Close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
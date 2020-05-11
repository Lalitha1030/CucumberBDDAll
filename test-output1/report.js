$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/withExampleMultipleValues.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Create a new contact Scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User able to enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User able to click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is in new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters the contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003ccompany\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#\tThen Close the browser"
    }
  ],
  "line": 12,
  "name": "",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "company"
      ],
      "line": 13,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345",
        "Tom",
        "peter",
        "Amazon"
      ],
      "line": 14,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2"
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345",
        "David",
        "Disouza",
        "HP"
      ],
      "line": 15,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Free CRM Create a new contact Scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User able to enter \"batchautomation\" and \"Test@12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User able to click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is in new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters the contact details \"Tom\" and \"peter\" and \"Amazon\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 7551080838,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 15209318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batchautomation",
      "offset": 20
    },
    {
      "val": "Test@12345",
      "offset": 42
    }
  ],
  "location": "MultipleValuesStepDefinition.user_able_to_enter_and(String,String)"
});
formatter.result({
  "duration": 211261708,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.User_able_to_click_the_login_button()"
});
formatter.result({
  "duration": 48296867,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 17001743,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_in_new_contact_page()"
});
formatter.result({
  "duration": 3806740621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 33
    },
    {
      "val": "peter",
      "offset": 43
    },
    {
      "val": "Amazon",
      "offset": 55
    }
  ],
  "location": "MultipleValuesStepDefinition.user_enters_the_contact_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 2013311697,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Free CRM Create a new contact Scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User able to enter \"batchautomation\" and \"Test@12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User able to click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is in new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters the contact details \"David\" and \"Disouza\" and \"HP\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 6065865266,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 7779505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batchautomation",
      "offset": 20
    },
    {
      "val": "Test@12345",
      "offset": 42
    }
  ],
  "location": "MultipleValuesStepDefinition.user_able_to_enter_and(String,String)"
});
formatter.result({
  "duration": 245176436,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.User_able_to_click_the_login_button()"
});
formatter.result({
  "duration": 63176218,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 23707518,
  "status": "passed"
});
formatter.match({
  "location": "MultipleValuesStepDefinition.user_is_in_new_contact_page()"
});
formatter.result({
  "duration": 3516955309,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 33
    },
    {
      "val": "Disouza",
      "offset": 45
    },
    {
      "val": "HP",
      "offset": 59
    }
  ],
  "location": "MultipleValuesStepDefinition.user_enters_the_contact_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 2006787548,
  "status": "passed"
});
});
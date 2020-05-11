$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/dataTableMaps.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Creata a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-creata-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on CRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify the title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the user credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click login button in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify title of the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user iwill enter deal details",
  "rows": [
    {
      "cells": [
        "title",
        "company",
        "amount",
        "probability",
        "commission"
      ],
      "line": 13
    },
    {
      "cells": [
        "new test deal",
        "HP",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close the opened browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableStepDefinition.user_is_on_CRM_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableStepDefinition.verify_the_title_of_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DataTableStepDefinition.verify_title_of_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DataTableStepDefinition.close_the_opened_browser()"
});
formatter.result({
  "status": "skipped"
});
});
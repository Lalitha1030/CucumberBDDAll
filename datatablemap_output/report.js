$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/kollas/workspace1/CucumberBDD1/src/main/java/Features/dataTableMaps.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation using map",
  "description": "",
  "id": "deal-data-creation-using-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Creata a new deal using map and data table scenario",
  "description": "",
  "id": "deal-data-creation-using-map;free-crm-creata-a-new-deal-using-map-and-data-table-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should be on CRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify title of login page",
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
  "name": "Verify home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user able to move to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user will enter deal details",
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
        "new test deal1",
        "HP1",
        "3000",
        "40",
        "10"
      ],
      "line": 14
    },
    {
      "cells": [
        "new test deal2",
        "HP2",
        "2000",
        "50",
        "15"
      ],
      "line": 15
    },
    {
      "cells": [
        "new test deal3",
        "HP3",
        "1000",
        "60",
        "20"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "after saving the deal details close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableMapStepDefinition.user_should_be_on_CRM_login_page()"
});
formatter.result({
  "duration": 25557262692,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.verify_title_of_login_page()"
});
formatter.result({
  "duration": 17455397,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.user_enters_the_user_credentials(DataTable)"
});
formatter.result({
  "duration": 183580610,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.click_login_button_in_login_page()"
});
formatter.result({
  "duration": 68953318,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.verify_home_page_title()"
});
formatter.result({
  "duration": 20371273,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.user_able_to_move_to_new_deal_page()"
});
formatter.result({
  "duration": 6861274405,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.user_will_enter_deal_details(DataTable)"
});
formatter.result({
  "duration": 18484296347,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.after_saving_the_deal_details_close_the_browser()"
});
formatter.result({
  "duration": 1263867053,
  "status": "passed"
});
});
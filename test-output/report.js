$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Rupa Acharya/eclipse-workspace/EcommerceBDDFramework/src/main/java/featuers/CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Ecommerce create an account Feature",
  "description": "",
  "id": "ecommerce-create-an-account-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Ecommerce create account Scenario",
  "description": "",
  "id": "ecommerce-create-an-account-feature;ecommerce-create-account-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already in login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Title of log in page is Login My Store",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter email",
  "rows": [
    {
      "cells": [
        "test1212@example.com"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on Create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter personal details",
  "rows": [
    {
      "cells": [
        "Salman",
        "Khan",
        "testing",
        "Salman",
        "Khan",
        "1234 Main St",
        "Nowhere",
        "Taxes",
        "12345",
        "9723645896"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click on register",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.user_is_already_in_login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.Title_of_log_in_page_is_Login_My_Store()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.user_enter_email(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.user_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.user_enter_personal_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateAnAccountStepsDefinition.user_click_on_register()"
});
formatter.result({
  "status": "skipped"
});
});
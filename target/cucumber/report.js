$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateNewAccount.feature");
formatter.feature({
  "line": 3,
  "name": "Creating new account functionality validation",
  "description": "",
  "id": "creating-new-account-functionality-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to create new account",
  "description": "",
  "id": "creating-new-account-functionality-validation;user-should-be-able-to-create-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should able to land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Bank and Cash Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Clicks on New Account Button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should Land on Accounts Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters AccountTitle as \"\u003cAccountTitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters Description as \"\u003cDescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters InitialBalance as \"\u003cInitalBalance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters AccountNumber as \"\u003cAccountNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters ContactPerson as \"\u003cContactPerson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters PhoneNumber as \"\u003cPhoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User clicks on SubmitButton",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "creating-new-account-functionality-validation;user-should-be-able-to-create-new-account;",
  "rows": [
    {
      "cells": [
        "UserName",
        "",
        "Password",
        "",
        "AccountTitle",
        "",
        "Description",
        "",
        "InitalBalance",
        "",
        "AccountNumber",
        "",
        "ContactPerson",
        "",
        "PhoneNumber"
      ],
      "line": 25,
      "id": "creating-new-account-functionality-validation;user-should-be-able-to-create-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "",
        "abc123",
        "",
        "SavingAccount",
        "",
        "AutoLoan",
        "",
        "$500,000",
        "",
        "765676",
        "",
        "Jack",
        "",
        "765676"
      ],
      "line": 26,
      "id": "creating-new-account-functionality-validation;user-should-be-able-to-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "User should be able to create new account",
  "description": "",
  "id": "creating-new-account-functionality-validation;user-should-be-able-to-create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"abc123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should able to land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Bank and Cash Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Clicks on New Account Button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should Land on Accounts Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters AccountTitle as \"SavingAccount\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters Description as \"AutoLoan\"",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters InitialBalance as \"$500,000\"",
  "matchedColumns": [
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters AccountNumber as \"765676\"",
  "matchedColumns": [
    10
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters ContactPerson as \"Jack\"",
  "matchedColumns": [
    12
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters PhoneNumber as \"765676\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User clicks on SubmitButton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 3327947300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefination.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3108440600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefination.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3068516000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 6633693700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_should_able_to_land_on_dashboard_page()"
});
formatter.result({
  "duration": 36097800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_bank_and_cash_button()"
});
formatter.result({
  "duration": 3081053900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_new_account_button()"
});
formatter.result({
  "duration": 3394372300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_should_land_on_accounts_page()"
});
formatter.result({
  "duration": 42172900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SavingAccount",
      "offset": 29
    }
  ],
  "location": "StepDefination.user_enters_accountTitle_as(String)"
});
formatter.result({
  "duration": 3099501000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutoLoan",
      "offset": 28
    }
  ],
  "location": "StepDefination.user_enters_description_as(String)"
});
formatter.result({
  "duration": 3104466200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$500,000",
      "offset": 31
    }
  ],
  "location": "StepDefination.user_enters_initialBalance_as(String)"
});
formatter.result({
  "duration": 3121582300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "765676",
      "offset": 30
    }
  ],
  "location": "StepDefination.user_enters_accountNumber_as(String)"
});
formatter.result({
  "duration": 3110067700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 30
    }
  ],
  "location": "StepDefination.user_enters_contactPerson_as(String)"
});
formatter.result({
  "duration": 3114592700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "765676",
      "offset": 28
    }
  ],
  "location": "StepDefination.user_enters_phoneNumber_as(String)"
});
formatter.result({
  "duration": 3104503600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_submitButton()"
});
formatter.result({
  "duration": 4040172000,
  "status": "passed"
});
formatter.after({
  "duration": 859740100,
  "status": "passed"
});
});
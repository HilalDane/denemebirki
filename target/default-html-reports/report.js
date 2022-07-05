$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/email.feature");
formatter.feature({
  "name": "Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to send Email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@start"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.LoginStepDef.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill the empty field",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_fill_the_empty_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the Senden button",
  "keyword": "And "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_click_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to send Email",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_should_be_able_to_send_Email()"
});
formatter.result({
  "status": "passed"
});
});
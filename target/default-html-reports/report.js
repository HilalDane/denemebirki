$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/anfragen.feature");
formatter.feature({
  "name": "user should kontakt with Imad",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@3"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to contact with Imad with Jetzt Afragen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3"
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
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Jetzt Anfragen button",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.theUserClicksJetztAnfragenButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the kontakt page",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_should_be_on_the_kontakt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to contact with Imad with Kontakt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3"
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
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Kontaktt button",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_clicks_Kontaktt_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the kontakt page",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_should_be_on_the_kontakt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to contact with Imad with Fragen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3"
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
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Fragen button",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_clicks_Fragen_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the kontakt page",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_should_be_on_the_kontakt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/email.feature");
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
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_on_the_login_page()"
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
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/kontakt.feature");
formatter.feature({
  "name": "Contact with Kontakt Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to send a Message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4"
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
  "location": "tests.consulting.stepdefinitions.EmailStepDef.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Kontakt button",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_clicks_Kontakt_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill the empty fields",
  "keyword": "And "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_fill_the_empty_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to send Emaill",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.KontaktStepDef.the_user_should_be_able_to_send_Emaill()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
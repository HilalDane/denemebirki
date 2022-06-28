$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/youtube.feature");
formatter.feature({
  "name": "User should be able to listen the music",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sevda Cicegi",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@youtube"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user on the Youtube main page",
  "keyword": "Given "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.YoutubeStepDefs.the_user_on_the_Youtube_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Sevda Cicegi\"",
  "keyword": "When "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.YoutubeStepDefs.the_user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to listen this music",
  "keyword": "Then "
});
formatter.match({
  "location": "tests.consulting.stepdefinitions.YoutubeStepDefs.the_user_should_be_able_to_listen_this_music()"
});
formatter.result({
  "status": "passed"
});
});
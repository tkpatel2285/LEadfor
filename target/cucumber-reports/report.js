$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFiles/login.feature");
formatter.feature({
  "line": 4,
  "name": "user should be able to login successfully",
  "description": "",
  "id": "user-should-be-able-to-login-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 12102431552,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user  enter valid username and password click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user see welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 84067686,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterValidUsernameAndPasswordClickOnLoginButton()"
});
formatter.result({
  "duration": 20955,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSeeWelcomeMessage()"
});
formatter.result({
  "duration": 2941780116,
  "status": "passed"
});
formatter.after({
  "duration": 597447678,
  "status": "passed"
});
});
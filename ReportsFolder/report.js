$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/LoginPage/Login.feature");
formatter.feature({
  "name": "Verify the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Verify the login functionality with valid user name and password.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I login the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefination.loginApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on hamburger menu icon",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefination.clickOnMenuIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I veirfy the logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefination.verifyLogoutLink()"
});
formatter.result({
  "status": "passed"
});
});
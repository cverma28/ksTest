package stepDefination
import org.padtronics.login.LoginApplication

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


class LoginPageStepDefination {
	 
	@Given("I login the application")
	def loginApplication() {
		LoginApplication.loginApp()
	}

	@When("I click on hamburger menu icon")
	def clickOnMenuIcon() {
		WebUI.click(findTestObject('HomePageObject/hamburgerMenuIcon'))
	}

	@Then("I veirfy the logout link")
	def verifyLogoutLink() {
		WebUI.verifyElementVisible(findTestObject('LoginPageObject/logoutLink'))
	}
}
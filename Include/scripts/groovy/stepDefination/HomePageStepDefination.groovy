package stepDefination
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.padtronics.common.CommonUtility

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.CSS as CSS
import common.CommonValue as CommonValue
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class HomePageStepDefination {

	@Given("I navigated to the home page")
	def navigateToHomePage() {
	}

	@When("I wait till the page load")
	def waitTillPageLoad() {
	}

	@Then("I verify the controls on home page")
	def verifyTheContent() {
		CommonUtility.verifyElementPresent(findTestObject('HomePageObject/mainBannerText'))
		CommonUtility.verifyElementPresent(findTestObject('HomePageObject/subBannerText'))
		CommonUtility.verifyElementPresent(findTestObject('HomePageObject/makeAppointmentButton'))
		WebUI.verifyElementText(findTestObject('HomePageObject/makeAppointmentButton'), CommonValue.APPOINTMENT_BUTTON_TEXT,FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I verify the css value of the controls on home page")
	def verifyTheCssValue(){
		String color=null
		TestObject mainBanner = findTestObject('HomePageObject/mainBannerText')

		if(CommonUtility.getBrowserName()=="chrome")
			color=CommonValue.WHITE_COLOR_CHROME;
		else
			color=CommonValue.WHITE_COLOR_FF;

		WebUI.verifyEqual(color, CommonUtility.getCssValue(mainBanner,
				CSS.name.COLOR.value))
		WebUI.verifyEqual(CommonValue.MAIN_BANNER_FONT, CommonUtility.getCssValue(
				mainBanner, CSS.name.FONT_SIZE.value))
		WebUI.verifyEqual(CommonValue.FONT_WEIGHT_400, CommonUtility.getCssValue(mainBanner,
				CSS.name.FONT_WEIGHT.value))
		WebUI.verifyEqual(CommonValue.MAIN_BANNER_FONT_FAMILY, CommonUtility.getCssValue(
				mainBanner, CSS.name.FONT_FAMILY.value))

		TestObject subBanner = findTestObject('Object Repository/HomePageObject/subBannerText')
		if(CommonUtility.getBrowserName()=="chrome")
			color=CommonValue.BLUE_COLOR_CHROME;
		else
			color=CommonValue.BLUE_COLOR_FF;

		WebUI.verifyEqual(color, CommonUtility.getCssValue(subBanner, CSS.name.COLOR.value),
				FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(CommonValue.SUB_BANNER_FONT, CommonUtility.getCssValue(
				subBanner, CSS.name.FONT_SIZE.value), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(CommonValue.FONT_WEIGHT_500, CommonUtility.getCssValue(subBanner,
				CSS.name.FONT_WEIGHT.value), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(CommonValue.SUB_BANNER_FONT_FAMILY, CommonUtility.getCssValue(
				subBanner, CSS.name.FONT_FAMILY.value), FailureHandling.CONTINUE_ON_FAILURE)
	}
}
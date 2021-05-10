package org.padtronics.login

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.padtronics.common.CommonUtility

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class LoginApplication {

	@Keyword
	public static void loginApp(){
		WebUI.click(CommonUtility.waitForElement(findTestObject('Object Repository/HomePageObject/hamburgerMenuIcon')))
		WebUI.click(CommonUtility.waitForElement(findTestObject('Object Repository/HomePageObject/loginLink')))
		CommonUtility.waitForPageLoad()
		WebUI.setText(findTestObject('Object Repository/LoginPageObject/usernameField'),GlobalVariable.userName)
		WebUI.setText(findTestObject('Object Repository/LoginPageObject/passwordField'), GlobalVariable.password)
		WebUI.click(CommonUtility.waitForElement(findTestObject('Object Repository/LoginPageObject/loginButton')))
		CommonUtility.waitForPageLoad()
	}
}

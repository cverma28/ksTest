import org.padtronics.common.CommonUtility

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TearDown {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		if(testCaseContext.getTestCaseStatus()=="FAILED")
			WebUI.takeFullPageScreenshot("C:/Users/lenovo/Katalon Studio/TestProject/Screenshots/"+testCaseContext.testCaseId+CommonUtility.getDateAndTime()+".png")
		CustomKeywords.'org.padtronics.browser.Browser.closeBrowser'()
		//CommonUtility.excelUpdate(testCaseContext.testCaseId.substring(testCaseContext.testCaseId.lastIndexOf('/') + 1), testCaseContext.getTestCaseStatus())
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		//Close the opened connection. Like - File stream, database
	}
}
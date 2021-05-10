import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.padtronics.common.CommonUtility as CommonUtility
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import common.CSS as CSS
import common.CommonValue as CommonValue

String color = null

TestObject mainBanner = findTestObject('HomePageObject/mainBannerText')
//web=abc
if (CommonUtility.getBrowserName() == 'chrome') {
    color = CommonValue.WHITE_COLOR_CHROME
	// web =abcd
	//1
} else {
    color = CommonValue.WHITE_COLOR_FF
	//1
	//2
}

WebUI.verifyEqual(color, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(mainBanner, CSS.name.COLOR.value), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(CommonValue.MAIN_BANNER_FONT, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(mainBanner, 
        CSS.name.FONT_SIZE.value), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(CommonValue.FONT_WEIGHT_400, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(mainBanner, 
        CSS.name.FONT_WEIGHT.value), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(CommonValue.MAIN_BANNER_FONT_FAMILY, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(
        mainBanner, CSS.name.FONT_FAMILY.value), FailureHandling.CONTINUE_ON_FAILURE)

TestObject subBanner = findTestObject('Object Repository/HomePageObject/subBannerText')

if (CommonUtility.getBrowserName() == 'chrome') {
    color = CommonValue.BLUE_COLOR_CHROME
} else {
    color = CommonValue.BLUE_COLOR_FF
}

WebUI.verifyEqual(color, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(subBanner, CSS.name.COLOR.value), 
    FailureHandling.OPTIONAL)

WebUI.verifyEqual(CommonValue.SUB_BANNER_FONT, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(subBanner, 
        CSS.name.FONT_SIZE.value), FailureHandling.OPTIONAL)

WebUI.verifyEqual(CommonValue.FONT_WEIGHT_500, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(subBanner, 
        CSS.name.FONT_WEIGHT.value), FailureHandling.OPTIONAL)

WebUI.verifyEqual(CommonValue.SUB_BANNER_FONT_FAMILY, CustomKeywords.'org.padtronics.common.CommonUtility.getCssValue'(subBanner, 
        CSS.name.FONT_FAMILY.value), FailureHandling.OPTIONAL)


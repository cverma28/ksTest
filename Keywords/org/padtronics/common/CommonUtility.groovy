package org.padtronics.common
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.apache.commons.lang.RandomStringUtils
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class CommonUtility {

	@Keyword
	public static void waitForPageLoad(){
		WebUI.waitForPageLoad(GlobalVariable.pageLoad)
	}

	@Keyword
	public static TestObject waitForElement(TestObject object){
		WebUI.waitForElementVisible(object, GlobalVariable.timeOut)
		WebUI.waitForElementClickable(object, GlobalVariable.timeOut)
		return object
	}

	@Keyword
	public static void verifyElementPresent(TestObject object){
		WebUI.verifyElementPresent(object, GlobalVariable.timeOut)
		WebUI.verifyElementVisible(object)
	}

	@Keyword
	public void verifyElementAttribute(TestObject object, String attribute, String attributeValue){
		WebUI.verifyElementAttributeValue(object, attribute, attributeValue, GlobalVariable.timeOut)
	}

	@Keyword
	public static String getCssValue(TestObject object, String cssValue){
		return WebUI.getCSSValue(object, cssValue)
	}

	public static String getBrowserName(){
		return DriverFactory.getExecutedBrowser().getName()
	}

	public static String generateRandomValue(){
		return RandomStringUtils.random(10, true, true);
	}

	public static getDateAndTime(){
		return DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
	}

	public static excelUpdate(String testName, String status){
		String cellValue = null;
		File file =    new File("C:/Users/lenovo/Katalon Studio/TestProject/ExcelStatus/status.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i = 1;i<=rowCount;i++){
			cellValue = sheet.getRow(i).getCell(0).getStringCellValue();
			if(cellValue.equalsIgnoreCase(testName)){
				XSSFCell cell = sheet.getRow(i).createCell(1);
				if(status == "PASSED")
					cell.setCellValue("PASSED")

				else if (status == "FAILED")
					cell.setCellValue("FAILED")

				else if (status == "skip")
					cell.setCellValue("skip")

				else
					cell.setCellValue("no update")
			}
		}
		FileOutputStream outputStream = new FileOutputStream("C:/Users/lenovo/Katalon Studio/TestProject/ExcelStatus/status.xlsx");
		book.write(outputStream);
	}
}
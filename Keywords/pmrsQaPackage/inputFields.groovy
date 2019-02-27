package pmrsQaPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class inputFields {
	
	@Keyword
	def inputUser(String user1,String pass1)
	{
		enterUser(user1);
		enterPass(pass1)
	}

	
	static void enterUser(String user)
	{
		WebUI.setText(findTestObject('Object Repository/Finding No. 21/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), user)
	}
	static void enterPass(String pass)
	{
		WebUI.setText(findTestObject('Object Repository/Finding No. 21/Page_OrangeHRM/input_Username_txtPassword'), pass)
	}
	
	
}

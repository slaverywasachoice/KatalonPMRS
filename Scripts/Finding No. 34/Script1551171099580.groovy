import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pmrsqa.eschost2.com/')

WebUI.setText(findTestObject('Object Repository/Finding No. 34/Page_PMRS Web Application/input_PATIENT_mat-input-0'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Finding No. 34/Page_PMRS Web Application/input_NICKNAME_mat-input-1'), 'test1')

WebUI.click(findTestObject('Object Repository/Finding No. 34/Page_PMRS Web Application/div_SELECT DATE  TIME_mat-sele'))

WebUI.click(findTestObject('Object Repository/Finding No. 34/Page_PMRS Web Application/div_    096'))

WebUI.click(findTestObject('Object Repository/Finding No. 34/Page_PMRS Web Application/span_CONFIRM'))

WebUI.closeBrowser()


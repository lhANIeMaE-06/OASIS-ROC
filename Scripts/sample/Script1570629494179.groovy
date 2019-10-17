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

WebUI.openBrowser('https://qa.medisource.com')

WebUI.delay(8)

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.delay(2)

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(8)

WebUI.navigateToUrl('https://qa.medisource.com/emergency/services')

WebUI.delay(5)

WebUI.click(findTestObject('Medical Resources/Emergency Services/new_emergency'))

WebUI.delay(2)

WebUI.click(findTestObject('Category Dropdown/Drop'))

WebUI.delay(2)

WebUI.click(findTestObject('Category Dropdown/sample_cat'))


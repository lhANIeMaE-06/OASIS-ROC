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

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/3954BDC7-F47E-4865-B80A-8DE5BAE46D23/129C9195-33AC-4805-8507-D48823A8A110/2019/oasis/medication/roc/32E5243C-DE23-46D1-84D9-20B4CD5A6CAC/3954BDC7-F47E-4865-B80A-8DE5BAE46D23')

WebUI.delay(10)

WebUI.comment('M2001')

WebUI.check(findTestObject('OASIS ROC/Medication/M2001_NA'))

WebUI.check(findTestObject('OASIS ROC/Medication/M2001_0'))

WebUI.check(findTestObject('OASIS ROC/Medication/M2001_yes'))

WebUI.delay(2)

WebUI.comment('M2003')

WebUI.check(findTestObject('OASIS ROC/Medication/M2003_no'))

WebUI.check(findTestObject('OASIS ROC/Medication/M2003_yes'))

WebUI.delay(2)

WebUI.comment('')


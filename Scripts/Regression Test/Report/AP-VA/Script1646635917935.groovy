import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/AP/input_www.irs-software.com_cbpCallbacktxtClientId (1)'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/AP/input_Invalid value_cbpCallbacktxtUserName (1)'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/td_Invalid value_dxic (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/RPT/AP/input_Invalid value_cbpCallbacktxtPassword (1)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/span_Login (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/AP/span_Reports (1)'), 5)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/span_Reports (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/AP/a_Account Payable'), 5)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/a_Account Payable'))

WebUI.click(findTestObject('Deployment test/RPT/AP/div_Vendor Aging'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/div_Preview Report'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/div_Preview'))

WebUI.delay(20)
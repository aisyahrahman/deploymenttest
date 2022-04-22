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

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/td_Invalid value_dxic'))

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/input_Invalid value_cbpCallbacktxtUserName'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/td_Invalid value_dxic_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/div_Login'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/a_Reports'), 5)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/a_Reports'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/a_Account Payable'), 5)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/a_Account Payable'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/div_Vendor Statement Balance'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/div_Preview Report'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/AP/VSB/div_Preview'))

WebUI.delay(30)


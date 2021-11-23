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

WebUI.navigateToUrl('http://sit.irsalaya.com/Account/Login.aspx')

WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Object Repository/login/input_www.irs-software.com_cbpCallbacktxtClientId'), 'Client')

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Object Repository/login/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.sendKeys(findTestObject('login/input_www.irs-software.com_cbpCallbacktxtClientId'), 'Client')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('login/input_www.irs-software.com_cbpCallbacktxtClientId'), 'UAT')

WebUI.sendKeys(findTestObject('login/input_www.irs-software.com_cbpCallbacktxtClientId'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('login/input_www.irs-software.com_cbpCallbacktxtClientId'), Keys.chord(Keys.CONTROL, 'c'))

 WebUI.sendKeys(findTestObject('login/input_Invalid value_cbpCallbacktxtUserName'), Keys.chord(Keys.CONTROL, 'v'))


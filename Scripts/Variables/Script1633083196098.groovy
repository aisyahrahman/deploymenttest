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

//String clientid = 'uat'
//String username = 'admin'
//String password = '123'

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Variables/input_www.irs-software.com_cbpCallbacktxtClientId'), clientid)

WebUI.setText(findTestObject('Object Repository/Variables/input_Invalid value_cbpCallbacktxtUserName'), username)

WebUI.click(findTestObject('Object Repository/Variables/td_Invalid value_dxic'))

WebUI.setText(findTestObject('Object Repository/Variables/input_Invalid value_cbpCallbacktxtPassword'), password)

WebUI.click(findTestObject('Object Repository/Variables/span_Login'))


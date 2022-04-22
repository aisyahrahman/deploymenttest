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

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/IV/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/RPT/IV/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/RPT/IV/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/div_Login'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/IV/a_Reports'), 0)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/a_Reports'))

WebUI.scrollToElement(findTestObject('Object Repository/Deployment test/RPT/IV/a_Inventory'), 0)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/a_Inventory'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/span_Stock Card'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/img_Loading_ctl00_MainContent_ReportFrameWorkInventory_cbpReport_cbpReportFrameworkParameter_rpReportFramework_formReportFrameworkParameter_cbItem_cbItem_Filter_B-1Img'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/td_Filter By Selection'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/img_From_ctl00_MainContent_ReportFrameWorkI_20417c'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/td_01234'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/div_Preview Report'))

WebUI.click(findTestObject('Object Repository/Deployment test/RPT/IV/div_Preview'))

WebUI.delay(20)


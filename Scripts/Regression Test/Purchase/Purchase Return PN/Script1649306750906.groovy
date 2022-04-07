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

WebUI.setText(findTestObject('Object Repository/Deployment test/Purchase Return/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/Purchase Return/input_Invalid value_cbpCallbacktxtUserName'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/Purchase Return/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/span_Purchase_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/a_Purchase Return'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/Purchase Return/img_Clear_ctl00_MainContent_PurchaseReturns1_cpnlPurchaseReturns_formPurchaseReturns_gvPurchaseReturns_header16_btnCheckAll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/img_Loading_ctl00_MainContent_PurchaseReturnDetail1_cbpPurchaseReturn_cbpPRHeader_ASPxRoundPanel1_formPRHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/td_S02-AGROMAS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/img_Loading_ctl00_MainContent_PurchaseRetur_f88121'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/td_AMPANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/img_Additional Notes_ctl00_MainContent_Purc_2c975d'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/td_SAFETY PIN'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Purchase Return/div_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/Purchase Return/PN/span_Post  New'))

WebUI.delay(20)


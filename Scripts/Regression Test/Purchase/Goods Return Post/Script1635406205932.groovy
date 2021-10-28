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

WebUI.setText(findTestObject('Object Repository/Deployment test/Goods Return Post/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/Goods Return Post/input_Invalid value_cbpCallbacktxtUserName'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/Goods Return Post/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/div_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/span_Purchase'))

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/a_Goods Return'))

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/img_Clear_ctl00_MainContent_PurchaseGoodReturns1_cpnlPurchaseGoodReturns_formPurchaseGoodReturns_gvPurchaseGoodReturns_header16_btnCheckAll'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/img_Loading_ctl00_MainContent_PurchaseGoodReturnDetail1_cbpPurchaseGoodReturn_cbpPGTHeader_ASPxRoundPanel1_formPGTHeader_cbVendor_cbVendor_B1Img'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/td_0001'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/div_OK'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/img_Copy From_ctl00_MainContent_PurchaseGoo_6ed9f9'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/span_Goods Receive'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/td_Warehouse_dxgvCommandColumn_iOS dx-nowra_94c735'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/span_OK'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Deployment test/Goods Return Post/div_Post'))


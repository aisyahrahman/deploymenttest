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

WebUI.setText(findTestObject('Object Repository/Deployment test/goods receive/input_www.irs-software.com_cbpCallbacktxtClientId (1) (1)'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/goods receive/input_Invalid value_cbpCallbacktxtUserName (1) (1)'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/td_Invalid value_dxic (1) (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/goods receive/input_Invalid value_cbpCallbacktxtPassword (1) (1)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/span_Login (1) (1)'))

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/span_Purchase_dxWeb_nbExpand_iOS (1) (1)'))

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/a_Goods Receive (1) (1)'))

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/img_Clear_ctl00_MainContent_PurchaseGoodReceives1_cpnlPurchaseGoodReceives_formPurchaseGoodReceives_gvPurchaseGoodReceives_header16_btnCheckAll'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/img_Loading_ctl00_MainContent_PurchaseGoodReceiveDetail1_cbpPurchaseGoodReceive_cbpPGRHeader_ASPxRoundPanel1_formPGRHeader_cbVendor_cbVendor_B1Img'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/td_S02-AGROMAS'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/goods receive/input__ctl00MainContentPurchaseGoodReceiveD_1b6e3f'), 
    'test123')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/img_Loading_ctl00_MainContent_PurchaseGoodR_e480cc'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/goods receive/td_AMPANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/goods receive/img_Additional Notes_ctl00_MainContent_Purc_ccf0e6'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Deployment test/goods receive/td_SAFETY PIN'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/goods receive/span_Post'))


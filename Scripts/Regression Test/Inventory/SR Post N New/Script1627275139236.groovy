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

Date todaysDate = new Date();
def seq = todaysDate.format("dd-MMM-yyyy hh:mm:ss")

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Deployment test/SR2/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.click(findTestObject('Deployment test/SR2/td_Invalid value_dxic_1'))

WebUI.setText(findTestObject('Deployment test/SR2/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Deployment test/SR2/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Deployment test/SR2/input_Invalid value_cbpCallbacktxtPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Deployment test/SR2/span_Login'))

WebUI.click(findTestObject('Deployment test/SR2/span_Inventory_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Deployment test/SR2/a_Stock Receive'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SR2/img_Clear_ctl00_MainContent_StockReceiveHeader_cbpStockReceiveHdr_formC_gvStockReceive_header12_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SR2/img_Loading_ctl00_MainContent_StockReceiveDetail_cbpStockReceiveDetails_ASPxRoundPanel1_formStockReceive_cbWarehouse_cbWarehouse_B-1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SR2/td_KLEBANG'))

WebUI.delay(5)

WebUI.setText(findTestObject('Deployment test/SR2/input__ctl00MainContentStockReceiveDetailcb_01ef97'),seq)

WebUI.click(findTestObject('Deployment test/SR2/img_OK_ctl00_MainContent_StockReceiveDetail_30c0fe'))

WebUI.delay(0)

WebUI.click(findTestObject('Deployment test/SR2/td_100001'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SR2/span_OK'))

WebUI.click(findTestObject('Deployment test/SR2/span_Post  New'))
WebUI.delay(20)

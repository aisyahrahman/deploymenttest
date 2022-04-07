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

WebUI.navigateToUrl('https://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Deployment test/STR/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/STR/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/STR/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/STR/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/STR/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/STR/span_Inventory_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Object Repository/Deployment test/STR/a_Stock Transfer Request'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/img_Clear_ctl00_MainContent_InventoryTransferRequest1_cpnlInventoryTransferRequest_formInventoryTransferRequest_gvInventoryTransferRequest_header14_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/img_Loading_ctl00_MainContent_InventoryTransferRequestDetail1_cbpInventoryTransferRequestDetails_ASPxRoundPanel1_formInventoryTransferRequest_cbFromWarehouse_cbWarehouse_B-1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/td_AMPANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/img_Loading_ctl00_MainContent_InventoryTran_169ad1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/td_BERCHAM RAYA'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/STR/input__ctl00MainContentInventoryTransferReq_880720'),seq)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/td_Additional Notes_ctl00_MainContent_Inven_607266'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/td_ADULT PREVAIL L 10PCS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/STR/span_Post'))

WebUI.delay(20)

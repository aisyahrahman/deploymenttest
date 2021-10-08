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

WebUI.setText(findTestObject('Object Repository/STR3/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.setText(findTestObject('Object Repository/STR3/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/STR3/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/STR3/input_Invalid value_cbpCallbacktxtPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/STR3/span_Login'))

WebUI.click(findTestObject('Object Repository/STR3/span_Inventory_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Object Repository/STR3/a_Stock Transfer Request'))

WebUI.click(findTestObject('Object Repository/STR3/img_Clear_ctl00_MainContent_InventoryTransferRequest1_cpnlInventoryTransferRequest_formInventoryTransferRequest_gvInventoryTransferRequest_header13_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/input_Loading_ctl00MainContentInventoryTransferRequestDetail1cbpInventoryTransferRequestDetailsASPxRoundPanel1formInventoryTransferRequestcbFromWarehousecbWarehouse'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/td_AMPANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/img_Loading_ctl00_MainContent_InventoryTran_169ad1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/td_BERCHAM RAYA'))

WebUI.click(findTestObject('Object Repository/STR3/table_Reason                               _daba10'))

WebUI.setText(findTestObject('Object Repository/STR3/input__ctl00MainContentInventoryTransferReq_880720'), 'test')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/img_Additional Notes_ctl00_MainContent_Inve_4e000e'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/td_SAFETY PIN'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/STR3/span_OK'))

WebUI.delay(6)

WebUI.click(findTestObject('Deployment test/STR (1)/span_Save Draft'))


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

WebUI.setText(findTestObject('Deployment test/ST/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.setText(findTestObject('Deployment test/ST/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Deployment test/ST/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Deployment test/ST/input_Invalid value_cbpCallbacktxtPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Deployment test/ST/span_Login'))

WebUI.click(findTestObject('Deployment test/ST/a_Inventory'))

WebUI.click(findTestObject('Deployment test/ST/a_Stock Transfer'))

WebUI.click(findTestObject('Deployment test/ST/img_Clear_ctl00_MainContent_InventoryTransfer1_cpnlInventoryTransfer_formInventoryTransfer_gvInventoryTransfer_header13_Add'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/img_Loading_ctl00_MainContent_InventoryTransferDetail1_cbpInventoryTransferDetails_ASPxRoundPanel1_formInventoryTransfer_cbFromWarehouse_cbWarehouse_B-1Img'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/td_AMPANG'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/td_Loading_ctl00_MainContent_InventoryTrans_8c15a6'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/td_BERCHAM RAYA'))

WebUI.delay(4)

WebUI.setText(findTestObject('Deployment test/ST/input__ctl00MainContentInventoryTransferDet_15fd43'), 'test')

WebUI.click(findTestObject('Deployment test/ST/img_Additional Notes_ctl00_MainContent_Inve_79c398'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/td_30G JINTAN MANIS'))

WebUI.click(findTestObject('Deployment test/ST/span_OK'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/ST/span_Post  New'))


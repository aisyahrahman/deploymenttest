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

WebUI.setText(findTestObject('Deployment test/SA/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.setText(findTestObject('Deployment test/SA/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Deployment test/SA/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Deployment test/SA/input_Invalid value_cbpCallbacktxtPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Deployment test/SA/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SA/span_Inventory_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Deployment test/SA/a_Stock Adjustment'))

WebUI.click(findTestObject('Deployment test/SA/img_Clear_ctl00_MainContent_InventoryAdjustment_cpnlInventoryAdjustment_formInventoryAdjustment_gvInventoryAdjustment_header13_Add (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Deployment test/SA/img_Loading_ctl00_MainContent_InventoryAdjustmentDetail1_cbpInventoryAdjustmentDetails_ASPxRoundPanel1_formInventoryAdjustment_cbWarehouse_cbWarehouse_B-1Img'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/SA/td_KLEBANG'))

WebUI.click(findTestObject('Deployment test/SA/img_Loading_ctl00_MainContent_InventoryAdju_b2bfb5'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/SA/td_MINUMAN PAPAN BUKA UNTUK JUAL LOOSE'))

WebUI.delay(4)

WebUI.setText(findTestObject('Deployment test/SA/input_Description_ctl00MainContentInventory_4253b0'), 'in/out')

WebUI.click(findTestObject('Deployment test/SA/img_Cancel_ctl00_MainContent_InventoryAdjus_44edc4'))

WebUI.click(findTestObject('Deployment test/SA/td_1KG MX (TULANG KAMBING) RIZQAN'))

WebUI.click(findTestObject('Deployment test/SA/span_OK'))

WebUI.delay(4)

WebUI.click(findTestObject('Deployment test/SA/span_Post  New'))


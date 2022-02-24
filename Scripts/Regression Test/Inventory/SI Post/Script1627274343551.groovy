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

WebUI.setText(findTestObject('Deployment test/SI/input_www.irs-software.com_cbpCallbacktxtClientId'), 'uat')

WebUI.click(findTestObject('Deployment test/SI/input_Invalid value_cbpCallbacktxtUserName'))

WebUI.setText(findTestObject('Deployment test/SI/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Deployment test/SI/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Deployment test/SI/input_Invalid value_cbpCallbacktxtPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Deployment test/SI/span_Login'))

WebUI.click(findTestObject('Deployment test/SI/span_Inventory_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Deployment test/SI/a_Stock Issue'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SI/img_Clear_ctl00_MainContent_StockIssueHeader_cbpStockIssueHdr_formC_gvStockIssue_header12_Add'))

WebUI.delay(10)

WebUI.click(findTestObject('Deployment test/SI/td_Loading_ctl00_MainContent_StockIssueDetail_cbpStockIssueDetails_ASPxRoundPanel1_formStockIssue_cbWarehouse_cbWarehouse_B-1'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SI/td_ST18'))

WebUI.delay(5)

WebUI.setText(findTestObject('Deployment test/SI/input__ctl00MainContentStockIssueDetailcbpS_3d09fe'), 'test')

WebUI.click(findTestObject('Deployment test/SI/img_Additional Notes_ctl00_MainContent_Stoc_0b0e2a'))

WebUI.click(findTestObject('Deployment test/SI/td_500G AYAM KISAR RIZQAN'))

WebUI.click(findTestObject('Deployment test/SI/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/SI/span_Post'))

WebUI.delay(10)

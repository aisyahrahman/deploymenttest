import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setText(findTestObject('Object Repository/Deployment test/Cash Purchase Post/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/Cash Purchase Post/input_Invalid value_cbpCallbacktxtUserName'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/Cash Purchase Post/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/span_Purchase'))

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/a_Cash Purchase'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/img_Clear_ctl00_MainContent_CashPurchase1_cpnlCashPurchase_formCashPurchase_gvCashPurchase_header16_btnCheckAll'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/img_Loading_ctl00_MainContent_CashPurchaseDetail_cbpCashPurchase_cbpCPHeader_ASPxRoundPanel1_formCPHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_S02-AGROMAS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/div_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/Cash Purchase Post/input__ctl00MainContentCashPurchaseDetailcb_5c1e14'), 
    'DEP03')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/img_Loading_ctl00_MainContent_CashPurchaseD_ca3425'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_AMPANG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/img_Additional Notes_ctl00_MainContent_Cash_31d997'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_SAFETY PIN'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/div_Post'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/img_MultiPayment_ctl00_MainContent_CashPurc_3f7e12'))

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_Loading_ctl00_MainContent_CashPurchaseDetail_cbpCashPurchase_pcCPMultipayment_formCPMultipayment_gvCPMultiPayment_DXEditor3_B-1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/td_CASH'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/Cash Purchase Post/div_OK_1_2'))


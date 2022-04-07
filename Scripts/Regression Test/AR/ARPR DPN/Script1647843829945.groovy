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

WebUI.navigateToUrl('https://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARPR/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARPR/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AR/ARPR/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/span_Account Receivable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/a_AR Payment Refund'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Clear_ctl00_MainContent_ARRefundHdr_cpnlARRefundHeader_formC_gvARRefund_header17_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Loading_ctl00_MainContent_ARRefundDtl_cbpARRefund_cbpARRefundDetail_ASPxRoundPanel1_formARJEHeader_cbCustomer_cbSelectCust_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/td_000001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Additional Header Info_ctl00_MainConten_564f01'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Loading_ctl00_MainContent_ARRefundDtl_c_e58063'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/input_OTHERS_ctl00MainContentARRefundDtlcbp_8ba4ab'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARPR/input_OTHERS_ctl00MainContentARRefundDtlcbp_8ba4ab'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Outstanding_ctl00_MainContent_ARRefundD_716423'))

WebUI.delay(10)

WebUI.click(findTestObject('Deployment test/AR/ARPR/PN/div_Post  New'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Loading_ctl00_MainContent_ARRefundDtl_cbpARRefund_cbpARRefundDetail_ASPxRoundPanel1_formARJEHeader_cbCustomer_cbSelectCust_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/td_000001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Additional Header Info_ctl00_MainConten_564f01'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Loading_ctl00_MainContent_ARRefundDtl_c_e58063'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/input_OTHERS_ctl00MainContentARRefundDtlcbp_8ba4ab'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARPR/input_OTHERS_ctl00MainContentARRefundDtlcbp_8ba4ab'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARPR/img_Outstanding_ctl00_MainContent_ARRefundD_716423'))

WebUI.delay(10)

WebUI.click(findTestObject('Deployment test/AR/ARPR/Draft/div_Save Draft'))

WebUI.delay(20)


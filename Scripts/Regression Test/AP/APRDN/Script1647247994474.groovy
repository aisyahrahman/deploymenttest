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

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APR/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_Invalid value_dxic'))

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APR/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_Invalid value_dxic_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AP/APR/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/span_Account Payable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/a_AP Payment Refund'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Clear_ctl00_MainContent_APRefundHdr_cpnlAPRefundHeader_formC_gvAPRefund_header16_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Loading_ctl00_MainContent_APRefundDtl_cbpAPRefund_cbpAPRefundDetail_ASPxRoundPanel1_formAPJEHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Payment Info_ctl00_MainContent_APRefund_550f27'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Loading_ctl00_MainContent_APRefundDtl_c_3bf805'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/input_SHOPEE_ctl00MainContentAPRefundDtlcbp_8b98f0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APR/input_SHOPEE_ctl00MainContentAPRefundDtlcbp_8b98f0'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Outstanding_ctl00_MainContent_APRefundD_423bce'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/AP/APR/PN/div_Post  New'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Loading_ctl00_MainContent_APRefundDtl_cbpAPRefund_cbpAPRefundDetail_ASPxRoundPanel1_formAPJEHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Payment Info_ctl00_MainContent_APRefund_550f27'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Loading_ctl00_MainContent_APRefundDtl_c_3bf805'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/input_SHOPEE_ctl00MainContentAPRefundDtlcbp_8b98f0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APR/input_SHOPEE_ctl00MainContentAPRefundDtlcbp_8b98f0'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APR/img_Outstanding_ctl00_MainContent_APRefundD_423bce'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/AP/APR/Draft/div_Save Draft'))

WebUI.delay(20)


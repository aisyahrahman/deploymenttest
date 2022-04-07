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

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APP/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APP/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AP/APP/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/span_Account Payable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/a_AP Payment'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/img_Clear_ctl00_MainContent_APPaymentHdr_cpnlAPPaymentHeader_formC_gvAPPayment_header16_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/img_Loading_ctl00_MainContent_APPaymentDtl_cbpAPJournalEntry_cbpAPJournalEntryDetail_ASPxRoundPanel1_formAPJEHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/td_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/img_Payment Info_ctl00_MainContent_APPaymen_5df3af'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/img_Loading_ctl00_MainContent_APPaymentDtl__6952bd'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/input_SHOPEE_ctl00MainContentAPPaymentDtlcb_83b2ea'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APP/input_SHOPEE_ctl00MainContentAPPaymentDtlcb_83b2ea'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/img_Outstanding_ctl00_MainContent_APPayment_94c6a7'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APP/div_Post'))

WebUI.delay(20)


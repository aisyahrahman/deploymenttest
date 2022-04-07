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

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AP/APCN/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/span_Account Payable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/a_AP Credit Note'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/img_Clear_ctl00_MainContent_APCreditNoteHdr_cpnlAPCreditNoteHeader_formC_gvAPCreditNote_header17_Add'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_Loading_ctl00_MainContent_APCreditNoteDtl_cbpAPCreditNote_cbpAPCreditNoteDetail_ASPxRoundPanel1_formAPCNHeader_cbVendor_cbVendor_B1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input__ctl00MainContentAPCreditNoteDtlcbpAP_a16ea8'),seq)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/img_Tax Itemize_ctl00_MainContent_APCreditN_9f7465'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_Loading_ctl00_MainContent_APCreditNoteDt_2c46a6'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_GST-3030'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/input_Description_ctl00MainContentAPCreditN_c01a82'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input_Description_ctl00MainContentAPCreditN_c01a82'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/img_Outstanding_ctl00_MainContent_APCreditN_a87988'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/AP/APCN/PN/div_Post  New'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_Loading_ctl00_MainContent_APCreditNoteDtl_cbpAPCreditNote_cbpAPCreditNoteDetail_ASPxRoundPanel1_formAPCNHeader_cbVendor_cbVendor_B1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input__ctl00MainContentAPCreditNoteDtlcbpAP_a16ea8'),seq)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/img_Tax Itemize_ctl00_MainContent_APCreditN_9f7465'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_Loading_ctl00_MainContent_APCreditNoteDt_2c46a6'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/td_GST-3030'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/input_Description_ctl00MainContentAPCreditN_c01a82'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APCN/input_Description_ctl00MainContentAPCreditN_c01a82'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APCN/img_Outstanding_ctl00_MainContent_APCreditN_a87988'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/AP/APCN/Draft/div_Save Draft'))

WebUI.delay(20)


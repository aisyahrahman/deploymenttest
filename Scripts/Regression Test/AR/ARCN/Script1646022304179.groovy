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

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARCN/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARCN/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AR/ARCN/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/a_Account Receivable'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/a_AR Credit Note'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/img_Clear_ctl00_MainContent_ARCreditNoteHdr_cpnlARCreditNoteHeader_formC_gvARCreditNote_header18_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/img_Loading_ctl00_MainContent_ARCreditNoteDtl_cbpARCreditNote_cbpARCreditNoteDetail_ASPxRoundPanel1_formARCNHeader_cbCustomer_cbSelectCust_B1Img'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/td_SHAHIDA BINTI MOHD MOKHTAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARCN/input__ctl00MainContentARCreditNoteDtlcbpAR_f32abe'),seq)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/img_Tax Itemize_ctl00_MainContent_ARCreditN_791c88'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/img_Loading_ctl00_MainContent_ARCreditNoteD_506111'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/td_350-0000'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/input_Description_ctl00MainContentARCreditN_4e7437'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARCN/input_Description_ctl00MainContentARCreditN_4e7437'), 
    '2')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/img_Currency_ctl00_MainContent_ARCreditNote_6c4a8b'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARCN/span_Post'))

WebUI.delay(20)


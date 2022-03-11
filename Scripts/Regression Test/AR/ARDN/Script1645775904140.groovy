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

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARDN/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARDN/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AR/ARDN/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/span_Account Receivable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/a_AR Debit Note'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/img_Cancel_ctl00_MainContent_ARDebitNoteHdr_cpnlARDebitNoteHeader_formC_gvARDebitNote_header17_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/img_Loading_ctl00_MainContent_ARDebitNoteDtl_cbpARDebitNote_cbpARDebitNoteDetail_ASPxRoundPanel1_formARDNHeader_cbCustomer_cbSelectCust_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/td_000001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/span_OK'))

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/img_Tax Itemize_ctl00_MainContent_ARDebitNo_a988be'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/img_Loading_ctl00_MainContent_ARDebitNoteDt_c695f1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/td_350-0000'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/input_Description_ctl00MainContentARDebitNo_18066d'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARDN/input_Description_ctl00MainContentARDebitNo_18066d'), 
    '5.45')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARDN/div_Post'))


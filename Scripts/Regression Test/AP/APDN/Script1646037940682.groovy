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

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APDN/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APDN/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AP/APDN/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/span_Account Payable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/a_AP Debit Note'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/img_Cancel_ctl00_MainContent_APDebitNoteHdr_cpnlAPDNHeader_formC_gvAPDebitNote_header18_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/img_Loading_ctl00_MainContent_APDebitNoteDtl_cbpAPDebitNote_cbpAPDebitNoteDetail_ASPxRoundPanel1_formAPDNHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/td_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APDN/input__ctl00MainContentAPDebitNoteDtlcbpAPD_b6b9a7'), 
    'AP01')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/img_Outstanding_ctl00_MainContent_APDebitNo_42ae56'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/img_Loading_ctl00_MainContent_APDebitNoteDt_beb87f'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/td_350-0000'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/input_Description_ctl00MainContentAPDebitNo_36e256'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/APDN/input_Description_ctl00MainContentAPDebitNo_36e256'), 
    '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/APDN/div_Post'))

WebUI.delay(5)


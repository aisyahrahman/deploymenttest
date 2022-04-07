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

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/API/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/API/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AP/API/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/span_Login'))

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/span_Account Payable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/a_AP Invoice'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/img_Cancel_ctl00_MainContent_APJournalEntryHdr_cpnlAPJEHeader_formC_gvAPJournalEntry_header18_btnCheckAll'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/img_Loading_ctl00_MainContent_APJournalEntryDtl_cbpAPJournalEntry_cbpAPJournalEntryDetail_ASPxRoundPanel1_formAPJEHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/td_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/span_OK'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/API/input__ctl00MainContentAPJournalEntryDtlcbp_6ad2e9'),seq)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/img_Cancel_ctl00_MainContent_APJournalEntry_5c76b4 (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/td_Loading_ctl00_MainContent_APJournalEntry_626555'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/td_PREPAYMENT'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/input_Description_ctl00MainContentAPJournalEntryDtlcbpAPJournalEntrycpnlAPJEItemformAPJEItemPC_0gvAPJEItemDXEditor12'))

WebUI.setText(findTestObject('Object Repository/Deployment test/AP/API/input_Description_ctl00MainContentAPJournalEntryDtlcbpAPJournalEntrycpnlAPJEItemformAPJEItemPC_0gvAPJEItemDXEditor12'), 
    '5')

WebUI.click(findTestObject('Object Repository/Deployment test/AP/API/span_Post (1)'))

WebUI.delay(20)


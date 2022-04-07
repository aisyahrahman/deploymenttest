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

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARI/input_www.irs-software.com_cbpCallbacktxtClientId (1)'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARI/input_Invalid value_cbpCallbacktxtUserName (1)'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/td_Invalid value_dxic (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AR/ARI/input_Invalid value_cbpCallbacktxtPassword (1)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/span_Login (1)'))

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/span_Account Receivable_dxWeb_nbExpand_iOS (1)'))

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/a_AR Invoice (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/img_Cancel_ctl00_MainContent_ARJournalEntryHDR_cpnlARJEHeader_formC_gvARJournalEntry_header17_btnCheckAll'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/img_Loading_ctl00_MainContent_ARJournalEntr_a35dab'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/td_YEONG'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/span_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/img_Tax Itemize_ctl00_MainContent_ARJournal_ce6af4'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/img_Loading_ctl00_MainContent_ARJournalEntr_e89161'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARI/td_GST-3010'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Deployment test/AR/ARI/input_Description_ctl00MainContentARJournal_0e76ec'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARI/input_Description_ctl00MainContentARJournal_0e76ec'), 
    '1239.6')

WebUI.delay(8)

WebUI.click(findTestObject('Deployment test/AR/ARI/Draft/div_Save Draft'))

WebUI.delay(20)

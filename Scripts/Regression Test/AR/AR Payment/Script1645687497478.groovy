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

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARP/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARP/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/AR/ARP/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/span_Account Receivable_dxWeb_nbExpand_iOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/a_AR Payment'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/img_Clear_ctl00_MainContent_ARPaymentHdr_cpnlARPaymentHeader_formC_gvARPayment_header17_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/img_Loading_ctl00_MainContent_ARPaymentDtl_cbpARPayment_cbpARPaymentDetail_ASPxRoundPanel1_formARPaymentHeader_cbCustomer_cbSelectCust_B1Img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/td_000001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/div_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/img_Additional Header Info_ctl00_MainConten_776c4c'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/img_Loading_ctl00_MainContent_ARPaymentDtl__c20cbf'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/td_AMEX'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/input_OTHERS_ctl00MainContentARPaymentDtlcb_47bc52'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/AR/ARP/input_OTHERS_ctl00MainContentARPaymentDtlcb_47bc52'), '5')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/img_Outstanding_ctl00_MainContent_ARPayment_074e06'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Deployment test/AR/ARP/span_Post'))

WebUI.delay(20)


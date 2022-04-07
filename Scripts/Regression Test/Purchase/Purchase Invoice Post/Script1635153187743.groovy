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

WebUI.navigateToUrl('http://sit.irsalaya.com/Account/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Deployment test/purchase invoice/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.setText(findTestObject('Object Repository/Deployment test/purchase invoice/input_Invalid value_cbpCallbacktxtUserName'), 
    'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/purchase invoice/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/div_Login'))

WebUI.click(findTestObject('Deployment test/purchase invoice/span_Purchase_dxWeb_nbExpand_iOS'))

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/a_Purchase Invoice'))

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/img_Clear_ctl00_MainContent_PurchaseInvoices1_cpnlPurchaseInvoices_formPurchaseInvoices_gvPurchaseInvoices_header16_btnCheckAll'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/img_Loading_ctl00_MainContent_PurchaseInvoiceDetail1_cbpPurchaseInvoice_cbpPIHeader_ASPxRoundPanel1_formPIHeader_cbVendor_cbVendor_B1Img'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/Deployment test/purchase invoice/td_S02-AGROMAS'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Deployment test/purchase invoice/span_OK'), 5)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Deployment test/purchase invoice/input__ctl00MainContentPurchaseInvoiceDetai_52c477'),seq)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/img_Loading_ctl00_MainContent_PurchaseInvoi_09f0b8'))

WebUI.delay(5)

WebUI.click(findTestObject('Deployment test/purchase invoice/td_BERCHAM RAYA'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/img_Additional Notes_ctl00_MainContent_Purc_d2f4de'))

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/td_SAFETY PIN (2)'))

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/div_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/purchase invoice/span_Post (2)'))

WebUI.delay(20)


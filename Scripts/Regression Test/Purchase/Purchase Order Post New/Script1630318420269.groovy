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

WebUI.navigateToUrl('http://sit.irsalaya.com/Account/Login.aspx')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Deployment test/PO Post/input_www.irs-software.com_cbpCallbacktxtClientId'), 
    'uat')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Deployment test/PO Post/input_Invalid value_cbpCallbacktxtUserName'), 'admin')

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/td_Invalid value_dxic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Deployment test/PO Post/input_Invalid value_cbpCallbacktxtPassword'), 
    'tzH6RvlfSTg=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/span_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/span_Purchase_dxWeb_nbExpand_iOS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/a_Purchase Order'))

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/img_Reorder Advice_ctl00_MainContent_Purcha_0d48cb'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/img_Loading_ctl00_MainContent_PurchaseOrderDetail1_cbpPurchaseOrder_cbpPOHeader_ASPxRoundPanel1_formPOHeader_cbVendor_cbVendor_B1Img (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/td_0001 (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/span_OK (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/img_Loading_ctl00_MainContent_PurchaseOrder_4d6f41 (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/td_AMPANG (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Deployment test/PO Post/img_Additional Notes_ctl00_MainContent_Purc_eb224d'))

WebUI.doubleClick(findTestObject('Object Repository/Deployment test/PO Post/td_SAFETY PIN (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Deployment test/PO Post/span_Post  New'))


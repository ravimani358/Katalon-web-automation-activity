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

WebUI.navigateToUrl('https://www.zcommerce.crio.do/signup')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Login'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/input_Email Address_email'), 
    'test2contact2@yopmail.com')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/input_Password_password'), 
    'Password@123')

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Login_1'), 
    'Login')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Login_1'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_ADD TO CART'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_GO TO CART'))

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Proceed to buy'), 
    'Proceed to buy')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Proceed to buy'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/span_Payment Method'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/span_CreditDebit Card'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/input_CreditDebit Card_cardNumber'), 
    cardno)

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/input_CreditDebit Card_cvv'), 
    cvv)

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/input_CreditDebit Card_cardHolderName'), 
    name)

WebUI.verifyElementPresent(findTestObject('Object Repository/17 New Test case creation/12th Test case/Page_ZCommerce/button_Add Card'), 
    0)


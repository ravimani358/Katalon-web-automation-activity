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

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/input_Name_name'), 
    'test2contact2')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/input_Email Address_email'), 
    'test2contact2@yopmail.com')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/input_Password_password'), 
    'Password@123')

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/button_Register'), 
    'Register')

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/h1_Sign In'), 
    'Sign In')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/11th Test case/Page_ZCommerce/div_Recommended Products'), 
    'Recommended Products')


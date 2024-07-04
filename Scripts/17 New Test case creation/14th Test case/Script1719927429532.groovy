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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/button_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/p_Test 68 user'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/a_Support'))

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/h6_Getting Started with OrangeHRM'), 
    'Getting Started with OrangeHRM')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/i_User Management_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/li_Users'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username)

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/button_Add'), 
    'Add')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/14th Test case/Page_OrangeHRM/button_Add'))


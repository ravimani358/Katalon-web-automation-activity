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

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/input_Password_password'), 
    'admin123')

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/button_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/h6_Dashboard'), 
    'Dashboard')

WebUI.waitForElementVisible(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/p_My Actions'), 
    0)

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Time'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_My Info'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Performance'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/span_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/17 New Test case creation/13th Test case/Page_OrangeHRM/h6_Dashboard'), 
    0)


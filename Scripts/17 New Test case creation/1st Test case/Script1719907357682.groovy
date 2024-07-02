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

WebUI.maximizeWindow()

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/input_Full Name_firstName'), 
    'Ravi')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/input_Full Name_lastName'), 
    'test12')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 
    'key words of the process')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    'Testing Notes')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/1st Test case/Page_OrangeHRM/button_Save'))

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

WebUI.navigateToUrl('https://qtripdynamic-qa-frontend.vercel.app/')

WebUI.click(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/a_Register'))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Register_email'), 'ravi97691@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Email address_password'), 
    'B2YN85tS2a2gGlKmdxn2NQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Type to create account password_confi_8c001e'), 
    'B2YN85tS2a2gGlKmdxn2NQ==')

WebUI.click(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/button_Register Now'))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Register_email'), 'ravi97691@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Email address_password_1'), 
    'B2YN85tS2a2gGlKmdxn2NQ==')

WebUI.click(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/button_Login to QTrip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/div_Logout'))


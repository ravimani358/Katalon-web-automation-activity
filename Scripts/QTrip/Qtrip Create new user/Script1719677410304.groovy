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

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Register_email'), findTestData('1st Data file').getValue(
        1, 1))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Email address_password'), findTestData(
        '1st Data file').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Type to create account password_confi_8c001e'), 
    findTestData('1st Data file').getValue(3, 1))

WebUI.click(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/button_Register Now'))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Register_email'), findTestData('1st Data file').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/input_Email address_password_1'), findTestData(
        '1st Data file').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/button_Login to QTrip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Qtrip create new user/Page_QTrip/div_Logout'))


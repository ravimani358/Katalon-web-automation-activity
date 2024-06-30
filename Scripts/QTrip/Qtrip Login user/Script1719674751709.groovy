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

WebUI.switchToWindowTitle('QTrip')

WebUI.click(findTestObject('Object Repository/Qtrip login user/Page_QTrip/a_Login Here'))

WebUI.setText(findTestObject('Object Repository/Qtrip login user/Page_QTrip/input_Login_email'), 'ravimani358@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Qtrip login user/Page_QTrip/input_Email address_password'), 'y4pbWpkRAh6YPT4LeqmmmQ==')

WebUI.click(findTestObject('Object Repository/Qtrip login user/Page_QTrip/button_Login to QTrip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Qtrip login user/Page_QTrip/div_Logout'))


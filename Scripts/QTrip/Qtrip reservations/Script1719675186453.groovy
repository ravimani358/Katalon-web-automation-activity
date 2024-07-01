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

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip/a_Login Here'))

WebUI.setText(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip/input_Login_email'), findTestData(
        '3rd Data file').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip/input_Email address_password'), 
    findTestData('3rd Data file').getValue(2, 1))

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip/button_Login to QTrip'))

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip/h5_Paris'))

WebUI.scrollToElement(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip Adventures/img_Cycling_img-responsive'), 
    3)

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip Adventures/img_Cycling_img-responsive'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/input_Name_name'), 
    3)

WebUI.setText(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/input_Name_name'), 
    findTestData('3rd Data file').getValue(3, 1))

WebUI.click(findTestObject('Qtrip login and booking reservation/pick a date'))

WebUI.sendKeys(findTestObject('Qtrip login and booking reservation/pick a date'), findTestData('3rd Data file').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/input__person'), 
    findTestData('3rd Data file').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/button_Reserve'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/div_Greetings Reservation for this adventur_68d46e'), 
    3)

WebUI.click(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip adventures/strong_here'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip Adventures/th_12896b739d036047'), 
    3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Qtrip login and booking reservation/Page_QTrip Adventures/th_12896b739d036047'), 
    FailureHandling.STOP_ON_FAILURE)


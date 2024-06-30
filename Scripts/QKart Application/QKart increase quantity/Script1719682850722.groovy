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

WebUI.navigateToUrl('https://crio-qkart-frontend-qa.vercel.app/checkout')

WebUI.switchToWindowTitle('QKart')

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Login'))

WebUI.setText(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/input_Username_username'), 'ravimani358@yopmail.com.admin')

WebUI.setEncryptedText(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/input_Password_password'), 
    'y4pbWpkRAh6YPT4LeqmmmQ==')

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Login to QKart'))

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add to cart'))

WebUI.waitForElementClickable(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add'), 
    3)

WebUI.click(findTestObject('QKart/QKart add shipping address/Page_QKart/Click plus button'))

WebUI.click(findTestObject('QKart/QKart add shipping address/Page_QKart/Click plus button'))

WebUI.click(findTestObject('QKart/QKart add shipping address/Page_QKart/Click plus button'))

WebUI.click(findTestObject('QKart/QKart add shipping address/Page_QKart/Click plus button'))


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

WebUI.setText(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/input_Username_username'), User_name)

WebUI.setText(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Login to QKart'))

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/svg_Checkout_MuiSvgIcon-root MuiSvgIcon-fon_590488'))

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add new address'))

WebUI.setText(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/textarea_address of the shipping place'), 
    Address)

WebUI.waitForElementClickable(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add'), 
    3)

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/button_Add'))

WebUI.click(findTestObject('Object Repository/QKart/QKart add shipping address/Page_QKart/input_Shipping_address'))

WebUI.click(findTestObject('QKart/QKart add shipping address/Page_QKart/Place order button'))


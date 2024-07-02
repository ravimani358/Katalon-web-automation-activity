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

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Username_username'), 
    Username)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Password_password'), 
    Password)

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/p_(1) Candidate to Interview'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 
    Key_word)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input'), contact_name)

WebUI.enhancedClick(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Full Name_firstName'), 
    First_name)

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Full Name_firstName'))

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Full Name_middleName'), 
    Mid_name)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 02/Page_OrangeHRM/input_Full Name_lastName'), 
    Last_name)


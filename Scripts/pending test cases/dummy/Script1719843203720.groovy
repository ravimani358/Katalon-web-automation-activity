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

WebUI.navigateToUrl('https://practicetestautomation.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Practice Test Automation  Learn Seleni_a43ca4/input__dataform_field_OTlkMTBlNjFjOGUwX2Zpc_1b3eda'))

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Practice Test Automation  Learn Seleni_a43ca4/input__dataform_field_OTlkMTBlNjFjOGUwX2Zpc_1b3eda'), 
    Name)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Practice Test Automation  Learn Seleni_a43ca4/input__dataform_field_ODhhN2IwZjQ3NTMzX2VtYWls'), 
    Email)

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Practice Test Automation  Learn Seleni_a43ca4/input__mailpoet_submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_MailPoet Page  Practice Test Automation/input_Type in the characters you see in the_e8c10c'), 
    0)

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_MailPoet Page  Practice Test Automation/a_Practice'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Practice  Practice Test Automation/a_Courses'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Courses  Practice Test Automation/a_Blog'))

WebUI.click(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Blog  Practice Test Automation/a_Contact'))

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields0first'), 
    First Name)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Contact  Practice Test Automation  Sel_b632b1/input_First_wpformsfields0last'), 
    Last Name)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields1'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Contact  Practice Test Automation  Sel_b632b1/textarea__wpformsfields2'), 
    Message)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reamining test case executions/Test case 01/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))


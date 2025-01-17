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

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/span_PIM'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input'), Employee_Hints)

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    Emp_ID)

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input'), Supervisor_name)

WebUI.click(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/div_Add'))

WebUI.click(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    First_name)

WebUI.setText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    Last_name)

WebUI.verifyElementText(findTestObject('Object Repository/17 New Test case creation/8th Tets case/Page_OrangeHRM/button_Save'), 
    'Save')


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

WebUI.navigateToUrl('https://revature.com/?utm_source=in_redirect#what-is-revature')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/div_Start Here_absolute top-0 left-0 w-full_efd927'))

WebUI.enhancedClick(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/span_Start Here'))

WebUI.enhancedClick(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/div_Start Here'))

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_First name_firstName'), 
    'firstname')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_Last name_lastName'), 
    'last name')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_Job Title_jobTitle'), 
    'Job titles')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_Business Email_email'), 
    'Business email')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_First name_firstName'), 
    'firstname')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_Company Name_companyName'), 
    'C2Btech')

WebUI.setText(findTestObject('Object Repository/India WebSite/Enterprise Partnerships website/Page_Revature - The Worlds Leading Tech Tal_0253dd/input_Phone Number_phone'), 
    '(998) 800-0000')


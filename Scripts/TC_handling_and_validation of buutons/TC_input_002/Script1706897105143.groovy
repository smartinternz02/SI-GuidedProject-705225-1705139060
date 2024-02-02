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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'ramkumar@gmail.com')

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/input_Forgot Password_password'), 
    '+mJ1/ixjegi/1jYArk0UbQ==')

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/input_Enter your password_rememberMe'))

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Sign In/a_Forgot Password'))

WebUI.setText(findTestObject('Object Repository/AZ_login_record/Page_Amazon Password Assistance/input_Email or mobile phone number_email'), 
    'ramkumar@gmail.com')

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Password Assistance/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setText(findTestObject('Object Repository/AZ_login_record/Page_Amazon Password Assistance/input_ZIP code (or Postal Code)_zipCode'), 
    '5415o442o')

WebUI.click(findTestObject('Object Repository/AZ_login_record/Page_Amazon Password Assistance/input_Enter your email or mobile phone numb_fc7402'))

WebUI.closeBrowser()
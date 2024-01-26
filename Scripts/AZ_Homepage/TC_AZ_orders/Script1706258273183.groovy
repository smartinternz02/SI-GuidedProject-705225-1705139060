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

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_orders_Record/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=videogames', true)

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'))

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'psp')

WebUI.click(findTestObject('script_cart_2/magnifying/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('for order_2/Page_Amazon.in  psp/product words'))

WebUI.switchToWindowTitle('Buy NextTech Some Friendly Competition with This Player Edition of The PSP Video Game Console Complete with Over 3K Video Games for Includes Action-Adventure Sports and Racing (2024 PSP) Online at Low Prices in India | NextTech Video Games - Amazon.in')

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Buy NextTech Some Friendly Competition_f464c6/input_Shipping cost, delivery date and orde_a6d45b'))

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'mnvramkumar2001@gmail.com')

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Forgot Password_password'), 
    'pdyTcV2mF1w+k4p48miQbw==')

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Enter your password_rememberMe'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Enter your password_rememberMe'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/span_India'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/a_India'))

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Full name (First and Last name)_addre_efd85e'), 
    'ram')

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Mobile number_address-ui-widgets-ente_47155a'), 
    '7990547892')

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Flat, House no., Building, Company, A_6a51d1'), 
    '4123,abcstreet')

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Area, Street, Sector, Village_address_fb368b'), 
    'hyderabad')

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Landmark_address-ui-widgets-landmark'), 
    'kphp')

WebUI.setText(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_TownCity_address-ui-widgets-enterAddressCity'), 
    'HYDERABAd')

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/span_TELANGANA'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/a_TELANGANA'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/i_Delivery instructions (optional)_a-icon a_cc7932'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/i_Delivery instructions (optional)_a-icon a_7f2ebf'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Sorry, there was a problem loading de_f14d48'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/input_Your available balance_ppw-claimCodeA_bab66d'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/input_Another payment method_ppw-instrument_d02253'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/input_Amazon accepts all major credit   car_451b00'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/span_Choose an Option'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/a_ICICI Bank'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/label'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/input_Please enter your UPI ID_ppw-widgetEv_331406'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/label_EMI'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Amazon.in Checkout/label_Cash on DeliveryPay on Delivery'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/input_Your addresses_submissionURL'))

WebUI.click(findTestObject('Object Repository/TC_orders_Record/Page_Select a delivery address/a_Add a new address'))

WebUI.navigateToUrl('https://www.amazon.in/gp/buy/addressselect/handlers/display.html?_from=cheetah')

WebUI.closeBrowser()


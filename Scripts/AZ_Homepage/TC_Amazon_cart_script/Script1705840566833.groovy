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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AZ_Cart_script/page_home/span_Cart'))

WebUI.click(findTestObject('Object Repository/AZ_Cart_script/Page_Amazon.in Shopping Cart/a_Shop todays deals'))

WebUI.click(findTestObject('Object Repository/AZ_Cart_script/Page_Amazon.in - Deals/span_Mobiles'))

WebUI.click(findTestObject('Object Repository/script_cart_2/Page_Amazon.in - Deals/image mobile'))

WebUI.click(findTestObject('Object Repository/script_cart_2/Page_Nokia Feature Phones, starting 999 only/div_Featured_a-section octopus-dlp-image-shield'))

WebUI.click(findTestObject('Object Repository/AZ_Cart_script/product-page/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/AZ_Cart_script/product-page/cart element'))

WebUI.closeBrowser()


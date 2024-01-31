import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TL_Amazon_01 {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
			
WebUI.click(findTestObject('Object Repository/TL_login_or/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/TL_login_or/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'mnvramkumar2001@gmail.com')

WebUI.click(findTestObject('Object Repository/TL_login_or/Page_Amazon Sign In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/TL_login_or/Page_Amazon Sign In/input_Forgot Password_password'), 
    'pdyTcV2mF1w+k4p48miQbw==')

WebUI.click(findTestObject('Object Repository/TL_login_or/Page_Amazon Sign In/input_Enter your password_signInSubmit'))
//println testCaseContext.getTestCaseId()
		//println testCaseContext.getTestCaseVariables()
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {

WebUI.click(findTestObject('Object Repository/TL_login_or/Page_Amazon.in  blazers/a_All'))

WebUI.click(findTestObject('Object Repository/TL_login_or/Page_Amazon.in  blazers/a_Sign Out'))
//println testCaseContext.getTestCaseId()
		//println testCaseContext.getTestCaseStatus()
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	/*@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	/*@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
	*/
}
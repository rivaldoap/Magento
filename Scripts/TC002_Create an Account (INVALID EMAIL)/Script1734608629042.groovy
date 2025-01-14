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

WebUI.openBrowser('https://magento.softwaretestingboard.com/')
WebUI.click(findTestObject('Object Repository/Create an Account/Create an Account'))

	//Personal Information
	WebUI.setText(findTestObject('Object Repository/Create an Account/First Name'), 'Nobody')
	WebUI.setText(findTestObject('Object Repository/Create an Account/Last Name'), 'Subody')
	
	//Create an Account (Invalid email format)
	WebUI.setText(findTestObject('Object Repository/Create an Account/Email'), 'nbdysbdy123!mail.co')
	WebUI.setText(findTestObject('Object Repository/Create an Account/Password'), 'Abcde123!')
	WebUI.setText(findTestObject('Object Repository/Create an Account/Confirm Password'), 'Abcde123!')
	WebUI.click(findTestObject('Object Repository/Create an Account/btn_Create an Account'))
	
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


//Open URL
WebUI.openBrowser('https://magento.softwaretestingboard.com/')
WebUI.click(findTestObject('Object Repository/Sign In/btn_Sign In atas'))
	
	//Enter Registered Email&Password
	WebUI.setText(findTestObject('Object Repository/Sign In/Email'), 'nbdysbdy123@mail.co')
	WebUI.setText(findTestObject('Object Repository/Sign In/Password'), 'Abcde123!')
	WebUI.click(findTestObject('Object Repository/Sign In/btn_Sign In'))
	
	//Click Sub Menu for entering My Account
	WebUI.click(findTestObject('Object Repository/Sign In/button_Change'))
	WebUI.click(findTestObject('Object Repository/Sign In/a_My Account'))
	
	//Button for go to the Edit
	WebUI.click(findTestObject('Object Repository/Sign In/btn_Edit Address'))
		
			
		//This is the field for typing the address
		WebUI.setText(findTestObject('Object Repository/Sign In/field_Company'), 'PT. Ya Op Sejahtera')
			WebUI.setText(findTestObject('Object Repository/Sign In/field_Phone Number'), '08142358679')
			WebUI.setText(findTestObject('Object Repository/Sign In/field_Street Address 1'), 'Jalanin')
			WebUI.setText(findTestObject('Object Repository/Sign In/field_Street Address 2'), 'Aja')
			WebUI.setText(findTestObject('Object Repository/Sign In/field_Street Address 3'), 'Dulu')
			WebUI.setText(findTestObject('Object Repository/Sign In/field_City'), 'Konoha')
			
			//Select the region
			WebUI.selectOptionByValue(findTestObject('Object Repository/Sign In/select_Please select a region, state or pro_09f794'),
				'1', true)
			
			//This is the field for typing ZIP/Postal Code
			WebUI.setText(findTestObject('Object Repository/Sign In/field_Zip Postal Code'), '54321')
			
			//Select the Country
			WebUI.selectOptionByValue(findTestObject('Object Repository/Sign In/select_Afghanistanland IslandsAlbaniaAlgeri_87ca51'), 
    'ID', true)
			WebUI.click(findTestObject('Object Repository/Sign In/btn_Save Address'))
			
			
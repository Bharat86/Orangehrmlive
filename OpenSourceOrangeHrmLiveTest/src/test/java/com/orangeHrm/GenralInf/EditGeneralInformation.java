/**
 * 
 */
package com.orangeHrm.GenralInf;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmLive.DriverHelper.DriverHelper;
import com.OrangeHrmLive.Page.LoginToOrangeHrm;

/**
 * @rush2Bharat
 *
 */
public class EditGeneralInformation extends DriverHelper{

	public EditGeneralInformation() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();	
	}
	
	@Test
	public void TestUserAbletoEditGeneralInformation() throws IOException {
		LoginToOrangeHrm loginHrm= new LoginToOrangeHrm();
		loginHrm.EnterUserName();
		loginHrm.EnterPassword();
		loginHrm.ClickonLognBtn();
		loginHrm.ClcikedOnMenuTab();
		loginHrm.EditgenInfo();
		loginHrm.clearDetails();
		loginHrm.SendDetails();
		loginHrm.Cityfromthelist().selectByVisibleText("India");;
		loginHrm.clickOnSavBtn();

	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}


}

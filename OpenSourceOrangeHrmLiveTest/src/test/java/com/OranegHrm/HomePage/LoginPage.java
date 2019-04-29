package com.OranegHrm.HomePage;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmLive.DriverHelper.DriverHelper;
import com.OrangeHrmLive.Page.LoginToOrangeHrm;

/**
 * 
 */

/**
 * @Rush2Bharat
 *
 */
public class LoginPage extends DriverHelper{

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();	
	}
	
	@Test()
	public void testLoginHomepage() throws IOException {
		LoginToOrangeHrm loginHrm=new LoginToOrangeHrm();
		loginHrm.EnterUserName();
	    loginHrm.EnterPassword();
		loginHrm.ClickonLognBtn();
		System.out.println("HOMEPAGE TITLE :" +loginHrm.Gettitile());
		Assert.assertEquals(loginHrm.Gettitile(), "OrangeHRM","User Not landing on HomePage");
		
	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
}

/**
 * 
 */
package com.orangeHrm.AdminTab;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmLive.DriverHelper.DriverHelper;
import com.OrangeHrmLive.Page.LoginToOrangeHrm;

/**
 * @rush2Bharat
 *
 */
public class AdminMenu extends DriverHelper {
	
	public AdminMenu() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();	
	}
	
	@Test()
	public void verifyGeneralInformationUnderAdmin() throws IOException {
		LoginToOrangeHrm loginHrm= new LoginToOrangeHrm();
		loginHrm.EnterUserName();
		loginHrm.EnterPassword();
		loginHrm.ClickonLognBtn();
		loginHrm.ClcikedOnMenuTab();
		System.out.println("Values of General Information Text :"+loginHrm.VerifyGeneralInfTxt());
		Assert.assertEquals(loginHrm.VerifyGeneralInfTxt(), "General Information", "Not Verified--");
		System.out.println("User is able to view General Information --:"+loginHrm.VerifyGeneralInfTxt());

	}

	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}

}

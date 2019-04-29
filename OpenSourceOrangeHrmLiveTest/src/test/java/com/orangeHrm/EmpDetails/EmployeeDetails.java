/**
 * 
 */
package com.orangeHrm.EmpDetails;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmLive.DriverHelper.DriverHelper;
import com.OrangeHrmLive.Page.LoginToOrangeHrm;

/**
 * @rush2Bharat
 *
 */
public class EmployeeDetails extends DriverHelper{

	public EmployeeDetails() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();	
	}
	
	@Test
	public void AddEmployeeDetails() throws IOException, InterruptedException {
		LoginToOrangeHrm loginHrm= new LoginToOrangeHrm();
		loginHrm.EnterUserName();
		loginHrm.EnterPassword();
		loginHrm.ClickonLognBtn();
		loginHrm.clickPIMmenu();
		loginHrm.clickAddEmp();
		loginHrm.EnterFName();
		loginHrm.EnterLastName();
		loginHrm.EnterEmpId();
		Thread.sleep(5000);
		loginHrm.ClickOnPhotBtn();
		Thread.sleep(5000);
		loginHrm.ClickSavBtn();

		
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}

}

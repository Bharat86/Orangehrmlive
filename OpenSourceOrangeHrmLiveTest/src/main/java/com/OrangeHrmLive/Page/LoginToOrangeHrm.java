/**
 * 
 */
package com.OrangeHrmLive.Page;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.OrangeHrmLive.DriverHelper.DriverHelper;

/**
 * @rush2bharat
 *
 */
public class LoginToOrangeHrm extends DriverHelper {


	public LoginToOrangeHrm() throws IOException {
		PageFactory.initElements(driver, this);
	}
	//Defining Xpath--
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement UserName;

	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement Password;

	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement LoginBtn;

	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement ClickMenu;

	@FindBy(xpath="//*[@id='menu_admin_Organization']")
	WebElement ClickOrgTab;

	@FindBy(xpath="//*[@id='menu_admin_viewOrganizationGeneralInformation']")
	WebElement GeneralInfTaB;

	@FindBy(xpath="//*[@id='genInfoHeading']")
	WebElement HeadingGenInfoTxt;

	@FindBy(xpath="//*[@id='btnSaveGenInfo']")
	WebElement EditGenInform;

	@FindBy(xpath="//*[@id='organization_email']")
	WebElement EditGenInformEmail;
	@FindBy(xpath="//*[@id='organization_street1']")
	WebElement EditGenInformStreet1;
	@FindBy(xpath="//*[@id='organization_street2']")
	WebElement EditGenInformStreet2;
	@FindBy(xpath="//*[@id='organization_city']")
	WebElement EditGenInformCity;
	@FindBy(xpath="//*[@id='organization_province']")
	WebElement EditGenInformStatet;
	@FindBy(xpath="//*[@id='organization_zipCode']")
	WebElement EditGenInformZip;
	@FindBy(xpath="//*[@id='organization_country']")
	WebElement EditGenInformCountry;
	@FindBy(xpath="//*[@id='btnSaveGenInfo']")
	WebElement SavBtn;

	//Add PIM Details-------------------------
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement PIMMenu;
	@FindBy(xpath="//*[@id='menu_pim_addEmployee']")
	WebElement ADDEMPTAB;
	@FindBy(xpath="//*[@id='firstName']")
	WebElement Fname;
	@FindBy(xpath="//*[@id='lastName']")
	WebElement LName;
	@FindBy(xpath="//*[@id='employeeId']")
	WebElement EmpId;
	@FindBy(xpath="//*[@id='photofile']")
	WebElement PhotgrahBtn;
	@FindBy(xpath="//*[@value='Save']")
	WebElement SavBtn2;


	public void EnterUserName() {
		UserName.sendKeys("admin");

	}
	public void EnterPassword() {
		Password.sendKeys("admin123");
	}

	public void ClickonLognBtn() {
		LoginBtn.click();

	}

	public String Gettitile() {
		String HomePageTitle=driver.getTitle();
		return HomePageTitle;

	}

	public void ClcikedOnMenuTab() {
		ClickMenu.click();
		ClickOrgTab.click();
		GeneralInfTaB.click();
	}

	public String VerifyGeneralInfTxt() {
		String headGenTxt=  HeadingGenInfoTxt.getText();
		return headGenTxt;
	}

	public void EditgenInfo() {
		EditGenInform.click();
		if(HeadingGenInfoTxt.isDisplayed()) {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Assert.assertEquals(VerifyGeneralInfTxt(), "General Information", "Not Verified--");

		}else {
			System.out.println("FAILED");
		}
	}

	public void clearDetails() {

		EditGenInformEmail.clear();
		EditGenInformStreet1.clear();
		EditGenInformStreet2.clear();
		EditGenInformCity.clear();
		EditGenInformStatet.clear();
		EditGenInformZip.clear();


	}

	public void SendDetails() {

		EditGenInformEmail.sendKeys("Test@gmail.com");
		EditGenInformStreet1.sendKeys("Test Delhi 58");
		EditGenInformStreet2.sendKeys("Mayur Vihar");
		EditGenInformCity.sendKeys("Delhi");
		EditGenInformStatet.sendKeys("DEL");
		EditGenInformZip.sendKeys("110017");


	}

	public Select Cityfromthelist() {
		Select dropdown = new Select(EditGenInformCountry);
		return dropdown;	
	}

	public void clickOnSavBtn() {
		SavBtn.click();
	}

	public void clickPIMmenu() {
		PIMMenu.click();
	}
	public void clickAddEmp() {
		ADDEMPTAB.click();
	}
	public void EnterFName() {
		String FName = "Bharat" + new Random().nextInt(1000);
		Fname.sendKeys(FName);

	}
	public void EnterLastName() {
		String LastName = "Chauhan" + new Random().nextInt(1000);
		LName.sendKeys(LastName);
	}
	public void EnterEmpId() {
		String EMPloyeeID = "002" + new Random().nextInt(1000);
		//int EmpID = Integer.parseInt(EMPloyeeID);	
		EmpId.sendKeys(EMPloyeeID);
	}
	public void ClickOnPhotBtn() throws InterruptedException {
		PhotgrahBtn.isEnabled();
		PhotgrahBtn.click();
		String workingDir = System.getProperty("user.dir");
		String filepath = workingDir + "\\bharat.jpg";
		driver.get(filepath);
		Thread.sleep(5000);
		//WebElement fileInput = driver.findElement(By.name("bharat.jpg"));
		//fileInput.sendKeys(filepath);
		Thread.sleep(5000);

		//fileInput.sendKeys(filepath);

	}
	public void ClickSavBtn() {
		SavBtn2.click();
	}


}



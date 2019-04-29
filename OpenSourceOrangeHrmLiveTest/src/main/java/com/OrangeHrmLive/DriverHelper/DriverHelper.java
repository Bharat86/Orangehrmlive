/**
 * 
 */
package com.OrangeHrmLive.DriverHelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OrangeHrmLive.Page.LoginToOrangeHrm;

/**
 * @rush2bharat
 *
 */
public class DriverHelper {

	public static WebDriver driver;
	public static Properties prop;
	public static String path = System.getProperty("user.dir");
 
	public DriverHelper()  throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace"
		 		+ "\\OpenSourceOrangeHrmLiveTest\\Browser\\chromedriver.exe");
		 
		 try {
			prop = new Properties();
			 
			 FileInputStream ip= new FileInputStream("C:\\Users\\pc\\eclipse-workspace"
			 		+ "\\OpenSourceOrangeHrmLiveTest\\src"
			 		+ "\\main\\java\\com\\OrangeHrmLive\\config\\config.properties");
			 prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void intialization() throws IOException {
		 
		 String browser = prop.getProperty("browser");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace"
		 		+ "\\OpenSourceOrangeHrmLiveTest\\Browser\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	 }
	 
	 
	}



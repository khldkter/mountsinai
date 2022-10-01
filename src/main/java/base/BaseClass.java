package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

import org.testng.annotations.AfterMethod;

public class BaseClass {

WebDriver driver;	
protected HomePage homePage;

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\enthr\\eclipse-workspace\\org.mountsinai1\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();//maximize()
	driver.manage().deleteAllCookies();//deleteAllCookies()
	
	driver.get("https://www.mountsinai.org/");
	homePage =new HomePage(driver);
}
	
@AfterMethod
public void tearUp() {
driver.quit();	
	
	
}



}







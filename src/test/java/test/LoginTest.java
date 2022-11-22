package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashbroadPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	String userName ="demo@techfios.com";
	String password ="abc123";
	
   @Test
	public void validUserLogin() {
	driver=	BrowserFactory.init();
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.insertusername(userName);
	loginpage.insertpassword(password); 
	loginpage.clickbutton();
	
	DashbroadPage dashbordpage = PageFactory.initElements(driver, DashbroadPage.class);
	dashbordpage.validateDashboard();
	
	BrowserFactory.tearDown();
	}
  
}

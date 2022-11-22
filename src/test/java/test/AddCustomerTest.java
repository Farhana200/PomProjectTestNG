package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCutomerpage;
import page.DashbroadPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
//	Login data
	String userName ="demo@techfios.com";
	String password ="abc123";
//	test data
	String fullname = "Excel File";
	String company  = "Amazon";
	String email = "freds@gmail.com";
	String phone = "098154367";
	@Test
	public void validUserLogin() throws InterruptedException {
	driver=	BrowserFactory.init();
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.insertusername(userName);
	loginpage.insertpassword(password); 
	loginpage.clickbutton();
	
	DashbroadPage dashbordpage = PageFactory.initElements(driver, DashbroadPage.class);
	dashbordpage.validateDashboard();
	Thread.sleep(5000);
	dashbordpage.clickcustomer();
    dashbordpage.addCustomer();
    
    AddCutomerpage addCustomerPage = PageFactory.initElements(driver,   AddCutomerpage.class);
	addCustomerPage.insertFullName(fullname);
	addCustomerPage.companyDropDown(company);
	addCustomerPage.emaliId(email);
	addCustomerPage.insertPhoneNum(phone);
	
	
	
	
	
//	BrowserFactory.tearDown();
	}
	
	
	

}
package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCutomerpage extends BasePage {

	WebDriver driver;
	public AddCutomerpage () {
		this.driver = driver;
	}
//	WebElement list
	@FindBy(how=How.XPATH,using="//input[@id='account']")WebElement FullName_Element;
	@FindBy(how=How.XPATH,using="//select[@id='cid']")WebElement Company_Element;
	@FindBy(how=How.XPATH,using="//input[@name='email']")WebElement Email_Element;
	@FindBy(how=How.XPATH,using="//input[@id='phone']")WebElement Phone_Element;
	
// coresponding method 	
	public void insertFullName(String fullName) {
		String insertedname = fullName + genarateRandomNum(999);
		FullName_Element.sendKeys(insertedname); 
 	}
	public void companyDropDown(String company ) {
		selectFromDropDown(Company_Element, company);
	}
	public void emaliId(String email) {
		String insertedEmail = genarateRandomNum(666)+ email;
		Email_Element.sendKeys(insertedEmail);
	}
	public void insertPhoneNum(String phone) {
		String insertedPhone = phone + genarateRandomNum(999);
		Phone_Element.sendKeys(insertedPhone);
	}
	}
	
	
	
	


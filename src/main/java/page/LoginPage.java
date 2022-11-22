package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// WebElement List
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement Singin_Element;

	// Corresponding Method
	public void insertusername(String username) {
		UserName_Element.sendKeys(username);
	}

	public void insertpassword(String password) {
		Password_Element.sendKeys(password);
	}

	public void clickbutton() {
		Singin_Element.click();
	}

}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashbroadPage {
	WebDriver driver;

	public DashbroadPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement list
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard')]")
	WebElement Dashbroad_Element;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement Customer_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement AddCustomer_Element;

	// coresponding method
	public void validateDashboard() {
		Assert.assertEquals(Dashbroad_Element.getText(),"Dashboard", "dashboard page is not found");
	}

	public void clickcustomer() {
		Customer_Element.click();
	}

	public void addCustomer() {
		AddCustomer_Element.click();
	}

}


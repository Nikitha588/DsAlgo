package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph extends BaseClass {

	WebDriver driver; 

	public void GraphPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css="a[data-toggle='dropdown']")
	WebElement dropdown;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[contains(text(),'Graph')]")
	WebElement graphdropdown;
	
	public void Clickdropdown() {
		dropdown.click();
	}
	
	public void dropdownList() {
		graphdropdown.click();
	}

}

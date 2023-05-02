package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.driversetup;
import stepdefinitions.BasePage;

public class Arrays extends BasePage {
	WebDriver driver =driversetup.getDriver();
	@FindBy(xpath = "//body//div[2]//a[text()='Get Started']")  WebElement arrayGetStarted;

	@FindBy(xpath = "//a[text()='Arrays in Python']") WebElement arraysInPython;

	@FindBy(xpath = "//a[text()='Try here>>>']") WebElement tryHere;

	@FindBy(xpath ="//form[@id='answer_form']/div/div/div/textarea") WebElement textbox;
@FindBy(css = "div[class='CodeMirror-lines']") WebElement texteditorbox;
	@FindBy(xpath ="//button[text()='Run']") WebElement runbutton;

	@FindBy(xpath = "//pre[@id='output']") WebElement output;
	@FindBy(xpath = "//form[@id='answer_form']/div//div[6]//span//span") WebElement txtclr;
	@FindBy(linkText = "Arrays Using List") WebElement Arraysusinglist;
	@FindBy(linkText = "Basic Operations in Lists")WebElement BOInList;
	@FindBy(linkText = "Applications of Array") WebElement AppOfArray;
	@FindBy(linkText = "Practice Questions") WebElement PraQuestions;
	@FindBy(linkText = "Search the array") WebElement Question1;
	@FindBy(linkText = "Max Consecutive Ones") WebElement Question2;
	@FindBy(linkText = "Find Numbers with Even Number of Digits") WebElement Question3;
	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']") WebElement Question4;
	@FindBy(xpath = "//span[@role='presentation']") WebElement Quetxtbox;
	
	
	
	public Arrays (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ArrayGetStarted() {

		arrayGetStarted.click();
	}

	public void ArraysInPython() {
		arraysInPython.click();
	}

	public void TryHere() {
		tryHere.click();
	}

	public void Txtarea(String pythoncode,String output) {

		textbox.sendKeys(pythoncode);
		System.out.println(pythoncode);
		//Boolean isRequired = false;
		//return isRequired;

	}
	public void textclear() {
		
		driver.navigate().back();
	}

	public void Runbutton() {
		runbutton.click();
	}
	public String outPut() {
		
	return output.getText(); 
		
	}
	public String gethomepageTitle() {
		return "NumpyNinja";

	}
	public void arraysList() {
		Arraysusinglist.click();
	}
	public void BasicOpInList() {
		BOInList.click();
	}
	public void ApplOfArray() {
		AppOfArray.click();
	}
	public void PraQues() {
		PraQuestions.click();
	}
	public void que1() {
		Question1.click();
	}
	public void que2() {
		Question2.click();
	}
	public void que3() {
		Question3.click();
	}
	public void que4() {
		Question4.click();
	}
	public void txteditorclr()  {
		//texteditorbox.isSelected();
		String s = Keys.chord(Keys.CONTROL,"a");
		
		textbox.sendKeys(s);
		textbox.sendKeys(Keys.DELETE);
		//Thread.sleep(1000);
	}
}

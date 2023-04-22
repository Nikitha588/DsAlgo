package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Graph {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Chrome browser launch
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nikit\\Desktop\\Sdet\\SDET\\Assignments\\Java\\DsAlgoProject\\src\\test\\resources\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
		
		//Sign-in
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("id_username")).sendKeys("Dummy111");
		driver.findElement(By.id("id_password")).sendKeys("NumpyNinja@00");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		//Home Page
		WebElement dd = driver.findElement(By.cssSelector("a[data-toggle='dropdown']"));
		Actions a = new Actions(driver);
		a.moveToElement(dd).click().build().perform();
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[contains(text(),'Graph')]")).click();
		
		//Graph Page
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input']/div")).sendKeys("print('Hello')");
		driver.findElement(By.xpath("//button[contains(text(),'Run')]")).click();
		
		
		
		
	}//End of main method
	
}//End of class

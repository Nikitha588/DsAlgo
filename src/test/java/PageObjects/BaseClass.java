package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public void initializeDriver() throws IOException  
	{
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path + "//src//test//resources//Config_files//Config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver","C://Users//nikit//Desktop//Sdet//SDET//Assignments//Java//DsAlgoProject//src//test//resources//Drivers//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			 driver = new ChromeDriver(options);
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C://Users//nikit//Desktop//Sdet//SDET//Assignments//Java//DsAlgoProject//src//test//resources//Drivers//geckodriver.exe");
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			System.setProperty("webdriver.edge.driver", "C://Users//nikit//Desktop//Sdet//SDET//Assignments//Java//DsAlgoProject//src//test//resources//Drivers//msedgedriver.exe");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
}

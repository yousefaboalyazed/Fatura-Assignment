package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {
	static WebDriver driver;
	public void initializeDriver() {
		WebDriverManager.chromedriver().browserVersion("4.0.0-beta-3").setup();
		driver =new ChromeDriver();
		
	}
	public void closeDriver() {
		this.driver.quit();
	}
	public WebDriver getDriver() {
		return this.driver;
	}
	 public void navigateTo() {
		 driver.navigate().to("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
	 }
}

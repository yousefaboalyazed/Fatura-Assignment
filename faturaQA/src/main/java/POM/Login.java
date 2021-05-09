package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

import pages.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		//error login messages
		String expectedV1 = "Epic sadface: Username is required";
		String expectedV2 = "Epic sadface: Password is required";
		String expectedV3 = "Epic sadface: Username and password do not match any user in this service";
		//Open Login Page
		driver driverr=new driver();
		driverr.initializeDriver();
		driverr.navigateTo();
		//Enter Login scenario that you want to test
		login loginn=new login();
		loginn.getUserName().sendKeys("user name");//user name
		loginn.getPassword().sendKeys("pass");//password
		loginn.getButton().click();
		String actualMessage=driverr.getDriver().findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")).getText();
		System.out.print(actualMessage);
		if(actualMessage.equals(expectedV1) || actualMessage.equals(expectedV2)|| actualMessage.equals(expectedV3)) {
			System.out.print(actualMessage);
		}
	}	
}

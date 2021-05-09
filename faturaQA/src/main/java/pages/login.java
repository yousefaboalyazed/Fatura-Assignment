package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends driver{

	private WebElement userName =getDriver().findElement(By.xpath("//input[@id='user-name']"));
	private WebElement password =getDriver().findElement(By.xpath("//input[@id='password']"));
	private WebElement button =getDriver().findElement(By.xpath("//input[@id='login-button']"));
	public  WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getButton() {
		return button;
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Info extends driver{
	private WebElement firstName =getDriver().findElement(By.xpath("//input[@id='first-name']"));
	private WebElement lastName =getDriver().findElement(By.xpath("//input[@id='last-name']"));
	private WebElement postalCode =getDriver().findElement(By.xpath("//input[@id='postal-code']"));
	private WebElement continueBtn =getDriver().findElement(By.xpath("//input[@id='continue']"));
	
	public WebElement firstName() {
		return firstName;
	}
	public WebElement lastName() {
		return lastName;
	}
	public WebElement postalCode() {
		return postalCode;
	}
	public WebElement continueBtn() {
		return continueBtn;
	}

}

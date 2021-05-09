package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class card extends driver{
	private WebElement romoveFirstProduct =getDriver().findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	private WebElement continueShopingBtn =getDriver().findElement(By.xpath("//button[@id='continue-shopping']"));
	public WebElement  romoveFirstProduct() {
		return romoveFirstProduct;
	}
	public WebElement  continueShopingBtn() {
		return continueShopingBtn;
	}
}

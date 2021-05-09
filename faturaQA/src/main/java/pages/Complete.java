package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Complete extends driver {
	private WebElement BackHomeBtn =getDriver().findElement(By.xpath("//button[@id='back-to-products']"));
	private WebElement shopingCardBtn =getDriver().findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
	private WebElement drawer =getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	public WebElement BackHomeBtn() {
		return BackHomeBtn;
	}
	public WebElement shopingCardBtn() {
		return shopingCardBtn;
	}
	public WebElement drawer() {
		return drawer;
	}
}

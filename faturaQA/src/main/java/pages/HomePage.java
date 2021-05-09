package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends driver {
	private WebElement sortValue =getDriver().findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]"));
	private WebElement drawer =getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	private WebElement logout =getDriver().findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	private WebElement addFirstProduct =getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	private WebElement addSecondProduct =getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
	private WebElement addThirdProduct =getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
	private WebElement shopingCardBtn =getDriver().findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));

	public WebElement getSortButton() {
		return sortValue;
	}
	public WebElement getDrawerButton() {
		return drawer;
	}
	public WebElement  logOut() {
		return logout;
	}
	public WebElement  addFistProductToCard() {

		return addFirstProduct;
	}
	public WebElement  addSecondProductToCard() {

		return addSecondProduct;
	}
	public WebElement  addThirdProductToCard() {
		return addThirdProduct;
	}
	public WebElement  shopingCardBtn() {
		return shopingCardBtn;
	}

}


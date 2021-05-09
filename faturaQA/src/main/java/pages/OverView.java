package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverView extends driver{
	private WebElement FinishBtn =getDriver().findElement(By.xpath("//button[@id='finish']"));
	public WebElement FinishBtn() {
		return FinishBtn;
	}
}

package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Complete;
import pages.HomePage;
import pages.Info;
import pages.OverView;
import pages.card;
import pages.driver;
import pages.login;

public class CheckOut {
public static void main(String[] args) {
	driver driverr=new driver();
	driverr.initializeDriver();
	driverr.navigateTo();
	//doLogin 
	login loginn=new login();
	loginn.getUserName().sendKeys("standard_user");//valid user name
	loginn.getPassword().sendKeys("secret_sauce");//valid password
	loginn.getButton().click();
	System.out.print("tmaaaaaaaaaaaam");
	//add three product to card
	HomePage homepage=new HomePage();
	homepage.addFistProductToCard().click();
	homepage.addSecondProductToCard().click();
	homepage.addThirdProductToCard().click();
	//move to my card 
	homepage.shopingCardBtn().click();
	card cardd=new card();
	cardd.romoveFirstProduct().click();//remove first product
	cardd.continueShopingBtn().click();
	//back to add more products
	driverr.getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	driverr.getDriver().findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
	driverr.getDriver().findElement(By.xpath("//button[@id='checkout']")).click();
	//fill form and click continue
	Info data=new Info();
	try {
		data.firstName().sendKeys("Youssef");//add first name
		data.lastName().sendKeys("Aboelyazed");//add last name
		data.postalCode().sendKeys("1912");//add postal code
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.print("error");
		e.printStackTrace();
	}
	data.continueBtn().click();
	//view card before submit order
	OverView view=new OverView();
	view.FinishBtn().click();
	//back to home 
	Complete complete =new Complete();
	complete.BackHomeBtn().click();
}
}

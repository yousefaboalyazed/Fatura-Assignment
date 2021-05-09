package POM;

import org.openqa.selenium.support.ui.Select;

import pages.HomePage;
import pages.driver;
import pages.login;

public class Sort {

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
	//select sort value
	HomePage homepage=new HomePage();
	Select sel=new Select(homepage.getSortButton());
	sel.selectByVisibleText("Price (low to high)");  //insert sort type
	System.out.print("done");
	
}
}

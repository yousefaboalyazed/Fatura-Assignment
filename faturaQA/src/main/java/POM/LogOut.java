package POM;

import org.openqa.selenium.support.ui.Select;

import pages.HomePage;
import pages.driver;
import pages.login;

public class LogOut {
public static void main(String[] args) {
	driver driverr=new driver();
	driverr.initializeDriver();
	driverr.navigateTo();
	//doLogin 
	login loginn=new login();
	loginn.getUserName().sendKeys("standard_user");//valid user name
	loginn.getPassword().sendKeys("secret_sauce");//valid password
	loginn.getButton().click();
	System.out.print("tmaam");
	//click logout
		HomePage homepage=new HomePage();
		try {
			homepage.getDrawerButton().click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("error");

		}
		homepage.logOut().click();
		System.out.print("done");
}
}

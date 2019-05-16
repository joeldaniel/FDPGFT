package pages.actions;

import base.Testbase;
import pages.locators.Loginpagelocators;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import org.openqa.selenium.support.PageFactory;

public class Loginpageactions extends Testbase{
	
	public Loginpagelocators login;
	
	public Loginpageactions(){
		
		this.login = new Loginpagelocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.login);
		
	}
	public void logintoFD(String user, String pass, String servername, String sitename) throws Exception {
		if (user != null && pass != null) {
			login.LoginId.clear();
			login.LoginId.sendKeys(user);
			login.Password.clear();
			login.Password.sendKeys(pass);
			login.Server.clear();
			login.Server.sendKeys(servername);
			login.Site.clear();
			login.Site.sendKeys(sitename);
			login.LoginBtn.click();
		}
	}

}

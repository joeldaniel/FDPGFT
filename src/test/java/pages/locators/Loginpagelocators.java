package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpagelocators {

	@FindBy(xpath="//div[@class='loginpage ng-star-inserted']//div[1]//input[1]")
	public WebElement LoginId;
	@FindBy(xpath="//input[@type='password']")
	public WebElement Password;
	@FindBy(xpath="//div[3]//input[1]")
	public WebElement Server;
	@FindBy(xpath="//div[@class='dot-rightpane']//div[4]//input[1]")
	public WebElement Site;
	@FindBy(xpath="//span[@class='btn-label']")
	public WebElement LoginBtn;
	
	
	
}

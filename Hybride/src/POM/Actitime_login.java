package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;

public class Actitime_login extends Base_page
{
@FindBy(id="username")
private WebElement user;

@FindBy(name="pwd")
private WebElement pass;

@FindBy(xpath="//div[.='login']")
private WebElement lgn_btn;

public Actitime_login(WebDriver driver)
{
	super(driver);
}
public void username(String usern)
{
	user.sendKeys(usern);
}
public void password(String passw)
{
pass.sendKeys(passw);	
}
public void login()
{
	lgn_btn.click();
}
}

package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_constants
{
WebDriver driver;
@BeforeMethod
public void open()
{
	System.setProperty(crome_Key, crome_Value);
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://localhost/login.do");
	driver.get(url);
}
@AfterMethod
public void close(ITestResult res)
{
	if(ITestResult.FAILURE == res.getStatus())
	{
		GenericScreenshot.getPhoto(driver);
	}
	Thread.sleep(4000);
driver.close();
}
}

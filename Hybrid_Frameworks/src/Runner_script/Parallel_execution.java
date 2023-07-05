package Runner_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_execution 
{
public WebDriver driver;
@Test
@Parameters({"browser"})
public void exce(String browser)
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	else
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
	}
		}

}

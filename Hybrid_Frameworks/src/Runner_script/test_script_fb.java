package Runner_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_script.pom_script_fb;

public class test_script_fb 
{

	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	      pom_script_fb p = new  pom_script_fb (driver);
		Thread.sleep(5000);
		p.passUN("shobharani");
		p.passPwd("shobha@123");
		p.clicklogin();
		Thread.sleep(5000);
		//driver.close();
		
}
}

package Runner_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider 
{
@Test(dataProvider = "testdata")
public void validTest(String un,String pwd)
{
System.setProperty("webdriver.chrome.driver","./Software/Chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys(un);
driver.findElement(By.id("pass")).sendKeys(pwd);
driver.findElement(By.id("login")).click();
driver.close();
}
@DataProvider(name="testdata")
public Object[][] createData()
{
	return new Object[][]
			{
		{"shobha","admin"},
		{"bhoomi","manager"}
};
}
}

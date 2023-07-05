package incogintoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito_script 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
}
}

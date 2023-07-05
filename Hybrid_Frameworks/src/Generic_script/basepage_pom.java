package Generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage_pom
{
public WebDriver driver;
public basepage_pom(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}

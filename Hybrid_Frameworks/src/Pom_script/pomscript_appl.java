package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomscript_appl
{
@FindBy(id="firstName")private WebElement FName;
@FindBy(id="lastName")private WebElement LName;
@FindBy(id="userEmail")private WebElement Email;
@FindBy(xpath="//label[@for='gender-radio-2']") private WebElement rb;
@FindBy(id="userNumber")private WebElement number;
@FindBy(xpath="//input[@id='dateofBirthInput']")private WebElement dob ;
public pomscript_appl(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void passFN(String FN)
{
FName.sendKeys(FN);
}
public void passLN(String Ln)
{
LName.sendKeys(Ln);
}
public void passMail(String em)
{
	Email.sendKeys(em);
	}
public void radio( )
{
rb.click();
}
public void passno(String pnumber)
{
number.sendKeys(pnumber);
}
public void passdate(String date )
{
	dob.sendKeys(date);
}
}

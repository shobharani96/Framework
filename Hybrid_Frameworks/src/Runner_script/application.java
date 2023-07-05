package Runner_script;

import org.testng.annotations.Test;

import Generic_script.generic_application;
import Pom_script.pomscript_appl;

public class application extends generic_application 
{
	@Test
	public  void test1()
	{
		pomscript_appl p=new pomscript_appl(driver);
		p.passFN("shobha");
		p.passLN("rani");
		p.passMail("ranishobha@gmail.com");
		p.radio();
		p.passno("8522258224");
		p.passdate("12/8/1996");
}
}

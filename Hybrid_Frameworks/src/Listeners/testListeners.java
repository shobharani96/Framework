package Listeners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testListeners implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("tc passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
	System.out.println("tc failed");
	Assert.fail();
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("tc skipped");
	}

}


package Listeners;

import org.testng.annotations.Test;

public class runner_script
{
public class Depend1
{
	@Test
	public void test1()
	{
		System.out.println("hello world");
	}
	@Test
	public void test2()
	{
		System.out.println("hello asia");
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("hello bangalore");
	}
}
}

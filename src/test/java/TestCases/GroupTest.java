package TestCases;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = "Sanity")
	public void method1()
	{
		System.out.println("This is Method1");
	}
	@Test(groups = {"Sanity","Regression"})
	public void method2()
	{
		System.out.println("This is Method2");
	}
	@Test(groups = {"Sanity","Regression"})
	public void method3()
	{
		System.out.println("This is Method3");
	}
	@Test(groups = "Regression")
	public void method4()
	{
		System.out.println("This is Method4");
	}
	@Test(groups = "Regression")
	public void method5()
	{
		System.out.println("This is Method5");
	}

}

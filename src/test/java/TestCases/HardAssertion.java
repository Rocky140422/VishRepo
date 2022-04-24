package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void Method1()
	{
		System.out.println("Method1");
		Assert.assertEquals("Automation", "Automation","He Barobar ahe ka?");
		System.out.println("Method is printing after passing");
	}
	@Test
	public void Method2()
	{
		System.out.println("Method2");
		System.out.println("Method1");
		Assert.assertEquals(400, 400,"He Barobar ahe ka?");
		System.out.println("Method is printing after passing");
	}
	@Test
	public void Method3()
	{
		System.out.println("Method3");
		Assert.assertTrue(true);
	}
	@Test
	public void Method4()
	{
		System.out.println("Method4");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Method5()
	{
		System.out.println("Method5");
		Assert.assertFalse(false);
	}
	
	@Test
	public void Method6()
	{
		System.out.println("Method6");
		Assert.assertFalse(true);
	}
	
	
	
	

}

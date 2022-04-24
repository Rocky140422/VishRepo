package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login= new LoginPage();
	}
	
	@Test
	public void validatePageTitleTest()
	{
		login.validateLoginPageTitle();
	}
	@Test
	public void validateKiteLogoTest()
	{
		login.validateKiteLogo();
	}
	@Test
	public void validateZerodhaLogoTest()
	{
		
		login.validateZerodhaLogo();
	}
	@Test
	public void zerodhaLoginAccTest() throws InterruptedException
	{
		login.zerodhaLoginAcc();
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}

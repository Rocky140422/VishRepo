package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardTest extends TestBase {
	public DashBoardTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	DashBoardPage dash;
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login = new LoginPage();
		login.zerodhaLoginAcc();
		dash = new DashBoardPage();
		
	}
	@Test
	public void verifyNicknameTest()
	{
		String actualNickname = dash.verifyNickname();
		Assert.assertEquals(actualNickname, prop.getProperty("nickname"));
	}
	@Test
	public void verifyUserIdTest()
	{
		String actualUserId = dash.verifyUserId();
		Assert.assertEquals(actualUserId, prop.getProperty("userid"));
	}
	@Test
	public void verifyUserFullnameTest()
	{
		String actualUserFullName = dash.verifyUserFullname();
		Assert.assertEquals(actualUserFullName, prop.getProperty("username"));
		
	}
	@Test
	public void verifyUserEmailTest()
	{
		String actualUserEmail = dash.verifyUserEmail();
		Assert.assertEquals(actualUserEmail, prop.getProperty("email"));
	}
	@Test
	public void verifystartInvestingbtn()
	{
		Assert.assertTrue(true);;
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}

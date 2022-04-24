package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase{
	LoginPage login;
	DashBoardPage dash;
	
	OrderPage order;
	public OrderPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		login = new LoginPage();
	    dash = new DashBoardPage();
		order = new OrderPage();
		login.zerodhaLoginAcc();
		order.clickOrder();
		order.clickGtt();
		
	}
	
	@Test
	
	public void completeGttOederTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		order.completeGttOrder();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}

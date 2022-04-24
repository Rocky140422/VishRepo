package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Object Repository
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="//input[@id='pin']") private WebElement pinTextbox;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement contiueBtn;
	public LoginPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void validateLoginPageTitle()
	{
		driver.getTitle();
	}
	
	public void validateKiteLogo()
	{
		kiteLogo.isDisplayed();
	}
	
	public void validateZerodhaLogo()
	{
		zerodhaLogo.isDisplayed();
	}
	
	public void zerodhaLoginAcc() throws InterruptedException 
	{
		Thread.sleep(1000);
		userIdTextBox.sendKeys(prop.getProperty("userid"));
		Thread.sleep(1000);
		passwordTextBox.sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(1000);
		pinTextbox.sendKeys(prop.getProperty("pin"));
		Thread.sleep(1000);
		contiueBtn.click();
		Thread.sleep(1000);
		
		
	}
 }

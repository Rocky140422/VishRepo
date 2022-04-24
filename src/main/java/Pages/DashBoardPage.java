package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement nickname;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath="//h4[@class='username']") private WebElement userFullName;
	@FindBy(xpath="//div[@class='email']") private WebElement userEmail;
	@FindBy(xpath="//button[text()='Start investing ']") private WebElement startInvetingBtn;
	
	public DashBoardPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNickname() 
	{
		return nickname.getText();
	}
	
	public String verifyUserId() 
	{
		return userId.getText();
	}
	
	public String verifyUserFullname()
	{
		userId.click();
		return userFullName.getText();
	}
	
	public String verifyUserEmail()
	{
		userId.click();
		return userEmail.getText();
	}
	
	public void startInvestingbtn()
	{
		
		startInvetingBtn.isEnabled();
		
	}

}

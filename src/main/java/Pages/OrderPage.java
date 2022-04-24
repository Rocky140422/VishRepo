package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase{
	@FindBy(xpath = "//span[text() = 'Orders']") private WebElement orderLink;

	@FindBy(xpath = "//span[text()='GTT']") private WebElement getGttLink;
	@FindBy(xpath = "//button[@type='button']") private WebElement newGttBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement searchBarGtt;
	@FindBy(xpath = "(//span[@class='tradingsymbol'])[1]") private WebElement selectShare;
	@FindBy(xpath = "//button[text()='Create GTT ']") private WebElement createGttBtn;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement triggerPriceTextbox;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement qtyTextbox;
	@FindBy(xpath = "//input[@label='Price']") private WebElement priceTextbox;
	@FindBy(xpath = "//div[text()='Place']") private WebElement placeBtn;
	@FindBy(xpath="//span[text()='INFY']") private WebElement sharename;
	@FindBy(xpath="//span[@class='icon icon-ellipsis']") private WebElement options;
	@FindBy(xpath="//span[@class='icon icon-times']") private WebElement delete;
	
	public OrderPage() throws IOException {
		super();
	
		PageFactory.initElements(driver, this);
	}

	public void clickOrder()
	{
		orderLink.click();
	}
	public void clickGtt() throws InterruptedException
	{
		getGttLink.click();
		Thread.sleep(2000);
	}
	
	public void completeGttOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		newGttBtn.click();
		Thread.sleep(1000);
		searchBarGtt.sendKeys(Utility.Util.readExcel(0, 0));
		Thread.sleep(1000);
		selectShare.click();
		Thread.sleep(1000);
		createGttBtn.click();
		Thread.sleep(1000);
		triggerPriceTextbox.clear();
	    Thread.sleep(1000);
	    triggerPriceTextbox.sendKeys(Utility.Util.readExcel(0, 1));
		Thread.sleep(1000);
		qtyTextbox.clear();
		Thread.sleep(1000);
		qtyTextbox.sendKeys(Utility.Util.readExcel(0, 2));
		priceTextbox.clear();
		Thread.sleep(1000);
		priceTextbox.sendKeys(Utility.Util.readExcel(0, 3));
		Thread.sleep(1000);
		placeBtn.click();
		Thread.sleep(1000);	
		sharename.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
	}

}

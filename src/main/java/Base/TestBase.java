package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkPractice\\Config\\Config.properties");
		prop.load(file);
	}
	public static void initialization()
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		//driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}

package academy;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initalize() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Arun\\my-proj\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser_name = prop.getProperty("browser");
		System.out.println(browser_name);

		if (browser_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser_name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\workspace\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser_name.equals("ie")) {
			System.out.println("ie browser");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(src,new File("C:\\Users\\Arun\\eclipse-workspaceSindhu\\"+result+"image.png"));

	}

}

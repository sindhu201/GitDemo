package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	By id=By.id("user_email");
	By pswrd=By.id("user_password");
	By submit=By.cssSelector("[value='Log In']");
	
	public WebElement username() {
		return driver.findElement(id);
	}
	public WebElement pasword() {
		return driver.findElement(pswrd);
	}
	public WebElement submt() {
		return driver.findElement(submit);
	}
	

}

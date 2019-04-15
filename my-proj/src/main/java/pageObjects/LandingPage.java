package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	By signin = By.partialLinkText("Login");
	By title = By.cssSelector("div[class=\"text-center\"]");
	By navigate = By.cssSelector("nav[class=\"navbar-collapse collapse\"]");
	By popup = By.xpath("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement login() {
		return driver.findElement(signin);
	}

	public WebElement title_log() {
		return driver.findElement(title);
	}

	public WebElement navigate_log() {
		return driver.findElement(navigate);
	}

	public int popupsize() {
		return driver.findElements(popup).size();
	}

	public WebElement popup() {
		return driver.findElement(popup);
	}
}

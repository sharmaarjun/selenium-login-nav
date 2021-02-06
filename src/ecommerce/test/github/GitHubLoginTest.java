package ecommerce.test.github;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

class GitHubLoginTest {

WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		// 1. set selenium properties
				System.setProperty("webdriver.gecko.driver", 
						"C:\\Users\\Arjun Sharma\\eclipse-workspace\\phase1-selenium-scripting\\driver\\geckodriver.exe");
				
				// 2. Instantiating web driver
				driver = new FirefoxDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void findElement() {
		String siteUrl = "https://github.com/login";
		driver.get(siteUrl);
	
		WebElement email = driver.findElement(By.id("login_field"));
		email.sendKeys("");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		
		//WebElement login = driver.findElement(By.id("#login > div.auth-form-body.mt-3 > form > input.btn.btn-primary.btn-block"));
		WebElement login = driver.findElement(By.cssSelector("#login > div.auth-form-body.mt-3 > form > input.btn.btn-primary.btn-block"));
		login.submit();
		
		//email.clear();
		//password.clear();
	}
	@Test
	public void findElementInvalid() {
		String siteUrl = "https://github.com/login";
		driver.get(siteUrl);
	
		WebElement email = driver.findElement(By.id("login_field"));
		email.sendKeys("sharma@gmail.com");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abc");
		
		//WebElement login = driver.findElement(By.id("#login > div.auth-form-body.mt-3 > form > input.btn.btn-primary.btn-block"));
		WebElement login = driver.findElement(By.cssSelector("#login > div.auth-form-body.mt-3 > form > input.btn.btn-primary.btn-block"));
		login.submit();
		Assert.assertEquals("div", login.getText());
		email.clear();
		password.clear();
		WebElement errortext = driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div/button/svg"));
		System.out.println("Text is ::"+errortext.getText());
	}
}

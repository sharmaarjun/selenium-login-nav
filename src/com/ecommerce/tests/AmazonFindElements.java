package com.ecommerce.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

class AmazonFindElements {
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
		String siteUrl = "https://www.amazon.in/";
		driver.get(siteUrl);
		
		// Get the web element by id
		WebElement searchBox1 = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Search tag name "+ searchBox1.getTagName());
		Assert.assertEquals("input", searchBox1.getTagName());
		
		// Get the web element by class
		
		// Get the web element by name
		
		// Get the web element by tagname
		
		// Get the web element by css selector
		
		// Get the web element by absolute xpath
		
		// Get the web element by relative xpath
		
	}

}

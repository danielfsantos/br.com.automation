package com.automation.br.com.automation.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class configDriver {
	
	public WebDriver getDriver() {		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Daniel/eclipse-workspace/br.com.automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}

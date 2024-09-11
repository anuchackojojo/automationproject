package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Gstore;

public class Gstore1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.giva.co/pages/store-locator");
	}
	@Test
	public void test()
	{
		Gstore ob2=new Gstore(driver);
		ob2.setvalues("mumbai");
		ob2.check();
		
		
	}

}

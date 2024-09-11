package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Gsignup;

public class Gsignup1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.giva.co/account/register");
	}
	@Test
	public void test()
	{
		Gsignup ob1=new Gsignup(driver);
		ob1.setup("Anu", "Chacko", "anuchacko2021@gmail.com","9188239462");
		ob1.register();
	}
	
   
}

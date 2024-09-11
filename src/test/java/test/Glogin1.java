package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Glogin;

public class Glogin1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.giva.co/account/login");
	}
    @Test
    public void test()
    {
    	Glogin ob=new Glogin(driver);
    	ob.setvalues("anuchacko2021@gmail.com","9188239462");
    	ob.login();
    	
    	String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expurl="https://www.giva.co/account";
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login failed");
			

	}
    }
    
   
}

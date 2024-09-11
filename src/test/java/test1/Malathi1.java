package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page1.Malathi;

public class Malathi1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://malathisilks.com");
	}
    @Test
    public void test() 
    {
    	Malathi ob=new Malathi(driver);
    	ob.setvalues("sarees");
    	driver.navigate().refresh();
    	ob.main();
        
    	
    	//logo verify
    	 WebElement b = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[2]/div/a/span/img"));
    	 boolean b1=b.isDisplayed();
    	 if(b1)
    	 {
    		 System.out.println("logo verified");
    	 }
    	 else
    	 {
    		 System.out.println("logo not verified");
    	 }
    	 //navigate
    	 driver.navigate().back();
    	 }
}

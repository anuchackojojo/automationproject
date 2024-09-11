package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Givapro;

public class Givapro1 {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.giva.co/?gad_source=1&gclid=Cj0KCQjwq_G1BhCSARIsACc7Nxr9jLe9TdtiAxYEcfZufI_cjeneN8broVZu2kLa5QQwi-H0mxraL14aArEVEALw_wcB");
	}
   @Test
   public void test()
   {
	   Givapro ob=new Givapro(driver);
	   ob.setvalues("chains");
	   ob.click1();
	   
	   //to display logo
	   WebElement srcs = driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16972010619042__header\"]/sticky-header/header/a"));
		boolean b2=srcs.isDisplayed();
		if(b2)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	   
	   boolean src = driver.findElement(By.xpath("//*[@id=\"Details-4-template--16972011372706__main\"]/summary")).isSelected();
	
	//   if(src)
	//   {
		//   System.out.println("dropdown is  selected");
	//  }
	//   else
	//  {
	//	 System.out.println("dropdown is not selected");
	 //  }
	   boolean sr = driver.findElement(By.xpath("//*[@id=\"Facet-4-template--16972011372706__main\"]/fieldset/ul[1]/li[2]/label")).isSelected();
	
	 // if(sr)
	  // {
	//	  System.out.println("checkbox is  selected");
	  // }
	  //else
	  // {
		//  System.out.println("checkbox is not selected");
	//   }
   }
}

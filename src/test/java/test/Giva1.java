package test;

import java.io.File;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Giva;

public class Giva1 {
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
		driver.get("https://www.giva.co/?gad_source=1&gclid=Cj0KCQjwzby1BhCQARIsAJ_0t5M3Gwhgm3i7h-wopA31KghXD6OVM80cckTQuyWge3gs0iM80WM-D4caAmk9EALw_wcB");
	}
	@Test
	public void test() throws Exception
	{
		Giva ob=new Giva(driver);
		ob.setvalue(" Rings");
		ob.set();
		
		
		 //scrolldown 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div[1]/div[3]/h2/strong")).click();
		//screenshot
		WebElement prime=driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div[1]/div[2]/ul/li[2]/a"));
		File src=prime.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./demo//demo1.png"));
		//responsecode
		URL ob1=new URL("https://www.giva.co/search?q=Rings&options%5Bprefix%5D=last");
		HttpURLConnection con= (HttpURLConnection)ob1.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid url");
		}
		
		
	}

}

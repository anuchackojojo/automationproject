package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Malathi {
	WebDriver driver;
	
   By msearch=By.xpath("//*[@id=\"search-header\"]/form/input");
	
     By firstsaree=By.xpath("//*[@id=\"product-46550\"]/div[2]/div/div/div/div[1]/img");
     By addtocart=By.xpath("//*[@id=\"product-46550\"]/div[3]/form/button[1]");
	
	public Malathi(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String search)
	{
		driver.findElement(msearch).sendKeys(search,Keys.ENTER);
		
	}
	public void main()
	{
      
		driver.findElement(msearch).click();
		driver.findElement(firstsaree).click();
		driver.findElement(addtocart).click();
	}
	

}

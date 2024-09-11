package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Giva {
	WebDriver driver;
	By gsearch=By.xpath("//*[@id=\"Search-In-Modal\"]");
	By gwish=By.xpath("//*[@id=\"silver-zircon-layered-ring\"]");
	By gadd=By.xpath("//*[@id=\"ProductSubmitButton-quick-add-7590923108514-submit\"]");
	
	
	
	public Giva(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalue(String search)
	{
		driver.findElement(gsearch).sendKeys(search,Keys.ENTER);
		
	}
    public void set()
    {
    	driver.findElement(gsearch).click();
    	driver.findElement(gwish).click();
    	driver.findElement(gadd).click();
    	
    }
  
    	
    	
    	
    	
    	
    	
    	
    	
    }



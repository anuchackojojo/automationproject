package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Givapro {
	WebDriver driver;
	By gser=By.xpath("//*[@id=\"Search-In-Modal\"]");
	By color=By.xpath("//*[@id=\"Details-4-template--16972011372706__main\"]/summary/div");
    By gold=By.xpath("//*[@id=\"Facet-4-template--16972011372706__main\"]/fieldset/ul[1]/li[2]/label/span[1]/div[1]");
  
	
    public Givapro(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void setvalues(String search)
    {
    	driver.findElement(gser).sendKeys(search,Keys.ENTER);
    }
    public void click1()
    {
    	driver.findElement(gser).click();
    	driver.findElement(color).click();
    	driver.findElement(gold).click();
   
    	
      
    
 }
}

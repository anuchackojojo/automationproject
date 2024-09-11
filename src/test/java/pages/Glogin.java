package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Glogin {
	WebDriver driver;
	By gemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By gpassword=By.xpath("//*[@id=\"CustomerPassword\"]");
	By login=By.xpath("//*[@id=\"customer_login\"]/button");
	
 
	
	
	public Glogin(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void setvalues(String email,String password)
	 {
		 driver.findElement(gemail).sendKeys(email);
		 driver.findElement(gpassword).sendKeys(password);


	 }
	 public void login()
	 {
		 driver.findElement(login).click();
		
	    	
	 }

}

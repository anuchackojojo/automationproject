package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gstore {
	WebDriver driver;
	By gcity=By.xpath("/html/body/main/div/div[1]/div[2]/input");
	By check=By.xpath("/html/body/main/div/div[1]/div[2]/div");
 public Gstore(WebDriver driver)
 {
	 this.driver=driver;
 }
 public void setvalues(String city)
 {
	 driver.findElement(gcity).sendKeys(city);
 }
 public void check()
 {
	 driver.findElement(check).click();
 }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gsignup {
	WebDriver driver;
	By gfirstname=By.xpath("//*[@id=\"RegisterForm-FirstName\"]");
	By glastname=By.xpath("//*[@id=\"RegisterForm-LastName\"]");
	By gemail=By.xpath("//*[@id=\"RegisterForm-email\"]");
	By gpassword=By.xpath("//*[@id=\"RegisterForm-password\"]");
	By register=By.xpath("//*[@id=\"create_customer\"]/button");

	public Gsignup(WebDriver driver)
{
	this.driver=driver;
}
public void setup(String firstname,String lastname,String email,String password)
{
	driver.findElement(gfirstname).sendKeys(firstname);
	driver.findElement(glastname).sendKeys(lastname);
	driver.findElement(gemail).sendKeys(email);
	driver.findElement(gpassword).sendKeys(password);
}
public void register()
{
	driver.findElement(register).click();
}
}


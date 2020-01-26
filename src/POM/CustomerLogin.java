package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin 
{
	   WebDriver driver;
	   
	   @FindBy(name ="login[username]")
	   private WebElement untxtbx;
	   
	   @FindBy(name="login[password]")
	   private WebElement pwd;
	   
	   @FindBy(xpath ="//span[.='Login']")
	   private WebElement Loginbtn;
	   
	   
	  public CustomerLogin(WebDriver driver) 
	  {
		  PageFactory.initElements(driver, this);
		  
	  }
	  public void untxtbxSK(String str)
	  {
		  untxtbx.sendKeys("shivikushwaha.cse@gmail.com");
	  }
	  public void pwdtxtbxSK(String str)
	  {
		  pwd.sendKeys("Shivani123");
	  }
	  public void Loginbtnclk()
	  {
		  Loginbtn.click();
	  }
	  
}

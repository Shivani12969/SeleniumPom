package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
   WebDriver driver;
   @FindBy(xpath ="//abbr[.='Account']")
   private WebElement Accntlnk;
   
   @FindBy(xpath ="//a[.='Sign in']")
   private WebElement signInBtn;
   
   
  public HomePage(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
	  
  }
  public void AccntlnkMHO()
  {
	  Actions act=new Actions(driver);
	  act.moveToElement(Accntlnk).perform();
  }
  public void signInclk()
  {
	  signInBtn.click();
  }
   

}

package pompkg11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypkg11.Utilirtclass11;

public class Loginpage11 extends Utilirtclass11 {

WebDriver driver;
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btn;
	
 public Loginpage11(WebDriver driver)
 
 {    PageFactory.initElements(driver, this);
		this.driver=driver;
		
 }
 
 public void entermail() 
 { expliciteWait(driver, email);
	
	email.sendKeys("9049221706");
 }
 
 public void enterpassword()
 {expliciteWait(driver, pass);
	 pass.sendKeys("amazon@123");
 }
 
 public void clickbtn()
 {expliciteWait(driver, btn);
	 btn.click();
 }  
}

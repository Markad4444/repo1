package pompkg11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypkg11.Utilirtclass11;

public class Homepage11 extends Utilirtclass11 {

	WebDriver driver;
	 
	 @FindBy(xpath="//*[@id=\\\"container\\\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div")
	 private WebElement profilenameIcon;
	 
	 @FindBy(xpath="(//div[@class='ZEl_b_ _1J9ow0 _2ogGYG _23xUYh _3pAV4E']/div/div/ul/li/a/*)[2]")
	 private WebElement profilbtn;
	 
	 @FindBy(xpath="//span[text()='Logout']")
	 private WebElement logoutbtn;
	 
	public Homepage11(WebDriver driver)
	{
	 PageFactory.initElements( driver, this);
	 this.driver=driver;
	}

	public void moveTowordsprofileIcon()
	{
		Actions act= new Actions(driver);
		act.moveToElement(profilenameIcon);
	}

	public void findhideenelementandclick()
	{ expliciteWait(driver, profilbtn);

	profilbtn.click();
	}

	public void clickonlogoutbtn()
	{
		logoutbtn.click();
	}
	}



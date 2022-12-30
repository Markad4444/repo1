package testpkg11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import baseclass11.Baseclass11;
import io.github.bonigarcia.wdm.WebDriverManager;
import pompkg11.Homepage11;
import pompkg11.Loginpage11;

public class testclass11 {
	WebDriver driver;
	Loginpage11 lp;
	Homepage11 hp;
	
@Parameters	("browser")
@BeforeClass
public void beforeclass(String value)
{
	driver=Baseclass11.getWebdriver( value);

}

@BeforeMethod
public void beforemethod()
{
	lp=new Loginpage11(driver);
	hp=new Homepage11(driver);
}
@Test
public void process()
{
	lp.entermail();
	lp.enterpassword();
	lp.clickbtn();
}
}

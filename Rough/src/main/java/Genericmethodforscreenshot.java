import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Genericmethodforscreenshot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions option = new ChromeOptions();
option.addArguments("disable-notifications");
 driver= new ChromeDriver(option);
 driver.get("https:/www.facebook.com");
 WebElement mail=driver.findElement(By.id("email"));
 mail.sendKeys("9049221706");
 driver.findElement(By.id("pass")).sendKeys("8390510730");
 driver.findElement(By.name("login")).click();
 Thread.sleep(2000);
 Genericmethodforscreenshot obj=new Genericmethodforscreenshot();
 obj.togetscreenshot(driver,"E:\\New folder\\Rough\\failedtcscreenshot\\sc");
		
	}
	public String togetscreenshot(WebDriver driver,String path)
	{  Date date= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String str=sdf.format(date);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File(path+str+".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

}

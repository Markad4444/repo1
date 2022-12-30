package utilitypkg11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilirtclass11 {
	public static WebElement expliciteWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
		
		return element1;
	}
	
	public static String getScreenShot(WebDriver driver, String failedtcscreenshot) throws IOException
	{
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = failedtcscreenshot+".png";
		
		File dest = new File(path);
		
		FileHandler.copy(source, dest);
		
		return path;
		}
	
}

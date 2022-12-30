import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seachonbrowserwithoutclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'or @name='field-keywords']"));//field-keywords
		JavascriptExecutor js=(JavascriptExecutor)driver;
        Actions act= new Actions(driver);
        Select s= new Select(searchbox);
        act.moveToElement(searchbox).perform();
		searchbox.sendKeys("books",Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
		
	}

	
}

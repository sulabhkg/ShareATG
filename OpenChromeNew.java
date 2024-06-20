import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChromeNew {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sulabh\\Sulabh_Workspace_Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atg.se");
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//*[@data-test-id='acceptAllCookiesBtn']")).click(); //Accept Cookie button
		
		driver.findElement(By.xpath("//*[@data-test-id='navbar-header-button']")).click(); //Click Menu Icon
		
		driver.findElement(By.id("all-games-toggle")).click(); //Click on Alla Spel
		 
		 WebElement dp_down = driver.findElement(By.id("all-games-toggle"));
		 dp_down.sendKeys(Keys.ARROW_DOWN);
		 dp_down.sendKeys(Keys.ARROW_DOWN);
		 dp_down.sendKeys(Keys.ARROW_DOWN);
		 
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='MuiList-root MuiList-padding horse-1ontqvh']/li"));
		
				for(WebElement element:li)
				{
					
				if(element.findElement(By.xpath("//a[@href='/spel/V4']")).isDisplayed())
						   
				   {
					   element.findElement(By.xpath("//a[@href='/spel/V4']")).click();
					   
					   break;
					   	
				   }
				   				     
				}
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 
					 driver.findElement(By.xpath(".//button[@data-test-id='expand-coupon']")).sendKeys(Keys.RETURN);
					 driver.findElement(By.xpath(".//button[@data-test-id='coupon-button-leg-1-start-4']")).sendKeys(Keys.RETURN);
					 driver.findElement(By.xpath(".//button[@data-test-id='coupon-button-leg-2-start-1']")).sendKeys(Keys.RETURN);
					 driver.findElement(By.xpath(".//button[@data-test-id='coupon-button-leg-3-start-2']")).sendKeys(Keys.RETURN);
					 driver.findElement(By.xpath(".//button[@data-test-id='leg-4-toggle-all']")).sendKeys(Keys.RETURN);
					 driver.findElement(By.xpath(".//button[@data-test-id='play-game-coupon']")).sendKeys(Keys.RETURN);
					 		 
		
}
}		
		

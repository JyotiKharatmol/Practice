package demopac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*  Auto IT is used to controlling desktop applications
 * 
 * 
 */
public class AutoIT_Notes {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://pdftoimage.com/");
		driver.findElement(By.cssSelector("label[class*='button files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Downloads\\script.exe");
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));

		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='button_dark']")));
		driver.findElement(By.cssSelector("button[class*='button_dark']")).click();

		
		File f = new File("C:\\Users\\jyoti_xfiqe3z\\Downloads\\pdftoimage.zip");
		
		if(f.exists())
		{
			System.out.println("File found");
		}
		
		
		
		
		
		
		
	}

}

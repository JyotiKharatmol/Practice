package demopac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadFile_AutoIT {
	public static void main(String[] args) throws IOException, InterruptedException {

		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
		
		HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://pdftoimage.com/");
		driver.findElement(By.cssSelector("div label[aria-label='Upload Files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Downloads\\fileupload.exe");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div button[class*='button_dark']")));
		driver.findElement(By.cssSelector("div button[class*='button_dark']")).click();
		Thread.sleep(5000);
		
		File f = new File(downloadPath+"/pdftoimage.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			f.delete();
			if(f.delete())
			{
				System.out.println("file is deleted");
			}
		}
		
		
		
		
		
		
		
	}

}

package demopac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
//		driver.get("https://the-internet.herokuapp.com/");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Basic Auth")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

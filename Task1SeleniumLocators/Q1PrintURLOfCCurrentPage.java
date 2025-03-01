package SeleniumTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1PrintURLOfCCurrentPage {

	public static void main(String[] args) throws InterruptedException {
		
        // Setup WebDriverManager to manage the WebDriver binaries

       // WebDriverManager.firefoxdriver().setup();

        // Initialize FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        // Navigate to Google
        driver.get("https://www.google.com");

    	System.out.println(driver.getCurrentUrl());
    	
        // Refresh the page
        driver.navigate().refresh();
        
	
		driver.close();
        
        
	}

}

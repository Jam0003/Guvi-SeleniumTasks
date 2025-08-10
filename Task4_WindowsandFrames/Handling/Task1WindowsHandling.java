package SeleniumTask3WindowsandFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// using implicit wait

		String originalwindow=driver.getCurrentUrl();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//switching to new window
		String winHandleBefore = driver.getWindowHandle();

		String original = driver.getWindowHandle();
		
		for (String handle : driver.getWindowHandles()) {
		    if (!handle.equals(original)) {
		        driver.switchTo().window(handle);
		        break; // stop looping once we find the new one
		    }
		}
		//locating elements on new window
		WebElement findingtext = driver.findElement(By.xpath("//h3[text()='New Window']"));
		String text = findingtext.getText();
		
		//Verifying the text on new window
		if (text.equals("New Window")) {
			System.out.println("Text matched");

		} else {
			System.out.println("Text not matched");

		}
		
		String newwindow=driver.getCurrentUrl();
		System.out.println("new window title is"+ newwindow);
		driver.close();
		
		//switching back to original window
		driver.switchTo().window(winHandleBefore);
		
		//verifying the original window is active or not
		if(originalwindow.equals(newwindow)) {
			System.out.println("Original window is not active");
		}else {
			System.out.println("Original window is active");

		}
		driver.quit();

	}

}

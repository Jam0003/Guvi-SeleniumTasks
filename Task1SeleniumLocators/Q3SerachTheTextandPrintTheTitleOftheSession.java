package SeleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3SerachTheTextandPrintTheTitleOftheSession {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		//Enter the search keyword and inspect the suggetion text on which i want to navigate
		 
		//driver.findElement(By.cssSelector("input#searchInput")).sendKeys("Artificial Inteligence");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Inteligence");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='suggestion-text']")).click();   
		//driver.findElement(By.cssSelector("a.suggestion-link")).click(); 
		
		Thread.sleep(5000);
       
		// Searches for the query "Artificial Inteligence"--tell driver to locate search
		// webelement and enter the text for search

		driver.findElement(By.xpath("//a[@href='#History']")).click(); // clcik on History section
		System.out.println(driver.findElement(By.cssSelector("a[href='#History']")).getText()); // Get the title of section
	}

}

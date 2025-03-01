package SeleniumTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2PPrintPageLandedOnTheCorrectWebsite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // initialize chrome driver
		Thread.sleep(3000);
		driver.get("https://demoblaze.com/"); // telling driver to find the website-navigates to the website
		driver.manage().window().maximize();  // maximize the browser window
		System.out.println(driver.getTitle()); // verifies title of the page
		
		if (driver.getTitle().equals("STORE")) // case sensitive text
		{
			System.out.println("Page Landed on the correct website");
		}

		else {
			System.out.println("page not landed on the correct website");
		}
		driver.close();

	}

}

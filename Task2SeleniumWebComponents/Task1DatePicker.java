package SeleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1DatePicker {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("// a[text()='22']"));
		date.click();
		System.out.println(date.getText());
		WebElement selecteddate = driver.findElement(By.xpath("//input[@id='datepicker']"));
		System.out.println(selecteddate.getAttribute("value"));
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}

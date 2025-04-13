package SeleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Task2DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frameElement);
		
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
		actions.build().perform();
		Thread.sleep(2000);
		
		String TargetboxColor = target.getCssValue("color");
		System.out.println("TargetboxColor:"+" "+ TargetboxColor);
		
		
		Color BackgroundColor = Color.fromString(TargetboxColor);
		
		String hexCode = BackgroundColor.asHex();
		
		System.out.println("BackgroundColor of the TargetboxColor is:"+ hexCode);
		
		
		
		
		
	}

}

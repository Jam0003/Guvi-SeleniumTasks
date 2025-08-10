package SeleniumTask3WindowsandFrames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Frames {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement topframe = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topframe);

		List<WebElement> framelist = driver.findElements(By.tagName("frame"));
		System.out.println("No of frames are " + framelist.size());

		WebElement switchleft = driver.findElement(By.name("frame-left"));
		driver.switchTo().frame(switchleft);

		WebElement leftframe = driver.findElement(By.xpath("//body[1]"));
		String store = leftframe.getText();

		if (store.equals("LEFT")) {
			System.out.println("Text LEFT matched");

		} else {
			System.out.println("Text LEFT not matched");

		}

		driver.switchTo().parentFrame();

		WebElement switchmiddle = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(switchmiddle);

		WebElement middleframe = driver.findElement(By.cssSelector("#content"));
		String store1 = middleframe.getText();

		if (store1.equals("MIDDLE")) {
			System.out.println("Text MIDDLE matched");

		} else {
			System.out.println("Text MIDDLE not matched");

		}

		driver.switchTo().parentFrame();

		WebElement switchright = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(switchright);

		WebElement rightframe = driver.findElement(By.xpath("//body[1]"));
		String store2 = rightframe.getText();

		if (store2.equals("RIGHT")) {
			System.out.println("Text RIGHT matched");

		} else {
			System.out.println("Text RIGHT not matched");

		}

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		WebElement switchbottom = driver.findElement(By.name("frame-bottom"));
		driver.switchTo().frame(switchbottom);

		WebElement bottomframe = driver.findElement(By.xpath("//body[1]"));
		String store3 = bottomframe.getText();

		if (store3.equals("BOTTOM")) {
			System.out.println("Text BOTTOM matched");

		} else {
			System.out.println("Text BOTTOM not matched");

		}

		driver.switchTo().parentFrame();

		// driver.switchTo().defaultContent();

		System.out.println(driver.getCurrentUrl());

		if ((driver.getCurrentUrl()).contains("frames")) {
			System.out.println("Title of the page matched");
		} else {
			System.out.println("Title of the page not matched");

		}

		driver.close();

	}

}

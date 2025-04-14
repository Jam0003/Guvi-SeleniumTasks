package Pages03;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base02.ProjectSpecificationMethods;

public class ContactListDisplay005 extends ProjectSpecificationMethods{
	
	@FindBy(xpath = "//td[text()='asad asdasd']")
	WebElement ContactName;
	/*Test the alphabetical order of contact by last name;
    
	WebElement table = driver.findElement(By.id("myTable"));
	List<WebElement> headers = table.findElements(By.tagName("th"));

	for (WebElement header : headers) {
		String text = header.getText();
		System.out.println(text);
		
		 Arrays.sort(text);
		 
	     // Printing the sorted array
	     System.out.println("Sorted Strings: " + Arrays.toString(text));
	     */

	public ContactListDisplay005(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public ContactEditPage006 ContactName()
	{
		ContactName.click();
		return new ContactEditPage006(driver);
	}
		
		

	}


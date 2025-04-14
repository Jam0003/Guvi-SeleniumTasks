package Pages03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base02.ProjectSpecificationMethods;

public class SignupPage002 extends  ProjectSpecificationMethods{

	//public SignupPage002(WebDriver driver) {
		
		
		@FindBy(id = "firstName")
		WebElement FirstName;
		
		
		@FindBy(id = "lastName")
		WebElement LastName;
		
		@FindBy(id = "email")
		WebElement Email;
		
		@FindBy(id = "password")
		WebElement Password;
		
		@FindBy(id = "submit")
		WebElement SubmitButton;

		
	
		
		public SignupPage002 (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		public SignupPage002 FirstName() 
		{
			
			FirstName.sendKeys("Jam");
			return this;
		}
		
		public SignupPage002 LastName() 
		{
			
			LastName.sendKeys("eel");
			return this;
		}
		
		public SignupPage002 Email() 
		{
			
			Email.sendKeys("Jam4@mail.com");
			return this;
		}
		
		public SignupPage002 Password() 
		{
			
			Password.sendKeys("1234567");
			return this;
		}
		
		public ContactListPage004 SubmitButton()
		{
			SubmitButton.click();
			return new ContactListPage004(driver);  
		}
		

//      Alert al = driver.switchTo().alert();
//      String st= driver.switchTo().alert().getText();
//      //sysout
    
      
      

		
	}
		
		


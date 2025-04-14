package Pages03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base02.ProjectSpecificationMethods;

public class ContactListPage004 extends  ProjectSpecificationMethods{



		@FindBy(id = "firstName")
		WebElement FirstName;
		
		@FindBy(id = "lastName")
		WebElement LastName;
		
		@FindBy(id = "birthdate")
		WebElement Birthdate;
		
		@FindBy(id = "email")
		WebElement Email;
		
		@FindBy(id = "phone")
		WebElement Phone;
		
		@FindBy(id = "street1")
		WebElement StreetAddress1;
		
		@FindBy(id = "street2")
		WebElement StreetAddress2;
		
		@FindBy(id = "city")
		WebElement City;
		
		@FindBy(id = "stateProvince")
		WebElement StateorProvince;
		
		@FindBy(id = "postalCode")
		WebElement PostalCode;
		
		@FindBy(id = "country")
		WebElement Country;
		
		@FindBy(id = "submit")
		WebElement AddContactSubmitButton;
		
		public ContactListPage004(WebDriver driver) {	
	
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
			
			public ContactListPage004 FirstName()
			{
				FirstName.sendKeys("Arun");
				return this;
			}
	
			public ContactListPage004 LastName() 
			{
				
				LastName.sendKeys("Kumar");
				return this;
			}

			
			public ContactListPage004 Birthdate() 
			{
				
				Birthdate.sendKeys("2000-01-12");
				return this;
			}
			
			public ContactListPage004 InvalidBirthdate() 
			{
				
				Birthdate.sendKeys("20002-021-112");
				return this;
			}
			
			public ContactListPage004 Email() 
			{
				
				Email.sendKeys("Arun@4c.com");
				return this;
			}
			
			public ContactListPage004 Phone() 
			{
				
				Phone.sendKeys("1234567891");
				return this;
			}
			
			public ContactListPage004 street1() 
			{
				
				StreetAddress1.sendKeys("Area1");
				return this;
			}
			
			public ContactListPage004 street2() 
			{
				
				StreetAddress2.sendKeys("Area2");
				return this;
			}
			
			public ContactListPage004 City() 
			{
				
				City.sendKeys("Erode");
				return this;
			}
			
			public ContactListPage004 StateorProvince() 
			{
				
				StateorProvince.sendKeys("TamilNadu");
				return this;
			}
			
			public ContactListPage004 PostalCode() 
			{
				
				PostalCode.sendKeys("630213");
				return this;
			}
			
			public ContactListPage004 Country() 
			{
				
				Country.sendKeys("India");
				return this;
			}
			
			public ContactListDisplay005 AddContactSubmitButton()
			{
				AddContactSubmitButton.click();
				return new ContactListDisplay005(driver);  
			}
		
		
}

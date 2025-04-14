package Pages03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base02.ProjectSpecificationMethods;

public class HomePage001 extends ProjectSpecificationMethods {
	
	// Verify that the “Sign up button" is displayed
	
	@FindBy(id = "signup")
	WebElement Displaysignup;
	
	
	@FindBy(id = "email")
	WebElement LoginEmail;
	
	
	@FindBy(id = "password")
	WebElement LoginPassword;
	
	@FindBy(id = "submit")
	WebElement LoginSubmitButton;
 
	
	
	
	
	/*Now need to do click action on the element. So before that, we need to create a constructor, bcus we'll invoke the constructor. So through construct. Only we'll pass the method & pass the driver. So we invoke the constructor and also in the constructor Only we will initialize the element, because since we are using
	@FindBy the page factory they are using right? So in the constructor, only we will initialize the page factory elements. So you have to create a constructor public homepage.*/
	
	public HomePage001(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public HomePage001 VisibleSignupButton()
	{
		 /* if (Displaysignup.isDisplayed()) {
		        System.out.println("signup is visible");
		    } else {
		        System.out.println("signup is not visible");
		    */
		        Assert.assertTrue(Displaysignup.isDisplayed());
		    	
	  return this;
	}
	
	
	public HomePage001 EnabledSignupButton()
	{
		/* if (Displaysignup.isEnabled()) {
	        System.out.println("Sign up is enabled");
	    
	    } else {
	        System.out.println("Sign up is not enabled");
	    }
		*/
		
		Assert.assertTrue(Displaysignup.isEnabled());
		  return this;
	}
	
	
	
	public SignupPage002 clicksignup()
	{
		Displaysignup.click();
		
		String ExpectedPageTitle = driver.getTitle();
		String ActualTitle = "Add User";
		
		Assert.assertEquals(ActualTitle, ExpectedPageTitle);
		return new SignupPage002(driver);  
		
		
	}
	
	public HomePage001 VisibleLoginButton()
	{
//		  if (LoginSubmitButton.isDisplayed()) {
//		        System.out.println("Login is visible");
//		    } else {
//		        System.out.println("Login is not visible");
//		    }
		  
		  Assert.assertTrue(LoginSubmitButton.isDisplayed());
		  
		  return this;
			
	}
	
	public HomePage001 EnabledLoginButton()
	{
//		if (LoginSubmitButton.isEnabled()) {
//	        System.out.println("Sign up is enabled");
//	    } else {
//	        System.out.println("Sign up is not enabled");
//	    }
		 Assert.assertTrue(LoginSubmitButton.isEnabled());
		return this;
	}

	
	public HomePage001 LoginEmail() 
	{
		
		LoginEmail.sendKeys("Jam4@mail.com");
		return this;
	}
	
	public HomePage001 InvalidLoginEmail() 
	{
		
		LoginEmail.sendKeys("Jam4444@mail.com");
		return this;
	}
	
	public HomePage001 LoginPassword() 
	{
		
		LoginPassword.sendKeys("1234567");
		return this;
	}
	
	
	public HomePage001 InvalidLoginPassword() 
	{
		
		LoginPassword.sendKeys("00000000");
		return this;
	}
	
	
	public ContactListPage004 DisplayLoginPageTitle()
	{
		LoginSubmitButton.click();
		
		String ExpectedPageTitle = driver.getTitle();
		String ActualTitle = "Contact List";
		
		Assert.assertEquals(ActualTitle, ExpectedPageTitle);
		return new ContactListPage004 (driver);  
	}
}

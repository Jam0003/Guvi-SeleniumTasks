package Test04;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base02.ProjectSpecificationMethods;
import Pages03.HomePage001;

public class TC001_SignUp extends ProjectSpecificationMethods {
	
	@Test
	
	public void SignupTest() {
		
		HomePage001 obj = new HomePage001(driver);
		obj.VisibleSignupButton();
		obj.EnabledSignupButton();
		obj.clicksignup().FirstName().LastName().Email().Password().SubmitButton();
		obj.LoginEmail().InvalidLoginEmail().LoginPassword().InvalidLoginPassword().DisplayLoginPageTitle();
	}
	
	
	

}

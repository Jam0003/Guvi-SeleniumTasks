package Test04;

import org.testng.annotations.Test;

import Base02.ProjectSpecificationMethods;

import Pages03.SignupPage002;

public class TC002_SignupFunctionTest extends ProjectSpecificationMethods {
	
	@Test
public void SignupTest() {
		
	SignupPage002 obj = new SignupPage002(driver);
		
		obj.FirstName();
		obj.LastName();
		obj.Email();
		obj.Password();
		obj.SubmitButton();
		

}
}
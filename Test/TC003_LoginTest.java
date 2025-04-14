package Test04;

import org.testng.annotations.Test;

import Base02.ProjectSpecificationMethods;
import Pages03.HomePage001;



public class TC003_LoginTest extends ProjectSpecificationMethods {
	
	
@Test
	
public void LoginTest() {
		
	HomePage001 obj = new HomePage001 (driver);
		
	obj.VisibleLoginButton();
	obj.EnabledLoginButton();
	obj.DisplayLoginPageTitle();
	
	obj.LoginEmail();
	//obj.InvalidLoginEmail();
	obj.LoginPassword();
	//obj.InvalidLoginPassword();
	obj.DisplayLoginPageTitle();
	

}}

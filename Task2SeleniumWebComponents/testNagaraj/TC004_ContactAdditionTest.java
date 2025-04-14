package Test04;

import org.testng.annotations.Test;

import Base02.ProjectSpecificationMethods;
import Pages03.ContactListPage004;


public class TC004_ContactAdditionTest extends ProjectSpecificationMethods {
	
	@Test
	public void ContanctAdditionTest() {
		
		ContactListPage004 obj = new ContactListPage004(driver);
		
		obj.FirstName();
		obj.LastName();
		obj.Birthdate();
		obj.InvalidBirthdate();
		obj.Email();
		obj.Phone();
		obj.street1();
		obj.street2();
		obj.City();
		obj.StateorProvince();
		obj.PostalCode();
		obj.Country();
		obj.street2();
		obj.AddContactSubmitButton();
		
		
	}

}

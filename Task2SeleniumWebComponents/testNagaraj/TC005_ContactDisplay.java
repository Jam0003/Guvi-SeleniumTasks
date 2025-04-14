package Test04;

import org.testng.annotations.Test;

import Base02.ProjectSpecificationMethods;
import Pages03.ContactListDisplay005;
import Pages03.ContactListPage004;
import Pages03.ProductCategoryPage004;

public class TC005_ContactDisplay extends ProjectSpecificationMethods {
	
	@Test
	public void ContactListDisplayTest() {
		
		ContactListDisplay005 obj = new ContactListDisplay005(driver);
		
		obj.getContactNames();
		obj.isSortedByLastName();
		
		//Test the alphabetical order of contacts by last name.(e.g., Alex B, Paul D, Tom K)
		//Verify the display of phone number with its extensions (e.g.,+91)
		
	
		
		
	}

}

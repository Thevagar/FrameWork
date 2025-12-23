package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {

	
	@Test
	public void CreateAccount() {
		Reporter.log("CreateAccount",true);
	}
	
	@Test(dependsOnMethods ="CreateAccount" )
	public void EditAccount() {
		Reporter.log("EditAccount",true);
	}
	
	
	@Test(dependsOnMethods = "CreateAccount")
	public void DeleteAccount() {
		Reporter.log("DeleteAccount",true);
		
	}
	
	
	
	
	}


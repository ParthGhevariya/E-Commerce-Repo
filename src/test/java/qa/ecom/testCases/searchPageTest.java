package qa.ecom.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.ecom.base.TestBase;
import qa.ecom.pages.searchPage;
import qa.ecom.pages.signinPage;

public class searchPageTest extends TestBase{
	
	searchPage searchpage;
	signinPage signinpage; 
	
	@BeforeMethod
	public void setup() {
		initialization();
		searchpage = new searchPage();
		signinpage = new signinPage();
	}
	
	@Test(priority=1)
	public void validateSearchTest() {
		
		signinpage.loginIntoAccount();
		searchpage.validateSearch();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

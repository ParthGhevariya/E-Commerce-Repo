package qa.ecom.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.ecom.base.TestBase;
import qa.ecom.pages.myStorePage;
import qa.ecom.pages.signinPage;

public class myStorePageTest extends TestBase {
		
	myStorePage mystorepage;
	signinPage signinpage;
	
	
	
	public myStorePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		mystorepage = new myStorePage();
		signinpage = new signinPage();
	}
	
	@Test(priority=1)
	public void verifyMyStorePageTest() {
		
		signinpage.loginIntoAccount();
		mystorepage.verifymyStorePage();
	}
	
	
	@Test(priority=2)
	public void vetifyPageFooterTest() throws InterruptedException {
		
			mystorepage.verifyPageFooter();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

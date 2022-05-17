package qa.ecom.testCases;

import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import qa.ecom.base.TestBase;
import qa.ecom.pages.signinPage;
import qa.ecom.util.TestUtil;



public class signInPageTest extends TestBase{

	signinPage signinpage;
	Properties prop;

	 
	
	
	public signInPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		signinpage = new signinPage();
	}
	
	@Test(priority = 1)
	public void signInPageTitleTest() throws InterruptedException {
		String title = signinpage.validatesignInPageTitle();
		Assert.assertEquals(title,"Login - My Store");
	}
	
	
	@Test(priority=2)
	public void checkLogin() {
		signinpage.loginIntoAccount();
		
	}
	
	@AfterMethod
	public void tearDowm() {
		driver.quit();
	}
	
	
}

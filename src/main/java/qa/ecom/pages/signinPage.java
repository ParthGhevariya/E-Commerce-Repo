package qa.ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.ecom.base.TestBase;

public class signinPage extends TestBase{

	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	@FindBy(xpath = "//div[@id='header_logo']/a/img")
	WebElement logo;

	@FindBy(id = "email_create")
	WebElement emailAdd;
	
	@FindBy(id = "SubmitCreate")
	WebElement submitCreate;

	@FindBy(id="email")
	WebElement email;

	@FindBy(id="passwd")
	WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	WebElement submitLogin;
	

	//initializing the page objects
	public signinPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatesignInPageTitle() throws InterruptedException {
		signIn.click();
		Thread.sleep(1500);
		return driver.getTitle();
	}
	
	public boolean validatelogoImage() {
		return logo.isDisplayed();
	}
	
	public void enterValidEmail() {
		signIn.click();
		emailAdd.sendKeys(prop.getProperty("email"));
		submitCreate.click();
	}
	
	
	public void loginIntoAccount() {
		
		signIn.click();
		email.sendKeys("demoparth@gmail.com");
		passwd.sendKeys("parth@123");
		submitLogin.click();
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
	}

}
package qa.ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.ecom.base.TestBase;

public class myStorePage extends TestBase {
	
	signinPage signinpage = new signinPage();

	//page Factory
	@FindBy(xpath="//span[contains(text(),'parth ghevariya')]")
	WebElement user;
	
	@FindBy(id="newsletter-input")
	WebElement newsletter;
	
	@FindBy(xpath="//ul[@class='toggle-footer']//li[5]")
	WebElement contactUs; 
	
	@FindBy(linkText="My credit slips")
	WebElement mycredit;
	
	@FindBy(xpath="//section[@id='social_block']//li[3]")
	WebElement youtubeLabel;
	
	
	
	//page factory initialization
	public myStorePage() {
			
			PageFactory.initElements(driver, this);
			
		}
	
	
	
	
	public void verifymyStorePage() {
		
		signinpage.logo.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Store");
		
		user.isDisplayed();
		
		
	}
	
	public void verifyPageFooter() throws InterruptedException {
		
		newsletter.sendKeys(prop.getProperty("email"));
		
		System.out.println(contactUs.isDisplayed());
		
		System.out.println(mycredit.isDisplayed()); 
	
		youtubeLabel.click();
	
	}
	
	
}

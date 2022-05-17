package qa.ecom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.ecom.base.TestBase;

public class searchPage extends TestBase{
	
		signinPage signinpage = new signinPage();
		
		//page factory
		@FindBy(id="search_query_top")
		WebElement searchItem;
		
		@FindBy(name="submit_search")
		WebElement searchBtn;
		
		@FindBy(xpath="//span[contains(text(),'7 results have been found.')]")
		WebElement element;
		
		@FindBy(xpath="//span[contains(text(),'parth ghevariya')]")
		WebElement user;
		
		
		//page factory initialization
		public searchPage() {
				
				PageFactory.initElements(driver, this);
				
			}
		
	
		public void validateSearch() {
				
				signinpage.loginIntoAccount();
				
				signinpage.logo.click();
				searchItem.sendKeys("Dresses");
				searchBtn.click();
				
				String s = element.getText();
				Assert.assertEquals(s, "7 results have been found.");
		}
}
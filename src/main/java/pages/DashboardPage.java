package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Bank & Cash']")WebElement BANKANDCASH;
	@FindBy(how=How.XPATH,using="//a[text()='New Account']")WebElement NEWACCOUNT;
	@FindBy(how=How.XPATH,using="//h2[text()=' Accounts ']")WebElement ACCOUNTHEADER;
	
	public void clickBankAndCashButton() {
		BANKANDCASH.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void clickNewAccountButton() {
		NEWACCOUNT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void validateAccountPage(String expectedText) {
		Assert.assertEquals(expectedText, ACCOUNTHEADER.getText());
	}
	
	

}

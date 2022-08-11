package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="username")WebElement USERNAME;
	@FindBy(how=How.ID,using="password")WebElement PASSWORD;
	@FindBy(how=How.NAME,using="login")WebElement SIGNINBUTTON;
	@FindBy(how=How.XPATH,using="//h2[text()=' Dashboard ']")WebElement DASHBOARDHEADER;
	
	public void insertUserName(String UserName) {
		USERNAME.sendKeys(UserName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void insertPassword(String Password) {
		PASSWORD.sendKeys(Password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}
	
	public void clickSubmitButton() {
		SIGNINBUTTON.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void validateDashboardPage(String expectedText) {
		Assert.assertEquals(expectedText, DASHBOARDHEADER.getText());
		
	}

}

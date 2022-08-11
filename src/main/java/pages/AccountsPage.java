package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountsPage {
	
	WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="account")WebElement ACCOUNTTITLE;
	@FindBy(how=How.ID,using="description")WebElement DESCRIPTION;
	@FindBy(how=How.ID,using="balance")WebElement BALANCE;
	@FindBy(how=How.ID,using="account_number")WebElement ACCOUNTNUMBER;
	@FindBy(how=How.ID,using="contact_person")WebElement CONTACTPERSON;
	@FindBy(how=How.ID,using="contact_phone")WebElement PHONE;
	@FindBy(how=How.XPATH,using="//button[@type='submit' and @class='btn btn-primary']")WebElement SUBMIT;
	
	public void insertAccountTitle(String AccountTitle) {
		
		ACCOUNTTITLE.sendKeys(AccountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public void insertDescription(String Description) {
		
		DESCRIPTION.sendKeys(Description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertBalance(String InitalBalance) {
		
		BALANCE.sendKeys(InitalBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertAccountNumber(String AccountNumber) {
		
		ACCOUNTNUMBER.sendKeys(AccountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertContactPerson(String ContactPerson) {
		
		CONTACTPERSON.sendKeys(ContactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertPhone(String PhoneNumber) {
		
		PHONE.sendKeys(PhoneNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSubmitButton() {
		SUBMIT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountsPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefination extends TestBase {
	
	LoginPage lp ;
	DashboardPage dp;
	AccountsPage ap;

	
	@Given ("^User is on Techfios login page$")
	
	public void user_is_on_techfios_login_page() {
		
		initDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	
	@When ("^User enters username as \"([^\"]*)\"$")
	
	public void user_enters_username_as(String UserName) {
						
		lp= PageFactory.initElements(driver, LoginPage.class);
		
		lp.insertUserName(UserName);
		
	}
	
	 @When ("^User enters password as \"([^\"]*)\"$")
	 
	 public void user_enters_password_as(String Password) {
		 				 			 
		 lp.insertPassword(Password);
			
	
	 }
	 @And ("^User clicks on submit button$")
	 
	 public void user_clicks_on_submit_button() {
					 
		 lp.clickSubmitButton();
		 
	 }
	 
	 @Then ("^User should able to land on dashboard page$")
	
	 public void user_should_able_to_land_on_dashboard_page() {
		 
		 lp.validateDashboardPage("Dashboard");
		 
	 }
	 
	 @When ("^User clicks on Bank and Cash Button$")
	 
	 public void user_clicks_on_bank_and_cash_button() {
		 
		  dp= PageFactory.initElements(driver, DashboardPage.class);
		  dp.clickBankAndCashButton();
	 }
	 
	 @When ("^User Clicks on New Account Button$")
	 
	 public void user_clicks_on_new_account_button() {
		 dp.clickNewAccountButton();
	 }
	 
	 @Then ("^User Should Land on Accounts Page$")
	 public void user_should_land_on_accounts_page() {
		 dp.validateAccountPage("Accounts");
	 }
	
	 @When ("^User enters AccountTitle as \"([^\"]*)\"$")
	 
	 public void user_enters_accountTitle_as(String AccountTitle) {
		 
		int randomNumber= generateRandomNumber();
		 
		  ap= PageFactory.initElements(driver, AccountsPage.class);
		  
		 ap.insertAccountTitle(AccountTitle+randomNumber);
	 }
	 @When ("^User enters Description as \"([^\"]*)\"$")
	 
	 public void user_enters_description_as(String Description) {
		 
		 int randomNumber= generateRandomNumber();
		 
		 ap.insertDescription(Description+randomNumber);
		 
	 }
	 @When ("^User enters InitialBalance as \"([^\"]*)\"$")
	 
	 public void user_enters_initialBalance_as(String InitalBalance ) {
		 
		 int randomNumber= generateRandomNumber();
		 
		 ap.insertBalance(InitalBalance+randomNumber);
	 }
	 
	 @When ("^User enters AccountNumber as \"([^\"]*)\"$")
	
	 public void user_enters_accountNumber_as(String AccountNumber) {
		 int randomNumber= generateRandomNumber();
		 
		 ap.insertAccountNumber(AccountNumber+randomNumber);
	 }
	 
	 @When ("^User enters ContactPerson as \"([^\"]*)\"$")
	 
	 public void user_enters_contactPerson_as(String ContactPerson) {
		 int randomNumber= generateRandomNumber();
		 
		 ap.insertContactPerson(ContactPerson+randomNumber);
	 }
	 
	 @And ("^User enters PhoneNumber as \"([^\"]*)\"$")
	 
	 public void user_enters_phoneNumber_as(String PhoneNumber) {
		 int randomNumber= generateRandomNumber();
		 
		 ap.insertPhone(PhoneNumber+randomNumber);
	 }
	 
	 @Then ("^User clicks on SubmitButton$")
	 
	 public void user_clicks_on_submitButton() {
		 ap.clickSubmitButton();
	 }

	 @After
	 public void tearDown() {
		 driver.close();
		 driver.quit();
		 
	 }

}

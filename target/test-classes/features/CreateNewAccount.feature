
 
Feature: Creating new account functionality validation

Scenario Outline: User should be able to create new account


Given User is on Techfios login page
 When User enters username as "<UserName>"
 When User enters password as "<Password>"
 And User clicks on submit button
 Then User should able to land on dashboard page
When User clicks on Bank and Cash Button
When User Clicks on New Account Button
Then User Should Land on Accounts Page
When User enters AccountTitle as "<AccountTitle>" 
When User enters Description as "<Description>"
When User enters InitialBalance as "<InitalBalance>"
When User enters AccountNumber as "<AccountNumber>"
When User enters ContactPerson as "<ContactPerson>"
And User enters PhoneNumber as "<PhoneNumber>"
Then User clicks on SubmitButton

Examples: 
|UserName|					|Password|			|AccountTitle|		|Description|			|InitalBalance|		|AccountNumber|			|ContactPerson|		|PhoneNumber|
|demo@techfios.com|	|abc123|				|SavingAccount|			|AutoLoan|				|$500,000|				|765676|						|Jack|							|765676|
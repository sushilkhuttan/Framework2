Feature: To test header links on Home page

Scenario Outline: Click links on Home page header
Given User opens the browser and goes to "http://www.rediff.com" 
And User clicks on Rediffmail icon
When User enters invalid username <username> and password <password>
Then User sees an error message on the page
And The browser is closed
Examples:
|username		|password		|
|test			|pass			|
|test2			|fail			|
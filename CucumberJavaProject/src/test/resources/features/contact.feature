

Feature: Create conact in CRM

  
  Scenario Outline: Create new contact in CRM scenario
  
    Given User is already on login page
    Then User enters "<username1>" and "<password1>"
    Then User clicks on login button
    Then User is now on home page
    Then User moves to new contact page
    Then User enters new contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser



    Examples: 
      | username1  | password1 | firstname  | lastname | position |
      | SriMore   | pass@123 | Srinivas   | kam       | more     |
      | SriMore   | pass@123 | Srikanth   | kam       | more     |	

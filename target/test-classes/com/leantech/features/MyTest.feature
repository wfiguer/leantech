Feature: Validation of item in AWS page 


Scenario: Verification of information for an specific item in the AWS page 

Given I am in the aws page
When I search in the hamburger menu tv appliances electronics
And I select televisions option
And I select second highest priced item of the samsung brand
Then I verify the information about this item	
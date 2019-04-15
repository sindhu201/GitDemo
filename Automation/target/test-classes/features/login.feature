Feature: Application login

Scenario: Home page default login
Given user is on netbanking login page
When user login into application with username "jin" and password "1234"
Then home page is populated
And cards displayed are "true"

Scenario: Home page default login
Given user is on netbanking login page
When user login into application with username "john" and password "3334"
Then home page is populated
And cards displayed are "false"
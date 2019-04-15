Feature: Login into Application

Scenario Outline: Positive test validating login
Given Instalize browser with chrome 
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login limnk in homepage to land on signin page
When User enters <username> and <password> and login
Then Verify that user is ssuccessfully logged in
And close browsers

Examples:
|username       |password |
|arun@gmail.com |1233345  |
|ravi@gmail.com |12344    |
|me@gmail.com   |67888    | 

Feature: Facebook login
As a fb user, I want to enter username and pwd as a parameter

Scenario: validate fb login Scenario1
Given the user is on facebook login Page
When he enters "bmbhakti34@gmail.com" as user name
And he enters "nails1234" as password
Then check username is present in textbox
Feature: Ecommerce login Feature

# Scenario: Ecommerce login Scenario

# without key world 
# Given user is alreay in login Page
# When Title of log in page is Login My Store
# Then User enter "test321@example.com" and "testing"
# Then user click on Sign in button
# Then user is on Myaccount page


# with example keywork

Scenario Outline: Ecommerce login Scenario

Given user is alreay in login Page
When Title of log in page is Login My Store
Then User enter "<email>" and "<pwd>"
Then user click on Sign in button
Then user is on Myaccount page
Then close the broswer

Examples: 
          | email                  | pwd     |
          | test321@example.com    | testing |
          | testing129@example.com | testing |
           
           

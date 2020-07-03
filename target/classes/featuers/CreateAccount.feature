Feature: Ecommerce create an account Feature



Scenario: Ecommerce create account Scenario

Given user is already in login Page
When Title of log in page is Login My Store
Then user enter email 
| test1212@example.com |
Then user click on Create an account button
Then user enter personal details
| Salman | Khan | testing | Salman | Khan | 1234 Main St | Nowhere | Taxes | 12345 | 9723645896 |
Then user click on register

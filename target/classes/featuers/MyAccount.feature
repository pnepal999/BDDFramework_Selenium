Feature: Ecommerce ordering stuff Feature



Scenario Outline: Ecommerce ordering stuff Scenario

 #Given user is alreay in login Page
#Then user maximize the page
#When Title of log in page is Login My Store
Then User enter "<email>" and "<pwd>"
Then user click on Sign in button
Then user is on Myaccount page
Then user click on home button
Then user move to My Store page
Then user click on add to card Printed chiffon dress
Then user click on Proceed to checkout button
Then user click on checkout button from summery page
Then user click on proceed to checkout button on address page
Then user check the button and click on proceed to checkout on shipping page
Then user click on pay by bank wire on payment page
Then user click on confirmed the order on payemnt page
Then order confirmation page will be displayed  
Then user closed the broswer

Examples: 
           | email                  | pwd     |
           | test321@example.com    | testing |
           | testing129@example.com | testing |
           
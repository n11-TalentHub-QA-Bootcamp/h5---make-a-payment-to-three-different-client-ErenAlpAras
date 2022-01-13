Feature: I as a user want to authenticate in the application to check my credentials


  @auth_incorrect
  Scenario: check login with incorrect username and password
    When I login with username eaa and password eaa
    Then you should click close button


  @auth_correct
  Scenario: check login with correct username and password
    When I login with username company and password company
    Then Actor goes to payment page

@payment_the_different_client
  Scenario: check login with correct username and password
    When I login with username company and password company
  Then Actor goes to payment page
  Then Second Actor make a payment
  Then Third Actor make a payment
  Then Logout


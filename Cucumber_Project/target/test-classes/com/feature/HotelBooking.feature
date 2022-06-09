Feature: Booking Hotel in "http://adactinhotelapp.com/"
Scenario: Login function by valid user and password 
   
    Given user launch the http://adactinhotelapp.com
    When user given the valid user name in the text box
    And user given the valid password in the text box
    And user click the login button
    Then user can view the next page as search button page
Scenario: Search Hottel Function 
    Given user select the location by drop down options
    And user select the Hotel by drop down options
    And user select the Room Type by drop down options
    And user select the No of Rooms by drop down options
    And user given the Check in date in text box
    And user given the Check out date in text box
    And user select the No of Adults per Room by drop down options
    And user select the No of Children per Room by drop down options
    When user click the serch button 
    Then user can view the next page as select hotel
Scenario: Select Hotel Function
    Given user click the redio button 
    When user click the continue button 
    Then user can view the next page as Book hotel page
Scenario: Book hotel Function
    Given user given the first name in text box
    And user givn the last name in text box
    And user given the Billing address in text area
    And user given the Credit Card No in text box
    And user select the Credit Card Type in drop down
    And user select the Expiry Month in drop down 
    And user select the Expiry year in drop down
    And user given the CVV in text box  
    When user click the Book Bow button 
    Then user will get booking confirmation details
Scenario: logout Function
    Given user click the logout button 
    Then user will get page as You have successfully logged out
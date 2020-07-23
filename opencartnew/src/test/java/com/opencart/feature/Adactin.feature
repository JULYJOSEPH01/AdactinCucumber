@Bookinghotel
Feature: Booking a hotelroom using automation testscript

Background: User login the application
Given User login the application

@Sc11
Scenario Outline: verify user enable to login functionality properly
Then verify user should  enter "<username>" in specific textbox
And  Verify user shoud enter "<password>" in textbox
And click on the login biutton
When click into new page
Examples:
|username|password|
|JULYJOSEPH|L43454|

@Ignore
Scenario:  To verify whether the check-out date field accepts alater datethan check in date.
Then User should Select location 
And user should select the hotelname
And User should enable to select type of room
And User should enable to select no of rooms
And user should entered check in date more than that check in
And user should to type check out date  
And user should enable to select no of room from  options for adult and for children also
And user should enable for clicking search button other wise user enable to reset their data also
When user should visible an error message

@Sc11
Scenario:  To verify ensure all To verify whether locations in Select Hotel page are displayed according tothe locationselected inSearch Hotel
Then User should Select location 
And user should select the hotelname
And User should enable to select type of room
And User should enable to select no of rooms
And user should entered check in date 
And user should enable to type check out date  
And user should enable to select no of room from  options for adult and for children also
And user should enable for clicking search button other wise user enable to reset their data also
When user should entered into new page displaying all data

@Sc11
Scenario: To verify all displye data  verify location name checkin checkout no of rooms roomtype price
Then usher should compare the location which is selected same as that of location in page of in search of hotel
And user should compare checkin date 
And user should compare checkout date 
And user should compare no of rooms selected as same
And user should compare roomtype as same as you selected
And user should compare price which is calculated same as formula
When  user should entered all data  correctly



@Ignore
Scenario:  To verify that the order gets cancelled after click on Cancel order number link
Then user should  to verify  cancel the ordernumberlink
And User should click on cancel button
When User should cancelled order and get back to homepage


@Ignore
Scenario: verify  logout button
Then User should  verify all displayed data
And  User should to apply log out button 
When User should logs out from application


@Sc11
Scenario: verify ordernumber generated in confirmation page
Then User should verify all displayed data
And User should click on select option
And User should click on continue button
And User should entering into confirmation page 
And User should entering firstname in the textbox
And User should  entering lastname in the specific textbox
And User should entering billing address entering in textbox
And User should entering creditcard number
And User should entering credit card type
And User should entering creditcard expiringdetails
And User should entered cvv number
When User should recieve ordernumber

@Sc11
Scenario: Verify that all the details of newly generated ordered number in booked itinerary page are correct and match with data during booking
Then User should click on the booked itenary button 
When User should see booked itenary page

@Sc11
Scenario: Verify that all the details of newly generated ordered number in booked itinerary page are correct and match with data during bookin
Then Usr should verify firstname compare with confirmation page
And User should verify lastname compare with confirmation page
And User should verify roomtype compare with confirmation page
And User should verify roomnumber compare with confirmation page
And User should verify price compare with formula price= price per night*no of days*no of rooms

@Sc11
Scenario: To check whether “search order id” query is working and displaying the relevant details.
Then User should entering search order id 
And User should  click on go button
When User should  display relevant details
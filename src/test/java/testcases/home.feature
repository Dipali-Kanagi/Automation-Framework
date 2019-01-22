Feature: To verify functionality of home page

@home
Scenario: to verify count of links on home page
Given user has launched "chrome" browser and url is "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" as  "https://the-internet.herokuapp.com/"
Then to verify the count of links on the home page is 41
Then user can close browser

@browser
Scenario Outline: to verify different browsers
Given user has launched "<Browsername>" browser and url is "http://google.com"
Then user can close browser
Examples: 
|Browsername|
|chrome|
|firefox|
|ie|


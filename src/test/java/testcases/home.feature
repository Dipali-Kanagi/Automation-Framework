Feature: To verify functionality of home page

@home
Scenario: to verify count of links on home page
Given user has launched "chrome" browser and url is "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" as  "https://the-internet.herokuapp.com/"
Then to verify the count of links on the home page is 41
Then user can close browser


@Link
Scenario Outline: to verify if the link is working or not
Given user has launched "chrome" browser and url is "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" as  "https://the-internet.herokuapp.com/"
Then click on "<linkname>" link
Then verify page by "currenturl" as  "<linkcurrenturl>"
Then user can close browser
Examples:
|linkname|linkcurrenturl|
|A/B Testing|https://the-internet.herokuapp.com/abtest|
|Broken Images|https://the-internet.herokuapp.com/broken_images|


@browser
Scenario Outline: to verify different browsers
Given user has launched "<Browsername>" browser and url is "http://google.com"
Then user can close browser
Examples: 
|Browsername|
|chrome|
|firefox|
|ie|


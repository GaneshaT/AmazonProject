Feature: Login Funtionality

Background: Application open successfully
Given user open Broswer with "webdriver.chrome.driver" and "C:\\Local Disk D\\Automation Support\\chromedriver.exe"
Given user enter url "https://www.amazon.in/"

@SmokeTest
Scenario: Login funtionality with valid credentials
When user click on hello button
When user enter username as "9545172923"
When user click on continue button
When user enetr password as "Ganesh@123"
When user click on sign button
Then Application shows user login successfully
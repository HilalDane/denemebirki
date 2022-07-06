
Feature: Karriere Page

@karriere
Scenario Outline:User clicks each titel
  Given the user on the login page
  When the user cliks Karriere button
  And the user clicks each "<titel>"
  Then the titel should be same with each "<titel>"
  Examples:
  |titel|
  |Test Automation Engineer (m/w/d)|
  |Test Manager/in (m/w/d)         |
  |Atlassian Administrator Schwerpunkt Jira und Confluence (m/w/d)|
  |(Junior) Marketing & HR Specialist (m/w/d)	                    |
  |Werkstudent/in (m/w/d)                                         |
  |Test Engineer(m/w/d)                                           |
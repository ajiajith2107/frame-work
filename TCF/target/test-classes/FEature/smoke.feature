Feature: AdactIn Hotel End to End to test case

Scenario: Listing football club stadiums - the clear way
    Given the following clubs and their stadiums
      | Juventus | Allianz Stadium |  madhavan |  Stadium |
      Then i will check the status
      | username | password   |
      |  madhavan| tcf123 |
      
      
      
     @smoke
     Scenario: login twitter
     Given luanh the twiter
     Then validate the login
     |username|
     |suresh| 
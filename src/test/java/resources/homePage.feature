Feature: Add to cart

 As a user
 I am on argos homepage
  so that i can look for product


  Scenario Outline: Add item into Cart
    Given as a user I am on home page
    When I select the option for buying item as "<options>"
    Then I navigate to "<options>" page
    When I select the item options "<items>"
    Then I navigate to "<items>" page
    When I select the item options "<product>"
    Then I navigate to the "<product>" page
    When I select the price as "<price>"
    Then I can view the correct product number

    Examples:
    |options|items|product|price|
    |Technology| Televisions and accessories |Televisions    |  £250 - £500   |

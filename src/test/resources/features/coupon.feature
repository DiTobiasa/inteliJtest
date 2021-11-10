Feature: As a customer,
  I want to have the possibility to apply my discount coupons during the purchase,
  So that I can be eligible for discount

  Scenario: Check if Coupon code field is available on Cart page
    Given user open web page "http://shop.acodemy.lv"
    When user adds product "Album" to cart
    And open cart page
    Then user sees coupon code field

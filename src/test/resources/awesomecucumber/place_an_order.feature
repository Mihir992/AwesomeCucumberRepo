Feature: Place and order

Scenario: using default payment option
	Given I'm a guest customer
	And I have a product in the cart
	And I'm on the Checkout page
	When I provide billing details
		| firstname | lastname | email          | address_line1 | city  | state | zip  |
		| demo      | user     | test@gmail.com | test         | Plano | Texas | 75024 |
	And I place an order
	Then the order should be placed successfully
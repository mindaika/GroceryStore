# The Grocery Store
## Non-Functional Requirements:  
1. Console or terminal application in a language of your choosing.    

- I chose Java for this project simple for convenience. The options considered were: Java, JS, C#, and Python  
  
## Functional Requirements:  
1. Display menu of available commands.  
  
- The Menu is implemented in the Main class as a series of println statements and a looped switch  
  
2. Allow input of "grocery product" into a cart.  
  
- The ShoppingCart class implements the method addItem(GroceryProduct product) allowing for addition of GroceryProducts  
  
3. Grocery products have these attributes:  
	- Name
	- Unit of Measure
	- Quantity
	- Price  
  
- The GroceryCart contains properties for name, units, quantity and price, as well as for subtotal  
  
4. Allow listing products in cart.  
	- This should show a subtotal per line (quantity * price)  
	-  User should be allowed to sort by Name or subtotal.  
  
- The listItemsBySubtotal() and listItemsByName() methods in the ShoppingCart class fulfill the above requirements. The cart was implemented as a TreeMap which was convenient for adding products, ensuring uniqueness in updating quantities, and sorting by name, but created an issue where the Map had to be ported to another object to sort by subtotal. This probably could have all been implemented with Comparators on the GroceryProduct class .
  
5. Support adding and removing items in cart. 

- This requirement is implemented as addItem() and removeItem() in the ShoppingCart class. Client feedback is requested  on the details of removeItem, as it is unclear whether the intent is for the function to remove all of an item (e.g. all 7 bananas) or a specified quantity of an item. The current implementation removes all of the item.  
  
6. Support clearing cart.

- This requirement is implemented as clear() in the ShoppingCart class  
  
7. Support checkout. 
	- Devise a way to present payment methods and input information appropriate to the selected method.  
  
- This requirement is not fully implemented, although there is a checkout() method in the ShoppingCart class.  
Implementation of payment processing would require capture of user details and security for those details.

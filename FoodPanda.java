class FoodPanda
{

  public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "MT 9 Trio Heaven Milk Tea Large")
		return 200.00;
	  
	    else if(foodName == "MT 11 Coffee Jelly Milk Tea Large")
	    return 200.00;
		   
	    else if(foodName == "YD4 Lemon Yakult Large")
	    return 220.00;	 
		
	    else if(foodName == "A1 Tea Heaven Signature Black Tea Medium")
	    return 180.00;	 
		
	    else if(foodName == "A4 Taiwan Jasmine Green Tea Large")
	    return 190.00;	 
		
		else if(foodName == "MT 6 Premium Cocoa Milk Tea Large")
	    return 180.00;	 
		
		else if(foodName == "MT15 Strawberries Milk Tea Large")
	    return 180.00;	 
		
		else if(foodName == "Buy1Take1 Crispy Chicken Burger")
	    return 539.00;	 
		
		else if(foodName == "Avenue Burger")
	    return 234.00;	 
		
		else if(foodName == "Avenue 70's Burger")
	    return 299.00;	 
		
		else if(foodName == "Quarter Pounder")
	    return 314.00;	 
		
		else if(foodName == "Bacon Cheese Burger")
	    return 339.00;	 
		
		else if(foodName == "Buy1Take1 Beef Burger")
	    return 345.00;	 
		
		else if(foodName == "Philly Steak Burger")
	    return 299.00;	 
		
		else if(foodName == "Ham, Cheese & Egg Sandwich")
	    return 280.00;	 
		
		else if(foodName == "Buy1 Take1 Beef Pepperoni")
	    return 599.00;	 
		
		else if(foodName == "Bacon Carbonara")
	    return 245.00;	 
		
		else if(foodName == "Spaghetti Buy1Take1")
	    return 150.00;	 
		
		else if(foodName == "Arabiata")
	    return 249.00;	 
		
		else if(foodName == "Spicy Seafood Marinara")
	    return 275.00;	 
		
		else if(foodName == "Cheesy Garlic Bread Sticks")
	    return 189.00;	 
		
		else if(foodName == "French Fries (250g)")
	    return 160.00;	 
		
		else if(foodName == "French Fries With Cheese (250g)")
	    return 180.00;	 
		
		else if(foodName == "Cheesy Nachos")
	    return 234.00;
		
		else if(foodName == "Mozzarella Sticks")
	    return 212.00;
		
		else if(foodName == "French Fries BBQ Flavor (250g)")
	    return 190.00;
		
		else if(foodName == "Hot Chocolate")
	    return 115.00;
		
		else if(foodName == "Berry Apple Yakult")
	    return 125.00;
		
		else if(foodName == "Penne Pasta")
	    return 189.00;
		
		else if(foodName == "Bolognese Spaghetti")
	    return 234.00;
		
		else if(foodName == "Red Velvet Cheesecake")
	    return 179.00;
		
		else if(foodName == "Caramel Frappe Coffee Based")
	    return 245.00;
		
		else if(foodName == "Coffee Jelly Frappe Coffee Based")
	    return 220.00;
		
		else if(foodName == "Hershey's Milk Tea")
	    return 144.00;
		
		else if(foodName == "Hazelnut Milk Tea")
	    return 152.00;
		
		else if(foodName == "Caramel Milk Tea")
	    return 152.00;
		
		else if(foodName == "Fried Chicken Shawarma - 200 gm")
	    return 280.00;
		
		else if(foodName == "Turkish Milk Cake")
	    return 240.00;
		
		else if(foodName == "Fry Bun Burger - 180 gm")
	    return 234.00;
		
		else if(foodName == "Tasty Treat Popcorn")
	    return 134.00;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }
	 
	  public static double showsFoodPrice(String foodName,int quantity)
      {
	  
	    if(foodName == "MT 9 Trio Heaven Milk Tea Large")
		return 200.00*quantity;
	  
	    else if(foodName == "MT 11 Coffee Jelly Milk Tea Large")
	    return 200.00*quantity;
		   
	    else if(foodName == "YD4 Lemon Yakult Large")
	    return 220.00*quantity;	 
		
	    else if(foodName == "A1 Tea Heaven Signature Black Tea Medium")
	    return 180.00*quantity;	 
		
	    else if(foodName == "A4 Taiwan Jasmine Green Tea Large")
	    return 190.00*quantity;	 
		
		else if(foodName == "MT 6 Premium Cocoa Milk Tea Large")
	    return 180.00*quantity;	 
		
		else if(foodName == "MT15 Strawberries Milk Tea Large")
	    return 180.00*quantity;	 
		
		else if(foodName == "Buy1Take1 Crispy Chicken Burger")
	    return 539.00*quantity;	 
		
		else if(foodName == "Avenue Burger")
	    return 234.00*quantity;	 
		
		else if(foodName == "Avenue 70's Burger")
	    return 299.00*quantity;	 
		
		else if(foodName == "Quarter Pounder")
	    return 314.00*quantity;	 
		
		else if(foodName == "Bacon Cheese Burger")
	    return 339.00*quantity;	 
		
		else if(foodName == "Buy1Take1 Beef Burger")
	    return 345.00*quantity;	 
		
		else if(foodName == "Philly Steak Burger")
	    return 299.00*quantity;	 
		
		else if(foodName == "Ham, Cheese & Egg Sandwich")
	    return 280.00*quantity;	 
		
		else if(foodName == "Buy1 Take1 Beef Pepperoni")
	    return 599.00*quantity;	 
		
		else if(foodName == "Bacon Carbonara")
	    return 245.00*quantity;	 
		
		else if(foodName == "Spaghetti Buy1Take1")
	    return 150.00*quantity;	 
		
		else if(foodName == "Arabiata")
	    return 249.00*quantity;	 
		
		else if(foodName == "Spicy Seafood Marinara")
	    return 275.00*quantity;	 
		
		else if(foodName == "Cheesy Garlic Bread Sticks")
	    return 189.00*quantity;	 
		
		else if(foodName == "French Fries (250g)")
	    return 160.00*quantity;	 
		
		else if(foodName == "French Fries With Cheese (250g)")
	    return 180.00*quantity;	 
		
		else if(foodName == "Cheesy Nachos")
	    return 234.00*quantity;
		
		else if(foodName == "Mozzarella Sticks")
	    return 212.00*quantity;
		
		else if(foodName == "French Fries BBQ Flavor (250g)")
	    return 190.00*quantity;
		
		else if(foodName == "Hot Chocolate")
	    return 115.00*quantity;
		
		else if(foodName == "Berry Apple Yakult")
	    return 125.00*quantity;
		
		else if(foodName == "Penne Pasta")
	    return 189.00*quantity;
		
		else if(foodName == "Bolognese Spaghetti")
	    return 234.00*quantity;
		
		else if(foodName == "Red Velvet Cheesecake")
	    return 179.00*quantity;
		
		else if(foodName == "Caramel Frappe Coffee Based")
	    return 245.00*quantity;
		
		else if(foodName == "Coffee Jelly Frappe Coffee Based")
	    return 220.00*quantity;
		
		else if(foodName == "Hershey's Milk Tea")
	    return 144.00*quantity;
		
		else if(foodName == "Hazelnut Milk Tea")
	    return 152.00*quantity;
		
		else if(foodName == "Caramel Milk Tea")
	    return 152.00*quantity;
		
		else if(foodName == "Fried Chicken Shawarma - 200 gm")
	    return 280.00*quantity;
		
		else if(foodName == "Turkish Milk Cake")
	    return 240.00*quantity;
		
		else if(foodName == "Fry Bun Burger - 180 gm")
	    return 234.00*quantity;
		
		else if(foodName == "Tasty Treat Popcorn")
	    return 134.00*quantity;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }













}
class Blinkit
{
  public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "Maggi Masala Penne Instant Pasta")
		return 35.00;
	  
	    else if(foodName == "Bambino Pep Elbows Macaroni - Pack of 2")
	    return 111.00;
		   
	    else if(foodName == "Yu 100% Whole Wheat Spaghetti Pasta")
	    return 135.00;	 
		
	    else if(foodName == "Chef's Basket Durum Wheat Penne Domestic Pasta - Pack of 2")
	    return 173.00;	 
		
	    else if(foodName == "Prasuma Loaded Chicken Pizza Minis")
	    return 139.00;	 
		
		else if(foodName == "Keventer Chicken Nuggets (Frozen)")
	    return 233.00;	 
		
		else if(foodName == "Prasuma Chicken Chilli Salami (Frozen)")
	    return 167.00;	 
		
		else if(foodName == "ITC Master Chef Desi Style Chicken Burger Patty (Frozen)")
	    return 177.00;	 
		
		else if(foodName == "Prasuma Spicy Chicken Momos (Frozen)")
	    return 605.00;	 
		
		else if(foodName == "Gadre Tilapia Fish Fingers")
	    return 245.00;	 
		
		else if(foodName == "ITC Master Chef Chicken Seekh Kebab (Frozen)")
	    return 300.00;	 
		
		else if(foodName == "Wow! Momo Chicken Cheese Chicken Momos (Frozen)")
	    return 214.00;	 
		
		else if(foodName == "Meatzza Hot & Spicy Chicken Seekh Kebab (Frozen)")
	    return 285.00;	 
		
		else if(foodName == "Prasuma Pork Sausage")
	    return 250.00;	 
		
		else if(foodName == "Prasuma Chicken Spring Roll (Frozen)")
	    return 192.00;	 
		
		else if(foodName == "Gadre Seafood Seafood Snack")
	    return 295.00;	 
		
		else if(foodName == "Godrej Yummiez Lucknowi Chicken Seekh Kebab (Frozen)")
	    return 259.00;	 
		
		else if(foodName == "ITC Master Chef Spicy Grill Chicken Burger Patty")
	    return 345.00;	 
		
		else if(foodName == "Keventer Chicken Keema Paratha (4 pieces)")
	    return 173.00;	 
		
		else if(foodName == "Meatzza Mutton Seekh Kebab Frozen")
	    return 549.00;	 
		
		else if(foodName == "Wow! Momo Darjeeling Chicken Momos - 20 pieces (Frozen)")
	    return 498.00;	 
		
		else if(foodName == "Meatzza Chicken Jumbo Hotdog")
	    return 162.00;	 
		
		else if(foodName == "Meatzza Chicken Burger Patty")
	    return 250.00;	 
		
		else if(foodName == "Prasuma Chicken Chilli Salami (Frozen)")
	    return 167.00;
		
		else if(foodName == "Prasuma Chicken Ham")
	    return 186.00;
		
		else if(foodName == "Prasuma Pork Breakfast Bacon (Frozen)")
	    return 765.00;
		
		else if(foodName == "Prasuma Pork Ham")
	    return 260.00;
		
		else if(foodName == "Keventer Chicken Sausage (Frozen)")
	    return 252.00;
		
		else if(foodName == "IFB Fresh Catch Fish Fingers (Frozen)")
	    return 220.00;
		
		else if(foodName == "Knorr Thick Tomato Soup")
	    return 59.00;
		
		else if(foodName == "Knorr Classic Sweet Corn Vegetable Soup with No Added Preservatives")
	    return 59.00;
		
		else if(foodName == "Knorr Classic Mixed Vegetable Soup with No Added Preservatives")
	    return 59.00;
		
		else if(foodName == "Knorr Spicy Korean Kimchi Soup with No Added Preservatives")
	    return 63.00;
		
		else if(foodName == "Ching's Secret Hot & Sour Veg Soup")
	    return 57.00;
		
		else if(foodName == "Knorr International Mexican Tomato Corn Soup with No Added Preservatives")
	    return 88.00;
		
		else if(foodName == "Nongshim Kimchi Shin Noodle Soup")
	    return 129.00;
		
		else if(foodName == "Ching's Secret Mix Veg Soup 55 g")
	    return 57.00;
		
		else if(foodName == "Nongshim Hot & Spicy Bowl Noodle Soup")
	    return 165.00;
		
		else if(foodName == "Yoga Bar Chocolate Chunk Nut Multigrain Protein Bar (35 g)")
	    return 40.00;
		
		else if(foodName == "SuperYou Choco Peanut Butter Wafer Protein Bar")
	    return 60.00;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }

  public static double showsFoodPrice(String foodName,int quantity)
  {
	  
	    if(foodName == "Maggi Masala Penne Instant Pasta")
		return 35.00*quantity;
	  
	    else if(foodName == "Bambino Pep Elbows Macaroni - Pack of 2")
	    return 111.00*quantity;
		   
	    else if(foodName == "Yu 100% Whole Wheat Spaghetti Pasta")
	    return 135.00*quantity;	 
		
	    else if(foodName == "Chef's Basket Durum Wheat Penne Domestic Pasta - Pack of 2")
	    return 173.00*quantity;	 
		
	    else if(foodName == "Prasuma Loaded Chicken Pizza Minis")
	    return 139.00*quantity;	 
		
		else if(foodName == "Keventer Chicken Nuggets (Frozen)")
	    return 233.00*quantity;	 
		
		else if(foodName == "Prasuma Chicken Chilli Salami (Frozen)")
	    return 167.00*quantity;	 
		
		else if(foodName == "ITC Master Chef Desi Style Chicken Burger Patty (Frozen)")
	    return 177.00*quantity;	 
		
		else if(foodName == "Prasuma Spicy Chicken Momos (Frozen)")
	    return 605.00*quantity;	 
		
		else if(foodName == "Gadre Tilapia Fish Fingers")
	    return 245.00*quantity;	 
		
		else if(foodName == "ITC Master Chef Chicken Seekh Kebab (Frozen)")
	    return 300.00*quantity;	 
		
		else if(foodName == "Wow! Momo Chicken Cheese Chicken Momos (Frozen)")
	    return 214.00*quantity;	 
		
		else if(foodName == "Meatzza Hot & Spicy Chicken Seekh Kebab (Frozen)")
	    return 285.00*quantity;	 
		
		else if(foodName == "Prasuma Pork Sausage")
	    return 250.00*quantity;	 
		
		else if(foodName == "Prasuma Chicken Spring Roll (Frozen)")
	    return 192.00*quantity;	 
		
		else if(foodName == "Gadre Seafood Seafood Snack")
	    return 295.00*quantity;	 
		
		else if(foodName == "Godrej Yummiez Lucknowi Chicken Seekh Kebab (Frozen)")
	    return 259.00*quantity;	 
		
		else if(foodName == "ITC Master Chef Spicy Grill Chicken Burger Patty")
	    return 345.00*quantity;	 
		
		else if(foodName == "Keventer Chicken Keema Paratha (4 pieces)")
	    return 173.00*quantity;	 
		
		else if(foodName == "Meatzza Mutton Seekh Kebab Frozen")
	    return 549.00*quantity;	 
		
		else if(foodName == "Wow! Momo Darjeeling Chicken Momos - 20 pieces (Frozen)")
	    return 498.00*quantity;	 
		
		else if(foodName == "Meatzza Chicken Jumbo Hotdog")
	    return 162.00*quantity;	 
		
		else if(foodName == "Meatzza Chicken Burger Patty")
	    return 250.00*quantity;	 
		
		else if(foodName == "Prasuma Chicken Chilli Salami (Frozen)")
	    return 167.00*quantity;
		
		else if(foodName == "Prasuma Chicken Ham")
	    return 186.00*quantity;
		
		else if(foodName == "Prasuma Pork Breakfast Bacon (Frozen)")
	    return 765.00*quantity;
		
		else if(foodName == "Prasuma Pork Ham")
	    return 260.00*quantity;
		
		else if(foodName == "Keventer Chicken Sausage (Frozen)")
	    return 252.00*quantity;
		
		else if(foodName == "IFB Fresh Catch Fish Fingers (Frozen)")
	    return 220.00*quantity;
		
		else if(foodName == "Knorr Thick Tomato Soup")
	    return 59.00*quantity;
		
		else if(foodName == "Knorr Classic Sweet Corn Vegetable Soup with No Added Preservatives")
	    return 59.00*quantity;
		
		else if(foodName == "Knorr Classic Mixed Vegetable Soup with No Added Preservatives")
	    return 59.00*quantity;
		
		else if(foodName == "Knorr Spicy Korean Kimchi Soup with No Added Preservatives")
	    return 63.00*quantity;
		
		else if(foodName == "Ching's Secret Hot & Sour Veg Soup")
	    return 57.00*quantity;
		
		else if(foodName == "Knorr International Mexican Tomato Corn Soup with No Added Preservatives")
	    return 88.00*quantity;
		
		else if(foodName == "Nongshim Kimchi Shin Noodle Soup")
	    return 129.00*quantity;
		
		else if(foodName == "Ching's Secret Mix Veg Soup 55 g")
	    return 57.00*quantity;
		
		else if(foodName == "Nongshim Hot & Spicy Bowl Noodle Soup")
	    return 165.00*quantity;
		
		else if(foodName == "Yoga Bar Chocolate Chunk Nut Multigrain Protein Bar (35 g)")
	    return 40.00*quantity;
		
		else if(foodName == "SuperYou Choco Peanut Butter Wafer Protein Bar")
	    return 60.00*quantity;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }
	 


}
class Dominos
{


   public static double providesPizzaPrice(String pizzaName)
   {
        if(pizzaName == "Cheese Volcano Peppy Paneer")
		return 299.00;
	  
	    else if(pizzaName == "Corn and Cheese Volcano")
	    return 299.00;
		   
	    else if(pizzaName == "Peppy Paneer")
	    return 259.00;	 
		
	    else if(pizzaName == "Margherita")
	    return 109.00;	 
		
	    else if(pizzaName == "Farmhouse")
	    return 259.00;	 
		
		else if(pizzaName == "Veggie Paradise")
	    return 259.00;	 
		
		else if(pizzaName == "Indi Tandoori Paneer")
	    return 299.00;	 
		
		else if(pizzaName == "Veg Extravaganza")
	    return 299.00;	 
		
		else if(pizzaName == "Corn n Cheese Paratha Pizza")
	    return 179.00;	 
		
		else if(pizzaName == "Cheese n COrn")
	    return 209.00;	 
		
		else if(pizzaName == "Mexican Gren Wave")
	    return 259.00;	 
		
		else if(pizzaName == "Double Cheese Margherita")
	    return 209.00;	 
		
		else if(pizzaName == "Classic")
	    return 49.00;	 
		
		else if(pizzaName == "Onion")
	    return 69.00;	 
		
		else if(pizzaName == "Golden Corn")
	    return 89.00;	 
		
		else if(pizzaName == "Veg Loaded")
	    return 189.00;	 
		
		else if(pizzaName == "Pepper Barbecue Chicken")
	    return 119.00;	 
		
		else if(pizzaName == "Chicken Sausage")
	    return 109.00;	 
		
		else if(pizzaName == "Non-Veg Loaded")
	    return 199.00;	 
		
		else if(pizzaName == "Cheese Overloaded")
	    return 379.00;	 
		
		else if(pizzaName == "Paneer Spice Supreme")
	    return 299.00;	 
		
		else if(pizzaName == "Achari Do Pyaza")
	    return 199.00;	 
		
		else if(pizzaName == "Fiery Jalapeno and paprika")
	    return 269.00;	 
		
		else if(pizzaName == "SPiced Double Chicken")
	    return 329.00;
		
		else if(pizzaName == "Cheese Volcano Farmhouse")
	    return 299.00;
		
		else if(pizzaName == "Cheese Volcano Veg Paradise")
	    return 299.00;
		
		else if(pizzaName == "Cheese Volcano BBQ Chicken")
	    return 349.00;
		
		else if(pizzaName == "Cheese Volcano Chicken Delight")
	    return 349.00;
		
		else if(pizzaName == "Cheese Volcano Blazing Chicken")
	    return 349.00;
		
		else if(pizzaName == "Paneer Onion and Capsicum with Desi Makhani Sause")
	    return 129.00;
		
		else if(pizzaName == "Paneer and Capsicum with Videshi Hot Sause")
	    return 109.00;
		
		else if(pizzaName == "Capsicum and Red Paprika with videshi Hot Sause")
	    return 89.00;
		
		else if(pizzaName == "Chicken Keema and Onion with Desi Makhani Sause")
	    return 149.00;
		
		else if(pizzaName == "Chicken Dominator")
	    return 369.00;
		
		else if(pizzaName == "Chicken Keema Paratha Pizza")
	    return 249.00;
		
		else if(pizzaName == "The 5 Chicken Feast Pizza")
	    return 399.00;
		
		else if(pizzaName == "Indi Chicken Tikka")
	    return 389.00;
		
		else if(pizzaName == "Chicken Pepperoni")
	    return 379.00;
		
		else if(pizzaName == "Chicken Fiesta")
	    return 339.00;
		
		else if(pizzaName == "Big-Big 6 in 1 Pizza - Veg")
	    return 799.00;
		
		else
		System.out.println(pizzaName+" is not Available");
		return 0.0;
		
    } 
	/*public static void providesPizzaPrice(String pizzaName,int quantity)
	{
		double price= 299.00;
	              Address  address= new Address();  /// heap(instance memory)
		return price*quantity;
		
    }*/
	public static double providesPizzaPrice(String pizzaName,int quantity)
   {
        if(pizzaName == "Cheese Volcano Peppy Paneer")
		return 299.00*quantity;
	  
	    else if(pizzaName == "Corn and Cheese Volcano")
	    return 299.00*quantity;
		   
	    else if(pizzaName == "Peppy Paneer")
	    return 259.00*quantity;	 
		
	    else if(pizzaName == "Margherita")
	    return 109.00*quantity;	 
		
	    else if(pizzaName == "Farmhouse")
	    return 259.00*quantity;	 
		
		else if(pizzaName == "Veggie Paradise")
	    return 259.00*quantity;	 
		
		else if(pizzaName == "Indi Tandoori Paneer")
	    return 299.00*quantity;	 
		
		else if(pizzaName == "Veg Extravaganza")
	    return 299.00*quantity;	 
		
		else if(pizzaName == "Corn n Cheese Paratha Pizza")
	    return 179.00*quantity;	 
		
		else if(pizzaName == "Cheese n COrn")
	    return 209.00*quantity;	 
		
		else if(pizzaName == "Mexican Gren Wave")
	    return 259.00*quantity;	 
		
		else if(pizzaName == "Double Cheese Margherita")
	    return 209.00*quantity;	 
		
		else if(pizzaName == "Classic")
	    return 49.00*quantity;	 
		
		else if(pizzaName == "Onion")
	    return 69.00*quantity;	 
		
		else if(pizzaName == "Golden Corn")
	    return 89.00*quantity;	 
		
		else if(pizzaName == "Veg Loaded")
	    return 189.00*quantity;	 
		
		else if(pizzaName == "Pepper Barbecue Chicken")
	    return 119.00*quantity;	 
		
		else if(pizzaName == "Chicken Sausage")
	    return 109.00*quantity;	 
		
		else if(pizzaName == "Non-Veg Loaded")
	    return 199.00*quantity;	 
		
		else if(pizzaName == "Cheese Overloaded")
	    return 379.00*quantity;	 
		
		else if(pizzaName == "Paneer Spice Supreme")
	    return 299.00*quantity;	 
		
		else if(pizzaName == "Achari Do Pyaza")
	    return 199.00*quantity;	 
		
		else if(pizzaName == "Fiery Jalapeno and paprika")
	    return 269.00*quantity;	 
		
		else if(pizzaName == "SPiced Double Chicken")
	    return 329.00*quantity;
		
		else if(pizzaName == "Cheese Volcano Farmhouse")
	    return 299.00*quantity;
		
		else if(pizzaName == "Cheese Volcano Veg Paradise")
	    return 299.00*quantity;
		
		else if(pizzaName == "Cheese Volcano BBQ Chicken")
	    return 349.00*quantity;
		
		else if(pizzaName == "Cheese Volcano Chicken Delight")
	    return 349.00*quantity;
		
		else if(pizzaName == "Cheese Volcano Blazing Chicken")
	    return 349.00*quantity;
		
		else if(pizzaName == "Paneer Onion and Capsicum with Desi Makhani Sause")
	    return 129.00*quantity;
		
		else if(pizzaName == "Paneer and Capsicum with Videshi Hot Sause")
	    return 109.00*quantity;
		
		else if(pizzaName == "Capsicum and Red Paprika with videshi Hot Sause")
	    return 89.00*quantity;
		
		else if(pizzaName == "Chicken Keema and Onion with Desi Makhani Sause")
	    return 149.00*quantity;
		
		else if(pizzaName == "Chicken Dominator")
	    return 369.00*quantity;
		
		else if(pizzaName == "Chicken Keema Paratha Pizza")
	    return 249.00*quantity;
		
		else if(pizzaName == "The 5 Chicken Feast Pizza")
	    return 399.00*quantity;
		
		else if(pizzaName == "Indi Chicken Tikka")
	    return 389.00*quantity;
		
		else if(pizzaName == "Chicken Pepperoni")
	    return 379.00*quantity;
		
		else if(pizzaName == "Chicken Fiesta")
	    return 339.00*quantity;
		
		else if(pizzaName == "Big-Big 6 in 1 Pizza - Veg")
	    return 799.00*quantity;
		
		else
		System.out.println(pizzaName+" is not Available");
		return 0.0;
		
    } 
	

}
class Swiggy
{
  
  public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "Paneer 65")
		return 360.00;
	  
	    else if(foodName == "Golden Baby Corn")
	    return 330.00;
		   
	    else if(foodName == "Meghana Chicken 555")
	    return 360.00;	 
		
	    else if(foodName == "Lemon Chicken")
	    return 360.00;	 
		
	    else if(foodName == "Butter Chicken Curry")
	    return 365.00;	 
		
		else if(foodName == "Paneer Butter Masala")
	    return 355.00;	 
		
		else if(foodName == "Chicken Biryani")
	    return 350.00;	 
		
		else if(foodName == "Chicken Boneless Biryani")
	    return 360.00;	 
		
		else if(foodName == "Meghana Special Biryani")
	    return 370.00;	 
		
		else if(foodName == "Lollipop Biryani")
	    return 360.00;	 
		
		else if(foodName == "Prawns Biryani")
	    return 460.00;	 
		
		else if(foodName == "Aloo Dum Biryani")
	    return 315.00;	 
		
		else if(foodName == "Paneer Biryani")
	    return 365.00;	 
		
		else if(foodName == "Spl Veg Biryani")
	    return 330.00;	 
		
		else if(foodName == "Box Aloo Dum Biryani")
	    return 200.00;	 
		
		else if(foodName == "Box Meghana Special Biryani")
	    return 250.00;	 
		
		else if(foodName == "Box Paneer Biryani")
	    return 245.00;	 
		
		else if(foodName == "Box Spl Veg Biryani")
	    return 210.00;	 
		
		else if(foodName == "Box Egg Biryani")
	    return 205.00;	 
		
		else if(foodName == "Chilly Paneer")
	    return 360.00;	 
		
		else if(foodName == "Chilly Gobi")
	    return 295.00;	 
		
		else if(foodName == "Gobi 65")
	    return 295.00;	 
		
		else if(foodName == "Mushroom 65")
	    return 345.00;	 
		
		else if(foodName == "Chilly Mushroom")
	    return 345.00;
		
		else if(foodName == "Chilly Babycorn")
	    return 325.00;
		
		else if(foodName == "Gobi Manchurian")
	    return 345.00;
		
		else if(foodName == "Paneer Manchurian")
	    return 350.00;
		
		else if(foodName == "Baby Corn Manchurian")
	    return 325.00;
		
		else if(foodName == "Mushroom Manchurian")
	    return 335.00;
		
		else if(foodName == "Veg Manchurian")
	    return 335.00;
		
		else if(foodName == "Paneer Kabab")
	    return 385.00;
		
		else if(foodName == "Paneer Ghee Roast")
	    return 385.00;
		
		else if(foodName == "Chicken Pakoda")
	    return 360.00;
		
		else if(foodName == "Pepper Chicken")
	    return 360.00;
		
		else if(foodName == "Chicken Maharaja")
	    return 380.00;
		
		else if(foodName == "Chicken Rayalaseema")
	    return 385.00;
		
		else if(foodName == "Chilly Fish")
	    return 380.00;
		
		else if(foodName == "Apollo Fish")
	    return 385.00;
		
		else if(foodName == "Single Fish Fry")
	    return 330.00;
		
		else if(foodName == "Prawns Fry")
	    return 435.00;
		
		else
		System.out.println(foodName+"is not Available");
		return 0.0;
		
	 }
	 
       public static double showsFoodPrice(String foodName,int quantity)
       {
	  
	    if(foodName == "Paneer 65")
		return 360.00*quantity;
	  
	    else if(foodName == "Golden Baby Corn")
	    return 330.00*quantity;
		   
	    else if(foodName == "Meghana Chicken 555")
	    return 360.00*quantity;	 
		
	    else if(foodName == "Lemon Chicken")
	    return 360.00*quantity;	 
		
	    else if(foodName == "Butter Chicken Curry")
	    return 365.00*quantity;	 
		
		else if(foodName == "Paneer Butter Masala")
	    return 355.00*quantity;	 
		
		else if(foodName == "Chicken Biryani")
	    return 350.00*quantity;	 
		
		else if(foodName == "Chicken Boneless Biryani")
	    return 360.00*quantity;	 
		
		else if(foodName == "Meghana Special Biryani")
	    return 370.00*quantity;	 
		
		else if(foodName == "Lollipop Biryani")
	    return 360.00*quantity;	 
		
		else if(foodName == "Prawns Biryani")
	    return 460.00*quantity;	 
		
		else if(foodName == "Aloo Dum Biryani")
	    return 315.00*quantity;	 
		
		else if(foodName == "Paneer Biryani")
	    return 365.00*quantity;	 
		
		else if(foodName == "Spl Veg Biryani")
	    return 330.00*quantity;	 
		
		else if(foodName == "Box Aloo Dum Biryani")
	    return 200.00*quantity;	 
		
		else if(foodName == "Box Meghana Special Biryani")
	    return 250.00*quantity;	 
		
		else if(foodName == "Box Paneer Biryani")
	    return 245.00*quantity;	 
		
		else if(foodName == "Box Spl Veg Biryani")
	    return 210.00*quantity;	 
		
		else if(foodName == "Box Egg Biryani")
	    return 205.00*quantity;	 
		
		else if(foodName == "Chilly Paneer")
	    return 360.00*quantity;	 
		
		else if(foodName == "Chilly Gobi")
	    return 295.00*quantity;	 
		
		else if(foodName == "Gobi 65")
	    return 295.00*quantity;	 
		
		else if(foodName == "Mushroom 65")
	    return 345.00*quantity;	 
		
		else if(foodName == "Chilly Mushroom")
	    return 345.00*quantity;
		
		else if(foodName == "Chilly Babycorn")
	    return 325.00*quantity;
		
		else if(foodName == "Gobi Manchurian")
	    return 345.00*quantity;
		
		else if(foodName == "Paneer Manchurian")
	    return 350.00*quantity;
		
		else if(foodName == "Baby Corn Manchurian")
	    return 325.00*quantity;
		
		else if(foodName == "Mushroom Manchurian")
	    return 335.00*quantity;
		
		else if(foodName == "Veg Manchurian")
	    return 335.00*quantity;
		
		else if(foodName == "Paneer Kabab")
	    return 385.00*quantity;
		
		else if(foodName == "Paneer Ghee Roast")
	    return 385.00*quantity;
		
		else if(foodName == "Chicken Pakoda")
	    return 360.00*quantity;
		
		else if(foodName == "Pepper Chicken")
	    return 360.00*quantity;
		
		else if(foodName == "Chicken Maharaja")
	    return 380.00*quantity;
		
		else if(foodName == "Chicken Rayalaseema")
	    return 385.00*quantity;
		
		else if(foodName == "Chilly Fish")
	    return 380.00*quantity;
		
		else if(foodName == "Apollo Fish")
	    return 385.00*quantity;
		
		else if(foodName == "Single Fish Fry")
	    return 330.00*quantity;
		
		else if(foodName == "Prawns Fry")
	    return 435.00*quantity;
		
		else
		System.out.println(foodName+"is not Available");
		return 0.0;
		
	 }
	 
	 
	 
}
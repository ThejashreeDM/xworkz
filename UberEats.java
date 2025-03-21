class UberEats
{
   public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "Rava Idli")
		return 65.00;
	  
	    else if(foodName == "Chicken Curry")
	    return 120.00;
		   
	    else if(foodName == "Palak Paneer")
	    return 120.00;	 
		
	    else if(foodName == "Potato Spiral")
	    return 90.00;	 
		
	    else if(foodName == "Mushroom Fried Rice")
	    return 90.00;	 
		
		else if(foodName == "Rave Rotti")
	    return 65.00;	 
		
		else if(foodName == "Coconut Rice")
	    return 100.00;	 
		
		else if(foodName == "Tomato Rice")
	    return 50.00;	 
		
		else if(foodName == "Oreo Milk Shake")
	    return 90.00;	 
		
		else if(foodName == "Chole Bature")
	    return 180.00;	 
		
		else if(foodName == "Puri Sagu")
	    return 90.00;	 
		
		else if(foodName == "Masala Puri")
	    return 35.00;	 
		
		else if(foodName == "Bhel Puri")
	    return 35.00;	 
		
		else if(foodName == "Dahi Puri")
	    return 40.00;	 
		
		else if(foodName == "Set Dosa")
	    return 120.00;	 
		
		else if(foodName == "Samosa")
	    return 50.00;	 
		
		else if(foodName == "Honey Cake")
	    return 50.00;	 
		
		else if(foodName == "Veg Biriyani")
	    return 120.00;	 
		
		else if(foodName == "Aloo Kabab")
	    return 200.00;	 
		
		else if(foodName == "Paneer Kabab")
	    return 180.00;	 
		
		else if(foodName == "Mushroom Kabab")
	    return 180.00;	 
		
		else if(foodName == "Mutton Pulao")
	    return 250.00;	 
		
		else if(foodName == "Soya Pulao")
	    return 120.00;	 
		
		else if(foodName == "Pav Bhaji")
	    return 90.00;
		
		else if(foodName == "Mallige Idli")
	    return 90.00;
		
		else if(foodName == "Ragi Mudde Meals")
	    return 180.00;
		
		else if(foodName == "Aloo 65")
	    return 120.00;
		
		else if(foodName == "Pongal")
	    return 90.00;
		
		else if(foodName == "Upma")
	    return 60.00;
		
		else if(foodName == "Kesari Bath")
	    return 60.00;
		
		else if(foodName == "Fruits Salad")
	    return 180.00;
		
		else if(foodName == "Chicken Pepper Dry")
	    return 110.00;
		
		else if(foodName == "Mutton Curry")
	    return 100.00;
		
		else if(foodName == "Chicken Lolipop")
		return 170.00;
		
		else if(foodName == "Neer Dosa")
	    return 90.00;
		
		else if(foodName == "Rava Dosa")
	    return 90.00;
		
		else if(foodName == "Sweet Pongal")
	    return 180.00;
		
		else if(foodName == "Parota")
	    return 100.00;
		
		else if(foodName == "Appam")
	    return 220.00;
		
		else if(foodName == "Poha")
	    return 134.00;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
  }
  
  public static double showsFoodPrice(String foodName,int quantity)
  {
	  
	    if(foodName == "Rava Idli")
		return 65.00*quantity;
	  
	    else if(foodName == "Chicken Curry")
	    return 120.00*quantity;
		   
	    else if(foodName == "Palak Paneer")
	    return 120.00*quantity;	 
		
	    else if(foodName == "Potato Spiral")
	    return 90.00*quantity;	 
		
	    else if(foodName == "Mushroom Fried Rice")
	    return 90.00*quantity;	 
		
		else if(foodName == "Rave Rotti")
	    return 65.00*quantity;	 
		
		else if(foodName == "Coconut Rice")
	    return 100.00*quantity;	 
		
		else if(foodName == "Tomato Rice")
	    return 50.00*quantity;	 
		
		else if(foodName == "Oreo Milk Shake")
	    return 90.00*quantity;	 
		
		else if(foodName == "Chole Bature")
	    return 180.00*quantity;	 
		
		else if(foodName == "Puri Sagu")
	    return 90.00*quantity;	 
		
		else if(foodName == "Masala Puri")
	    return 35.00*quantity;	 
		
		else if(foodName == "Bhel Puri")
	    return 35.00*quantity;	 
		
		else if(foodName == "Dahi Puri")
	    return 40.00*quantity;	 
		
		else if(foodName == "Set Dosa")
	    return 120.00*quantity;	 
		
		else if(foodName == "Samosa")
	    return 50.00*quantity;	 
		
		else if(foodName == "Honey Cake")
	    return 50.00*quantity;	 
		
		else if(foodName == "Veg Biriyani")
	    return 120.00*quantity;	 
		
		else if(foodName == "Aloo Kabab")
	    return 200.00*quantity;	 
		
		else if(foodName == "Paneer Kabab")
	    return 180.00*quantity;	 
		
		else if(foodName == "Mushroom Kabab")
	    return 180.00*quantity;	 
		
		else if(foodName == "Mutton Pulao")
	    return 250.00*quantity;	 
		
		else if(foodName == "Soya Pulao")
	    return 120.00*quantity;	 
		
		else if(foodName == "Pav Bhaji")
	    return 90.00*quantity;
		
		else if(foodName == "Mallige Idli")
	    return 90.00*quantity;
		
		else if(foodName == "Ragi Mudde Meals")
	    return 180.00*quantity;
		
		else if(foodName == "Aloo 65")
	    return 120.00*quantity;
		
		else if(foodName == "Pongal")
	    return 90.00*quantity;
		
		else if(foodName == "Upma")
	    return 60.00*quantity;
		
		else if(foodName == "Kesari Bath")
	    return 60.00*quantity;
		
		else if(foodName == "Fruits Salad")
	    return 180.00*quantity;
		
		else if(foodName == "Chicken Pepper Dry")
	    return 110.00*quantity;
		
		else if(foodName == "Mutton Curry")
	    return 100.00*quantity;
		
		else if(foodName == "Chicken Lolipop")
		return 170.00*quantity;
		
		else if(foodName == "Neer Dosa")
	    return 90.00*quantity;
		
		else if(foodName == "Rava Dosa")
	    return 90.00*quantity;
		
		else if(foodName == "Sweet Pongal")
	    return 180.00*quantity;
		
		else if(foodName == "Parota")
	    return 100.00*quantity;
		
		else if(foodName == "Appam")
	    return 220.00*quantity;
		
		else if(foodName == "Poha")
	    return 134.00*quantity;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
  }





}
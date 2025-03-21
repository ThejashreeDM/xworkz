class OlaFoods
{

  public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "Onion Dosa")
		return 65.00;
	  
	    else if(foodName == "Kichidi")
	    return 70.00;
		   
	    else if(foodName == "Masala Dosa")
	    return 70.00;	 
		
	    else if(foodName == "Benne Dosa")
	    return 90.00;	 
		
	    else if(foodName == "Veg Pulao")
	    return 90.00;	 
		
		else if(foodName == "Peas Pulao")
	    return 120.00;	 
		
		else if(foodName == "Veg Fried Rice")
	    return 100.00;	 
		
		else if(foodName == "Lemon Rice")
	    return 50.00;	 
		
		else if(foodName == "Puliogare")
	    return 50.00;	 
		
		else if(foodName == "Paneer Pulao")
	    return 190.00;	 
		
		else if(foodName == "Vangi Bath")
	    return 60.00;	 
		
		else if(foodName == "Bisibele Bath")
	    return 70.00;	 
		
		else if(foodName == "Curd Rice")
	    return 50.00;	 
		
		else if(foodName == "Egg Fried Rice")
	    return 100.00;	 
		
		else if(foodName == "Chicken Fried Rice")
	    return 180.00;	 
		
		else if(foodName == "Noodles")
	    return 599.00;	 
		
		else if(foodName == "Noodles with Gobi")
	    return 245.00;	 
		
		else if(foodName == "Fried Rice with Gobi")
	    return 150.00;	 
		
		else if(foodName == "Cheese Magi")
	    return 249.00;	 
		
		else if(foodName == "Corn Sandwitch")
	    return 275.00;	 
		
		else if(foodName == "Pani Puri")
	    return 189.00;	 
		
		else if(foodName == "Masala Puri")
	    return 160.00;	 
		
		else if(foodName == "Sweet Corn")
	    return 180.00;	 
		
		else if(foodName == "Vada Pav")
	    return 234.00;
		
		else if(foodName == "Akki Rotti")
	    return 212.00;
		
		else if(foodName == "Ragi Dosa")
	    return 190.00;
		
		else if(foodName == "Jolada Rotti")
	    return 115.00;
		
		else if(foodName == "Butter Naan")
	    return 125.00;
		
		else if(foodName == "Obbattu")
	    return 189.00;
		
		else if(foodName == "Chapathi and Curry")
	    return 234.00;
		
		else if(foodName == "Paneer Butter Masala")
	    return 179.00;
		
		else if(foodName == "Veg Curry")
	    return 245.00;
		
		else if(foodName == "Chicken Pulao")
	    return 220.00;
		
		else if(foodName == "Chicken Lolipop")
	    return 144.00;
		
		else if(foodName == "Plum Cake")
	    return 152.00;
		
		else if(foodName == "Idli Vada")
	    return 152.00;
		
		else if(foodName == "Mushroom Pulao")
	    return 280.00;
		
		else if(foodName == "Mushroom Gobi")
	    return 240.00;
		
		else if(foodName == "Butter Chicken")
	    return 234.00;
		
		else if(foodName == "Kulcha")
	    return 134.00;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
  }
  
  
  public static double showsFoodPrice(String foodName,int quantity)
  {
	  
	    if(foodName == "Onion Dosa")
		return 65.00*quantity;
	  
	    else if(foodName == "Kichidi")
	    return 70.00*quantity;
		   
	    else if(foodName == "Masala Dosa")
	    return 70.00*quantity;	 
		
	    else if(foodName == "Benne Dosa")
	    return 90.00*quantity;	 
		
	    else if(foodName == "Veg Pulao")
	    return 90.00*quantity;	 
		
		else if(foodName == "Peas Pulao")
	    return 120.00*quantity;	 
		
		else if(foodName == "Veg Fried Rice")
	    return 100.00*quantity;	 
		
		else if(foodName == "Lemon Rice")
	    return 50.00*quantity;	 
		
		else if(foodName == "Puliogare")
	    return 50.00*quantity;	 
		
		else if(foodName == "Paneer Pulao")
	    return 190.00*quantity;	 
		
		else if(foodName == "Vangi Bath")
	    return 60.00*quantity;	 
		
		else if(foodName == "Bisibele Bath")
	    return 70.00*quantity;	 
		
		else if(foodName == "Curd Rice")
	    return 50.00*quantity;	 
		
		else if(foodName == "Egg Fried Rice")
	    return 100.00*quantity;	 
		
		else if(foodName == "Chicken Fried Rice")
	    return 180.00*quantity;	 
		
		else if(foodName == "Noodles")
	    return 599.00*quantity;	 
		
		else if(foodName == "Noodles with Gobi")
	    return 245.00*quantity;	 
		
		else if(foodName == "Fried Rice with Gobi")
	    return 150.00*quantity;	 
		
		else if(foodName == "Cheese Magi")
	    return 249.00*quantity;	 
		
		else if(foodName == "Corn Sandwitch")
	    return 275.00*quantity;	 
		
		else if(foodName == "Pani Puri")
	    return 189.00*quantity;	 
		
		else if(foodName == "Masala Puri")
	    return 160.00*quantity;	 
		
		else if(foodName == "Sweet Corn")
	    return 180.00*quantity;	 
		
		else if(foodName == "Vada Pav")
	    return 234.00*quantity;
		
		else if(foodName == "Akki Rotti")
	    return 212.00*quantity;
		
		else if(foodName == "Ragi Dosa")
	    return 190.00*quantity;
		
		else if(foodName == "Jolada Rotti")
	    return 115.00*quantity;
		
		else if(foodName == "Butter Naan")
	    return 125.00*quantity;
		
		else if(foodName == "Obbattu")
	    return 189.00*quantity;
		
		else if(foodName == "Chapathi and Curry")
	    return 234.00*quantity;
		
		else if(foodName == "Paneer Butter Masala")
	    return 179.00*quantity;
		
		else if(foodName == "Veg Curry")
	    return 245.00*quantity;
		
		else if(foodName == "Chicken Pulao")
	    return 220.00*quantity;
		
		else if(foodName == "Chicken Lolipop")
	    return 144.00*quantity;
		
		else if(foodName == "Plum Cake")
	    return 152.00*quantity;
		
		else if(foodName == "Idli Vada")
	    return 152.00*quantity;
		
		else if(foodName == "Mushroom Pulao")
	    return 280.00*quantity;
		
		else if(foodName == "Mushroom Gobi")
	    return 240.00*quantity;
		
		else if(foodName == "Butter Chicken")
	    return 234.00*quantity;
		
		else if(foodName == "Kulcha")
	    return 134.00*quantity;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
  }

}
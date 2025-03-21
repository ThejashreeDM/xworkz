class Zepto
{


  public static double showsFoodPrice(String foodName)
  {
	  
	    if(foodName == "Gits Dal Makhani Ready to Eat")
		return 122.00;
	  
	    else if(foodName == "Gits Paneer Tikka Masala Ready to Eat")
	    return 145.00;
		   
	    else if(foodName == "Indic Roots Makhani Gravy")
	    return 247.00;	 
		
	    else if(foodName == "Daawat Cuppa Rice Dal Chawal - Ready To Eat")
	    return 95.00;	 
		
	    else if(foodName == "MTR Ready To Eat Paneer Butter Masala")
	    return 155.00;	 
		
		else if(foodName == "Gits Ready To Eat Palak Paneer")
	    return 143.00;	 
		
		else if(foodName == "Gits Pav Bhaji Ready to Eat")
	    return 118.00;	 
		
		else if(foodName == "Gits Veg Biryani Ready to Eat")
	    return 144.00;	 
		
		else if(foodName == "Indic RootsChickpea and Sweet Potato Soup")
	    return 98.00;	 
		
		else if(foodName == "MTR Ready To Eat - Vegetable Pulao")
	    return 130.00;	 
		
		else if(foodName == "MOM Creamy Tomato Pasta")
	    return 77.00;	 
		
		else if(foodName == "Habanero Multigrain Tortilla Wraps")
	    return 170.00;	 
		
		else if(foodName == "Wakao Supreme Burger Patty")
	    return 396.00;	 
		
		else if(foodName == "MOM Fried Rice with Schezwan Gravy")
	    return 119.00;	 
		
		else if(foodName == "Habanero Baked Beans in Tomato Sauce")
	    return 140.00;	 
		
		else if(foodName == "Jvapa Rice Paper Sheets")
	    return 129.00;	 
		
		else if(foodName == "Bebe Burp Ragi With Strawberry And Banana Porridge")
	    return 299.00;	 
		
		else if(foodName == "Wakao Jackfruit Biryani")
	    return 178.00;	 
		
		else if(foodName == "Cornitos Cornitos Taco Shells - 4 in")
	    return 114.00;	 
		
		else if(foodName == "Gits Ready To Eat Rajma Masala")
	    return 121.00;	 
		
		else if(foodName == "Gits Punjabi Chhole Ready to Eat")
	    return 122.00;	 
		
		else if(foodName == "Bebe Burp Whole Wheat Cookies")
	    return 180.00;	 
		
		else if(foodName == "MTR Khaman Dhokla Ready Mix 160 g Combo")
	    return 162.00;	 
		
		else if(foodName == "Shareat Foochka - Millet")
	    return 98.00;
		
		else if(foodName == "MOM Cheesy Peri Peri Pasta")
	    return 166.00;
		
		else if(foodName == "Tata Sampann Yumside Spicy Chicken Tikka Sausage")
	    return 312.00;
		
		else if(foodName == "MOM Cheesy Peri Peri Pasta")
	    return 91.00;
		
		else if(foodName == "MOM 3 Cheese Pasta")
	    return 91.00;
		
		else if(foodName == "MOM Veg Biryani with Shahi Gravy")
	    return 119.00;
		
		else if(foodName == "Habanero Spinach Tortilla Wraps")
	    return 190.00;
		
		else if(foodName == "Indic RootsMillet Upma")
	    return 166.00;
		
		else if(foodName == "Fruit Treat Vacuum Fried Jackfruit Treat")
	    return 98.00;
		
		else if(foodName == "Fruit Treat Vacuum Fried Potato Finger Chips")
	    return 50.00;
		
		else if(foodName == "Indic RootsMultigrain Khichdi")
	    return 173.00;
		
		else if(foodName == "Indic RootsMultigrain Khichdi")
	    return 380.00;
		
		else if(foodName == "Indic RootsTomato soup ")
	    return 90.00;
		
		else if(foodName == "Tex Mex Salsalito Wrap Tortilla")
	    return 185.00;
		
		else if(foodName == "Pintola Organic Wholegrain Brown Rice Cakes")
	    return 150.00;
		
		else if(foodName == "Habanero Multigrain Tortilla Wrap(330gms) & Habanero Creamy Pasta Sauce(350gms) Combo")
	    return 408.00;
		
		else if(foodName == "Yopokki Cheese Topokki Rice Cake Bowl")
	    return 305.00;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }
	 public static double showsFoodPrice(String foodName,int quantity)
  {
	  
	    if(foodName == "Gits Dal Makhani Ready to Eat")
		return 122.00*quantity;
	  
	    else if(foodName == "Gits Paneer Tikka Masala Ready to Eat")
	    return 145.00*quantity;
		   
	    else if(foodName == "Indic Roots Makhani Gravy")
	    return 247.00*quantity;	 
		
	    else if(foodName == "Daawat Cuppa Rice Dal Chawal - Ready To Eat")
	    return 95.00*quantity;	 
		
	    else if(foodName == "MTR Ready To Eat Paneer Butter Masala")
	    return 155.00*quantity;	 
		
		else if(foodName == "Gits Ready To Eat Palak Paneer")
	    return 143.00*quantity;	 
		
		else if(foodName == "Gits Pav Bhaji Ready to Eat")
	    return 118.00*quantity;	 
		
		else if(foodName == "Gits Veg Biryani Ready to Eat")
	    return 144.00*quantity;	 
		
		else if(foodName == "Indic RootsChickpea and Sweet Potato Soup")
	    return 98.00*quantity;	 
		
		else if(foodName == "MTR Ready To Eat - Vegetable Pulao")
	    return 130.00*quantity;	 
		
		else if(foodName == "MOM Creamy Tomato Pasta")
	    return 77.00*quantity;	 
		
		else if(foodName == "Habanero Multigrain Tortilla Wraps")
	    return 170.00*quantity;	 
		
		else if(foodName == "Wakao Supreme Burger Patty")
	    return 396.00*quantity;	 
		
		else if(foodName == "MOM Fried Rice with Schezwan Gravy")
	    return 119.00*quantity;	 
		
		else if(foodName == "Habanero Baked Beans in Tomato Sauce")
	    return 140.00*quantity;	 
		
		else if(foodName == "Jvapa Rice Paper Sheets")
	    return 129.00*quantity;	 
		
		else if(foodName == "Bebe Burp Ragi With Strawberry And Banana Porridge")
	    return 299.00*quantity;	 
		
		else if(foodName == "Wakao Jackfruit Biryani")
	    return 178.00*quantity;	 
		
		else if(foodName == "Cornitos Cornitos Taco Shells - 4 in")
	    return 114.00*quantity;	 
		
		else if(foodName == "Gits Ready To Eat Rajma Masala")
	    return 121.00*quantity;	 
		
		else if(foodName == "Gits Punjabi Chhole Ready to Eat")
	    return 122.00*quantity;	 
		
		else if(foodName == "Bebe Burp Whole Wheat Cookies")
	    return 180.00*quantity;	 
		
		else if(foodName == "MTR Khaman Dhokla Ready Mix 160 g Combo")
	    return 162.00*quantity;	 
		
		else if(foodName == "Shareat Foochka - Millet")
	    return 98.00*quantity;
		
		else if(foodName == "MOM Cheesy Peri Peri Pasta")
	    return 166.00*quantity;
		
		else if(foodName == "Tata Sampann Yumside Spicy Chicken Tikka Sausage")
	    return 312.00*quantity;
		
		else if(foodName == "MOM Cheesy Peri Peri Pasta")
	    return 91.00*quantity;
		
		else if(foodName == "MOM 3 Cheese Pasta")
	    return 91.00*quantity;
		
		else if(foodName == "MOM Veg Biryani with Shahi Gravy")
	    return 119.00*quantity;
		
		else if(foodName == "Habanero Spinach Tortilla Wraps")
	    return 190.00*quantity;
		
		else if(foodName == "Indic RootsMillet Upma")
	    return 166.00*quantity;
		
		else if(foodName == "Fruit Treat Vacuum Fried Jackfruit Treat")
	    return 98.00*quantity;
		
		else if(foodName == "Fruit Treat Vacuum Fried Potato Finger Chips")
	    return 50.00*quantity;
		
		else if(foodName == "Indic RootsMultigrain Khichdi")
	    return 173.00*quantity;
		
		else if(foodName == "Indic RootsMultigrain Khichdi")
	    return 380.00*quantity;
		
		else if(foodName == "Indic RootsTomato soup ")
	    return 90.00*quantity;
		
		else if(foodName == "Tex Mex Salsalito Wrap Tortilla")
	    return 185.00*quantity;
		
		else if(foodName == "Pintola Organic Wholegrain Brown Rice Cakes")
	    return 150.00*quantity;
		
		else if(foodName == "Habanero Multigrain Tortilla Wrap(330gms) & Habanero Creamy Pasta Sauce(350gms) Combo")
	    return 408.00*quantity;
		
		else if(foodName == "Yopokki Cheese Topokki Rice Cake Bowl")
	    return 305.00*quantity;
		
		else
		System.out.println(foodName+" is not Available");
		return 0.0;
		
	 }

}
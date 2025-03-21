class BlinkitRunner
{
    public static void main(String food[])
	{
	  String foodName="Maggi Masala Penne Instant Pasta";
	  int quantity=5;
	  double price=Blinkit.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Blinkit.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);	  
  
	  foodName="Prasuma Pork Sausage";
	  quantity=4;
	  price=Blinkit.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Blinkit.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
  
  
	  
	  foodName="Prasuma Chicken Spring Roll (Frozen)";
	  quantity=3;
	  price=Blinkit.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Blinkit.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Chef's Basket Durum Wheat Penne Domestic Pasta - Pack of 2";
	  quantity=2;
	  price=Blinkit.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Blinkit.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Roti and Naan";
	  quantity=3;
	  price=Blinkit.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Blinkit.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	
	
	}



}
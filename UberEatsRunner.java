class UberEatsRunner
{
	public static void main(String args[])
	{
      String foodName="Chicken Fried Rice";
	  int quantity=5;
	  double price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	  foodName="Kesari Bath";
	  quantity=4;
	  price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Rava Dosa";
	  quantity=3;
	  price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Mallige Idli";
	  quantity=2;
	  price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Semiya Upma";
	  quantity=2;
	  price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=UberEats.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	}


}
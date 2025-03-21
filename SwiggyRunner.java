class SwiggyRunner
{
    public static void main(String food[])
	{
	  String foodName="Golden Baby Corn";
	  int quantity=5;
	  double price=Swiggy.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Swiggy.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  
	  foodName="Prawns Fry";
	  quantity=4;
	  price=Swiggy.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Swiggy.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Chilly Fish";
	  quantity=3;
	  price=Swiggy.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Swiggy.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Chicken Pakoda";
	  quantity=2;
	  price=Swiggy.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Swiggy.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Dosa";
	  
	  price=Swiggy.showsFoodPrice(foodName);
	  quantity=6;
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Swiggy.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	
	
	}

}
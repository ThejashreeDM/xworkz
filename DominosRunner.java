class DominosRunner
{
    
	public static void main(String food[])
	{
	  String pizzaName="Chicken Pepperoni";
	  int quantity=2;
	  double price=Dominos.providesPizzaPrice(pizzaName);
	  if(price!=0.0)
	  System.out.println("The price of "+pizzaName+" is "+price);
      price=Dominos.providesPizzaPrice(pizzaName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity+" "+pizzaName+" are "+price);
	  
	  pizzaName="Chicken Keema Paratha Pizza";
	  price=Dominos.providesPizzaPrice(pizzaName);
	  if(price!=0.0)
	  System.out.println("The price of "+pizzaName+" is "+price);
      quantity=5;
      price=Dominos.providesPizzaPrice(pizzaName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity+" "+pizzaName+" are "+price);

	  
	  pizzaName="Cheese Volcano Farmhouse";
	  price=Dominos.providesPizzaPrice(pizzaName);
	  if(price!=0.0)
	  System.out.println("The price of "+pizzaName+" is "+price);
      quantity=4;
      price=Dominos.providesPizzaPrice(pizzaName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity+" "+pizzaName+" are "+price);
	  
	  pizzaName="Non-Veg Loaded";
	  price=Dominos.providesPizzaPrice(pizzaName);
	  if(price!=0.0)
	  System.out.println("The price of "+pizzaName+" is "+price);
      quantity=3;
      price=Dominos.providesPizzaPrice(pizzaName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity+" "+pizzaName+" are "+price);
	  
	  pizzaName="Corn";
	  price=Dominos.providesPizzaPrice(pizzaName);
	  if(price!=0.0)
	  System.out.println("The price of "+pizzaName+" is "+price);
      quantity=2;
      price=Dominos.providesPizzaPrice(pizzaName,quantity);
	  if(price!=0.0)
	  System.out.println("The price of "+quantity+" "+pizzaName+" are "+price);
	  
	
	
	}




}
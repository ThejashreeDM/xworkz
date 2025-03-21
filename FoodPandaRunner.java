class FoodPandaRunner
{
    public static void main(String food[])
	{
	  String foodName="Quarter Pounder";
	  int quantity=5;
	  double price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	  foodName="MT 9 Trio Heaven Milk Tea Large";
	  quantity=4;
	  price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="MT 6 Premium Cocoa Milk Tea Large";
	  quantity=3;
	  price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Cheesy Garlic Bread Sticks";
	  quantity=2;
	  price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	  foodName="Lemon Tea";
	  quantity=2;
	  price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=FoodPanda.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);
	  
	
	
	}











}
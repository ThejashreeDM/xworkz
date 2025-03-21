class OlaFoodsRunner
{
public static void main(String food[])
	{
	  String foodName="Masala Dosa";
	  int quantity=3;
	  double price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

  
      foodName="Kichidi";
	  quantity=4;
	  price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	  foodName="Ragi Dosa";
	  quantity=3;
	  price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	  foodName="Obbattu";
	  quantity=5;
	  price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	  foodName="Pongal";
	  quantity=3;
	  price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=OlaFoods.showsFoodPrice(foodName);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);

	  
	}

}
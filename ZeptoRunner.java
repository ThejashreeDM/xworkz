class ZeptoRunner
{
    public static void main(String food[])
	{
	  String foodName="Gits Paneer Tikka Masala Ready to Eat";
	  double price=Zepto.showsFoodPrice(foodName);
	  int quantity=5;
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Zepto.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);	  
	  
	  foodName="Indic Roots Makhani Gravy";
	  quantity=4;
	  price=Zepto.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Zepto.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);	  
	  
	  foodName="Jvapa Rice Paper Sheets";
	  quantity=3;
	  price=Zepto.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Zepto.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);	 
  
	  foodName="Bebe Burp Ragi With Strawberry And Banana Porridge";
	  quantity=2;
	  price=Zepto.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Zepto.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);	
  
	  foodName="Ready Mix Veg Pulao";
	  quantity=7;
	  price=Zepto.showsFoodPrice(foodName);
	  if(price!=0.0)
	  System.out.println("The price of "+foodName+" is "+price);
      price=Zepto.showsFoodPrice(foodName,quantity);
	  if(price!=0.0)
      System.out.println("The price of "+quantity +" "+foodName+" are "+price);   	  
	
	
	}



}
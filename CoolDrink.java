class CoolDrink
{
   int id;
   String company;
   double co2Content;
   boolean isAvailableInCan;
   
   CoolDrink()
   {
      System.out.println("New Cool Drink came into the market");
   }
   
   CoolDrink(int id , String company ,double co2Content ,boolean isAvailableInCan)
   {
      System.out.println("New Cool Drink came into the market");
	  this.id=id;
	  this.company=company;
	  this.co2Content=co2Content;
	  this.isAvailableInCan=isAvailableInCan;
   }
   


}
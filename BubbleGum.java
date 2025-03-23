class BubbleGum
{
  int id;
  String brandName;
  int price;
  String flavour;
  
  BubbleGum()
  {
   System.out.println("New bubble gum came to the market");
  }
  
  BubbleGum(int id , String brandName , int price,String flavour )
  {
      System.out.println("New bubble gum came to the market");
      this.id=id;
	  this.brandName=brandName;
	  this.price=price;
	  this.flavour=flavour;
  }



}
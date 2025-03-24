class Metal
{

   int id;
   String name;
   String utility;
   boolean isMaleable;
   boolean isDuctile;
   String conductivity;
   String colour;
   char isLustorous;
   double price;
   
   Metal()
   {
      this(1);
      System.out.println("Finally no arg constructor is executed");
   
   }
   
   Metal(int id)
   {
      this("Gold","Jewelry");
	  this.id=id;
   }
   
   Metal(String name , String utility)
   {
       this(true,"high");
       this.name=name;
	   this.utility=utility;
   
   }
   Metal(boolean isMaleable , String conductivity)
   {
     this("yellow",true);
     this.isMaleable=isMaleable;
	 this.conductivity=conductivity;
   
   }
   Metal(String colour,boolean isDuctile)
   {
     this('Y');
	 this.colour=colour;
	 this.isDuctile=isDuctile;
   }
   Metal(char isLustorous)
   {
    this(7000.00);
    this.isLustorous=isLustorous;
   
   }
   Metal(double price)
   {
    this.price=price;
   }
   
   public void displayInfo()
   {
   
          System.out.println("Id : "+id);
		  System.out.println("Name : "+name);
		  System.out.println("Utility : "+utility);
		  System.out.println("Is Maleable : "+isMaleable);
		  System.out.println("Is Ductile : "+isDuctile);
		  System.out.println("Conductivity : "+conductivity);
		  System.out.println("Colour : "+colour);
		  System.out.println("Is Lustrous : "+isLustorous);
		  System.out.println("Price : "+price);
   
   
   
   
   }



}
class House
{
   int id;
   int noOfRooms;
   int noOfFloors;
   boolean isSwimmingPoolAvailable;
   char liftFacility;
   String location;
   double price;
   
   House()
   {
     this(1);
     System.out.println("Finally no arg constructor executed");
   }
   
   House(int id)
   {
     this(5,2);
     this.id=id;
   }
   
   House(int noOfRooms , int noOfFloors)
   {
      this(true);
	  this.noOfRooms=noOfRooms;
	  this.noOfFloors=noOfFloors;
   }
   
   House(boolean isSwimmingPoolAvailable)
   {
      this('N');
	  this.isSwimmingPoolAvailable=isSwimmingPoolAvailable;
   
   
   }
   House(char liftFacility)
   {
    this("Banglore");
    this.liftFacility=liftFacility;
   }
   
   House(String location)
   {
       this(2500000.00);
	   this.location=location;
   }
   
   House(double price)
   {
       this.price=price;
   }
   
      public void displayInfo()
	  {
	  
	      System.out.println("Id : "+id);
		  System.out.println("Number of Rooms : "+noOfRooms);
		  System.out.println("Number of Floors : "+noOfFloors);
		  System.out.println("Is Swimming Pool Available : "+isSwimmingPoolAvailable);
		  System.out.println("Location : "+location);
		  System.out.println("Is Lift Facility Available : "+liftFacility);
		  System.out.println("Price : "+price);
	  
	  }
    





}
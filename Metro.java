class Metro
{

    int id;
	String place;
	int noOfStations;
	int noOfLines;
	double length;
	boolean isDigitalTicketsAvailable;
	char isAffordable;
	Metro()
	{
	  this(1);
	  System.out.println("Finally default constructor executed");
	}
	Metro(int id)
	{
	   this("Banglore");
	   this.id=id;
	}
	Metro(String place)
	{  
	   this(52,2);
	   this.place=place;
	}
	Metro(int noOfStations , int noOfLines)
	{
	   this(56.0);
	   this.noOfStations=noOfStations;
	   this.noOfLines=noOfLines;
	}
	Metro(double length)
	{
	  this(true);
	  this.length=length;
	}
	Metro(boolean isDigitalTicketsAvailable)
	{
	  this('Y');
	  this.isDigitalTicketsAvailable=isDigitalTicketsAvailable;
	}
	Metro(char isAffordable)
	{
	   this.isAffordable=isAffordable;
	}
	
	public void displayInfo()
	{
	
	      System.out.println("Id : "+id);
		  System.out.println("Place : "+place);
		  System.out.println("Number of Stations : "+noOfStations);
		  System.out.println("Number of Lines : "+noOfLines);
		  System.out.println("Length : "+length);
		  System.out.println("Is Digital Tickets Available : "+isDigitalTicketsAvailable);
		  System.out.println("Is Affordable : "+isAffordable);
		  
	
	
	}






}
class Doll
{

    int id;
	String name;
	double price;
	boolean isWashable;
	
	
	Doll()
	{   this(1);
	   System.out.println("New doll cme int the market");
	
	}
	
	Doll(int id)
	{   this("Barbie");
	   System.out.println("Id");
	   this.id=id;
	
	}
	
	Doll( String name)
	{
		this(100.00);
	   System.out.println("Name");
	   this.name=name;
	  
	}
	Doll( double price )
	{
		this(true);
	   System.out.println("Price");
	   this.price=price;
	}
	Doll( boolean isWashable )
	{
		
	   System.out.println("Washable");
	   this.isWashable=isWashable;
	}
	   
	
	public void playWith()
	{
	  System.out.println("Id : "+id);
	  System.out.println("Name : "+name);
	  System.out.println("Price :"+price);
	  System.out.println("Is Washable : "+isWashable);
	  System.out.println();
	  
	
	
	
	}
	






}
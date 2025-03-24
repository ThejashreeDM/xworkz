class Paper
{
    int id;
	String type;
	String utility;
	boolean isRecyclable;
	String size;
	float thickness;
	
	Paper()
	{
	  this(1);
	  System.out.println("Finally no arg constructor gets executrd");
	  
	}
	Paper(int id)
	{
	  this("Newspaper","Broadsheet");
	  this.id=id;
	
	}
	Paper(String type,String size)
	{
	  this("Reading");
	  this.type=type;
	  this.size=size;
	}
	Paper(String utility)
	{
	  this(true);
	  this.utility=utility;
	}
	Paper(boolean isRecyclable)
	{
	
	   this(0.05f);
	   this.isRecyclable=isRecyclable;
	}
	Paper(float thickness)
	{
	    this.thickness=thickness;
	}
	
	public void displayInfo()
	{
		System.out.println("Id : "+id);
		System.out.println("Type : "+type);
		System.out.println("Utility : "+utility);
		System.out.println("Is Recyclable : "+isRecyclable);
		System.out.println("Size : "+size);
		System.out.println("Thickness : "+thickness);
		
		
		
	}
}
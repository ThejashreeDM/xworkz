class Wire
{

    int id;
	String material;
	double length;
	float thickness;
	boolean isInsulated;
	String utility;
	String conductivity;
	

       Wire()
	   {
	     this(1);
	     System.out.println("Finally no arg constructor ended");
	   }
	   Wire(int id)
	   {
	     this("Copper");
	     this.id=id;
	   }
	   Wire(String material)
	   {
	      this(50.5);
	      this.material=material;
	   }
	   Wire(double length)
	   {
	      this(2.5f);
		  this.length=length;
	   }
	   Wire(float thickness)
	   {
	     this(true);
	     this.thickness=thickness;
	      
	   }
	   Wire(boolean isInsulated)
	   {
	    this("Electrical Wiring","5.8E7");
	    this.isInsulated=isInsulated;
	   }
	   Wire(String utility,String conductivity)
	   {
	      this.utility=utility;
		  this.conductivity=conductivity;
	   
	   }
	   
	   public void displayInfo()
	   {
	      System.out.println("Id : "+id);
		  System.out.println("Material : "+material);
		  System.out.println("Length : "+length);
		  System.out.println("Thickness : "+thickness);
		  System.out.println("Is Insulated : "+isInsulated);
		  System.out.println("Utility : "+utility);
		  System.out.println("Conductivity : "+conductivity);
		  
	   
	   
	   
	   }



}
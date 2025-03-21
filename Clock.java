class Clock
{
	static int id=1;
	static String brand="TEKCOOL";
	static String type="Digital";
	static String colour="Grey";
	static String style="Classic";
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Type:"+type);
	System.out.println("Colour:"+colour);
	System.out.println("Style:"+style);
	//reInit();
	///*
	id=2;
	brand="Casio";
	type="Digital";
	colour="Brown";
	style="Classic";
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Type:"+type);
	System.out.println("Colour:"+colour);
	System.out.println("Style:"+style);
	


	
}
public static void reInit()
{
    id=2;
	brand="Casio";
	type="Digital";
	colour="Brown";
	style="Classic";
}
}




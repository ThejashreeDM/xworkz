class Speaker
{
	static int id=1;
	static String brand="ZEBRONICS";
	static String freq="20KHz";
	static String type="Wall Mount";
	static int price=15999;
	static String color="Black";
public static void main(String args[])
{
	
	String color="Black";
	System.out.println("Id:"+id);
	System.out.println("The brand name is:"+brand);
	System.out.println("The frequency range is:"+freq);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("The color is:"+color);
	//reInit();
	///*
	id=2;
	brand="Bose";
	freq="25KHz";
	type="Wall Mounted";
	price=20000;
	color="Silver";
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("The brand name is:"+brand);
	System.out.println("The frequency range is:"+freq);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("The color is:"+color);
	
	
}
public static void reInit()
{
   	id=2;
	brand="Bose";
	freq="25KHz";
	type="Wall Mounted";
	price=20000;
	color="Silver";
}
}

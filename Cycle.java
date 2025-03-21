class Cycle
{
	static int id=1;
	static String type="Mountain Bike";
	static String ageRange="Adult";
	static String brand="Urban Terrain";
	static int price=7499;
	static String colour="White";
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The Age Range is:"+ageRange);
	System.out.println("The brand name is:"+brand);
	System.out.println("The price is:"+price);
	System.out.println("The colour is:"+colour);
	id=2;
	type="Normal";
	ageRange="Kid";
	brand="Hero";
	price=5000;
	colour="Red";
	//reInit();
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The Age Range is:"+ageRange);
	System.out.println("The brand name is:"+brand);
	System.out.println("The price is:"+price);
	System.out.println("The colour is:"+colour);
	
	
}
public static void reInit()
{
    id=2;
	type="Normal";
	ageRange="Kid";
	brand="Hero";
	price=5000;
	colour="Red";
}
}

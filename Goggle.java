class Goggle
{
	static int id=1;
	static String brand="Sheomy";
	static int price=500;
	static String colour="Black";
	static boolean isUvProtected=true;
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Price:"+price);
	System.out.println("Colour:"+colour);
	System.out.println("Does it provides UV protection?:"+isUvProtected);
    id=2;
	brand="RED BULL SPECT";
	price=2000;
	colour="Blue";
	isUvProtected=false;
	//reInit();
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Price:"+price);
	System.out.println("Colour:"+colour);
	System.out.println("Does it provides UV protection?:"+isUvProtected);
	
	
	
}
public static void reInit()
{
    id=2;
	brand="RED BULL SPECT";
	price=2000;
	colour="Blue";
	isUvProtected=false;
}
}
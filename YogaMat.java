class YogaMat
{
	static int id=1;
	static String colour="Blue";
	static String brand="Boldfit";
	static String material="Thermoplastic Elastomers";
	static boolean isWashable=true;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Material:"+material);
	System.out.println("Colour:"+colour);
	System.out.println("Is it washable?:"+isWashable);
	//reInit();
	id=2;
	colour="Orange";
	brand="Lifelong";
	material="Thermoplastic Elastomers";
	isWashable=true;
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Material:"+material);
	System.out.println("Colour:"+colour);
	System.out.println("Is it washable?:"+isWashable);
	
	
}
public static void reInit()
{
    id=2;
	colour="Orange";
	brand="Lifelong";
	material="Thermoplastic Elastomers";
	isWashable=true;
}
}
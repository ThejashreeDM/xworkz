class Charger
{
	static int id=1;
	static String brand="Ambrane";
	static String colour="White";
	static int price=300;
	static int voltage=230;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Colour:"+colour);
	System.out.println("Price:"+price);
	System.out.println("Voltage in volts:"+voltage);
	id=2;
	brand="SamSung";
	colour="Black";
	price=578;
	voltage=240;
	System.out.println("\tReinitialized\t");
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Colour:"+colour);
	System.out.println("Price:"+price);
	System.out.println("Voltage in volts:"+voltage);

	
}
public static void reInit()
{
    id=2;
	brand="SamSung";
	colour="Black";
	price=578;
	voltage=240;
}
}
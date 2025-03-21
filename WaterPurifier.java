class WaterPurifier
{
	static int id=1;
	static String brand="Aquaguard";
	static int price=8999;
	static String dimension="32L x 27W x 48H Centimeters";
	static String installationType="Wall-mounted, Countertop";
	static String packageInfo="Dispenser";
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("The Brand is:"+brand);
	System.out.println("The price is:"+price);
	System.out.println("The Product Dimensions are:"+dimension);
	System.out.println("The Installation Type is:"+installationType);
	System.out.println("The Package Information:"+packageInfo);
	//reInit();
	///*
	id=2;
	brand="Kent";
	price=10000;
	dimension="36L x 28W x 49H Centimeters";
	installationType="Wall-mounted";
	packageInfo="Dispenser";
	//*/
	System.out.println("\tReinitialized\t");
	System.out.println("Id:"+id);
	System.out.println("The Brand is:"+brand);
	System.out.println("The price is:"+price);
	System.out.println("The Product Dimensions are:"+dimension);
	System.out.println("The Installation Type is:"+installationType);
	System.out.println("The Package Information:"+packageInfo);
}
public static void reInit()
{
    id=2;
	brand="Kent";
	price=10000;
	dimension="36L x 28W x 49H Centimeters";
	installationType="Wall-mounted";
	packageInfo="Dispenser";
}
}

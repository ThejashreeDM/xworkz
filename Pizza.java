class Pizza
{
	static int id=1;
	static String name="Corn with Cheese with Chicken";
	static String type="Non-veg";
	static String size="Medium";
	static int price=300;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Price:"+price);
	System.out.println("Type:"+type);
	System.out.println("Size:"+size);
	//reInit();
	///*
	id=2;
	name="Paneer";
	type="Veg";
	size="Small";
	price=200;
	//*/
	System.out.println("\tReInitialized\t");
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Price:"+price);
	System.out.println("Type:"+type);
	System.out.println("Size:"+size);
	
}
public static void reInit()
{
    id=2;
	name="Paneer";
	type="Veg";
	size="Small";
	price=200;
}
}
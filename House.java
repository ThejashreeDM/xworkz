class House
{
	static int id=1;
	static int price=2400000;
	static String colour="Brown";
	static int noFloors=2;
	static int noRooms=5;
	static boolean isParkingAvailable=true;
	static boolean isLiftAvailable=true;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Price:"+price);
	System.out.println("Colour:"+colour);
	System.out.println("Number of Floors:"+noFloors);
	System.out.println("Number of Rooms"+noRooms);
	System.out.println("Is Parking Available?:"+isParkingAvailable);
	System.out.println("Is Lift Available?:"+isLiftAvailable);
	//reInit();
	///*
	id=2;
	price=2800000;
	colour="Blue";
	noFloors=3;
	noRooms=4;
	isParkingAvailable=true;
	isLiftAvailable=true;
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Price:"+price);
	System.out.println("Colour:"+colour);
	System.out.println("Number of Floors:"+noFloors);
	System.out.println("Number of Rooms"+noRooms);
	System.out.println("Is Parking Available?:"+isParkingAvailable);
	System.out.println("Is Lift Available?:"+isLiftAvailable);
	
}
public static void reInit()
{
    id=2;
	price=2800000;
	colour="Blue";
	noFloors=3;
	noRooms=4;
	isParkingAvailable=true;
	isLiftAvailable=true;
}
}
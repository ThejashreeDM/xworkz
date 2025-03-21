class Bangle
{
	static int id=1;
	static String type="Gold";
	static int price=100000;
	static String weight="10gms";
	static boolean containsStone=true;
	static String stoneColour="White";
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("Weight is:"+weight);
	System.out.println("Does it contains Stone?:"+containsStone);
	System.out.println("The colour of the Stone is:"+stoneColour);
	///*
	id=2;
	type="Diamond";
	price=500000;
	weight="10gms";
	containsStone=true;
	stoneColour="Red";
	//reInit();
	//*/
	System.out.println("\tReinitialized\t");
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("Weight is:"+weight);
	System.out.println("Does it contains Stone?:"+containsStone);
	System.out.println("The colour of the Stone is:"+stoneColour);
	///*
}
public static void reInit()
{
	id=2;
	type="Diamond";
	price=500000;
	weight="10gms";
	containsStone=true;
	stoneColour="Red";
}
}
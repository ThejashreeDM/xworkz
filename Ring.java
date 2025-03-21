class Ring
{
	static int id=1;
	static String type="Gold";
	static int price=70000;
	static String weight="7 gms";
	static boolean containsStone=true;
	static String stoneColour="Red";
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("Weight is:"+weight);
	System.out.println("Does it contains Stone?:"+containsStone);
	System.out.println("The colour of the Stone is:"+stoneColour);
	id=2;
	type="Diamond";
	price=150000;
	weight="5 gms";
	containsStone=true;
	String stoneColour="green";
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("The type is:"+type);
	System.out.println("The price is:"+price);
	System.out.println("Weight is:"+weight);
	System.out.println("Does it contains Stone?:"+containsStone);
	System.out.println("The colour of the Stone is:"+stoneColour);
}
public static void reInit()
{
    id=2;
	type="Diamond";
	price=150000;
	weight="5 gms";
	containsStone=true;
}
}
class Bank
{
	static int id=1;
	static String name="State Bank of India";
	static String location="Mandya";
	static String type="National";
	static int minBalance=2000;
    static boolean isDigital=true;
public static void main(String args[])
{
	
	System.out.println("Id:"+id);
    System.out.println("Name:"+name);
    System.out.println("Location:"+location);
    System.out.println("Type:"+type);
    System.out.println("Minimum Balance:"+minBalance);
    System.out.println("Is digital service available:"+isDigital);	
	//reInit();
	///*
	id=2;
	name="Bank of Baroda";
	location="Mysore";
	type="National";
	minBalance=2000;
    isDigital=true;
	//*/
	System.out.println("\tReInitialized");
	System.out.println("Id:"+id);
    System.out.println("Name:"+name);
    System.out.println("Location:"+location);
    System.out.println("Type:"+type);
    System.out.println("Minimum Balance:"+minBalance);
    System.out.println("Is digital service available:"+isDigital);	
	
	
}
public static void reInit()
{
    id=1;
	name="Bank of Baroda";
	location="Mandya";
	type="National";
	minBalance=2000;
    isDigital=true;
}
}
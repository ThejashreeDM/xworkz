class Airport
{
	static int id=1;
	static String name="Kempegowda International Airport";
	static String location="Bengalure";
	static int noOfTerminals=2;
	static String type="Domestic and International";
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Location:"+location);
	System.out.println("Number of Terminals:"+noOfTerminals);
	System.out.println("Type:"+type);
	//reInit();
	///*
	id=2;
	name="HAL Airport";
	location="Bengaluru";
	noOfTerminals=2;
	type="Domestic and International";
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Location:"+location);
	System.out.println("Number of Terminals:"+noOfTerminals);
	System.out.println("Type:"+type);
}
public static void reInit()
{
    id=2;
	name="HAL Airport";
	location="Bengaluru";
	noOfTerminals=2;
	type="Domestic and International";
}
}
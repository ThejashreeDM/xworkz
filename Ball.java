class Ball
{
	static int id=1;
	static String colour="Brown";
	static String weight="580 grms";
	static String type="Basket Ball";
	static String diameter="230 millimeters";
	static String ageRange="Kid";
public static void main(String args[])
{
	
    System.out.println("Id:"+id);
	System.out.println("Colour:"+colour);
	System.out.println("Weight:"+weight);
	System.out.println("Type:"+type);
	System.out.println("Diameter:"+diameter);
	System.out.println("AgeRange:"+ageRange);
	///*
	id=2;
	colour="Gray";
	weight="600 grms";
	type="Hand Ball";
	diameter="100 millimeters";
	ageRange="Adult";
	//*/
	//reInit();
	System.out.println("\tReinitialized\t");
	System.out.println("Id:"+id);
	System.out.println("Colour:"+colour);
	System.out.println("Weight:"+weight);
	System.out.println("Type:"+type);
	System.out.println("Diameter:"+diameter);
	System.out.println("AgeRange:"+ageRange);
 
	
}
public static void reInit()
{
    id=2;
	colour="Gray";
	weight="600 grms";
	type="Hand Ball";
	diameter="100 millimeters";
	ageRange="Adult";
}
}
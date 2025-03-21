class Watch
{
	static int id=1;
	static String brand="Noise";
	static String colour="Black";
	static String type="Digital";
	static String shape="Rectangle";
	static int price=2000;
	static boolean isWaterProof=false;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Colour:"+colour);
	System.out.println("Type:"+type);
	System.out.println("Shape:"+shape);
	System.out.println("Price:"+price);
	//reInit();
	///*
	id=2;
	brand="Sonata";
	colour="Blue";
	type="Regular";
	shape="Circular";
	price=2500;
	isWaterProof=false;
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Brand:"+brand);
	System.out.println("Colour:"+colour);
	System.out.println("Type:"+type);
	System.out.println("Shape:"+shape);
	System.out.println("Price:"+price);
}
public static void reInit()
{
    id=2;
	brand="Sonata";
	colour="Blue";
	type="Regular";
	shape="Circular";
	price=2500;
	isWaterProof=false;
}
}
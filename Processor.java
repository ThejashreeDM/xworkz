class Processor
{
	static int id=1;
	static int price=15839;
	static String brand="AMD";
	static int cacheSize=36;
	static String dimensions="40LX40W Millimeters";
	static int noOfCores=8;
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Price:"+price);
	System.out.println("Brand:"+brand);
	System.out.println("Cache Size"+cacheSize);
	System.out.println("Dimensions:"+dimensions);
    System.out.println("Number of Cores:"+noOfCores);
	//reInit();
	///*
	id=2;
	price=25000;
	brand="Intel";
	cacheSize=64;
	dimensions="35LX30W Millimeters";
	noOfCores=8;
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Price:"+price);
	System.out.println("Brand:"+brand);
	System.out.println("Cache Size"+cacheSize);
	System.out.println("Dimensions:"+dimensions);
    System.out.println("Number of Cores:"+noOfCores);

}
public static void reInit()
{
   id=2;
	price=25000;
	brand="Intel";
	cacheSize=64;
	dimensions="35LX30W Millimeters";
	noOfCores=8;
}
}
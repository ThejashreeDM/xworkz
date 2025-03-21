class Tv
{
 static int id=1;
 static int price=20999;
 static String brand="Acer";
 static String memory="16 GB";
 static String screenSize="43 Inches";
 static String colour="Black";
public static void main(String args[])
{
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Memory:"+memory);
 System.out.println("Screen Size:"+screenSize); 
 System.out.println("Colour:"+colour);
 //reInit();
 ///*
 id=2;
 price=23000;
 brand="Soney";
 memory="16 GB";
 screenSize="43 Inches";
 colour="Silver";
 //*/
 System.out.println("\tReInitialized\t");
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Memory:"+memory);
 System.out.println("Screen Size:"+screenSize); 
 System.out.println("Colour:"+colour);
 
}
public static void reInit()
{
 id=2;
 price=23000;
 brand="Soney";
 memory="16 GB";
 screenSize="43 Inches";
 colour="Silver";
}
}
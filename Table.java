class Table
{
 static int id=1;
 static int price=1999;
 static String brand="About Space";
 static String shape="Rectangular";
 static String colour="Flower Wenge";
 static String design="Computer Desk";
public static void main(String args[])
{
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Shape:"+shape);
 System.out.println("Colour:"+colour);
 System.out.println("Design:"+design);
 //reInit();
 ///*
 id=2;
 price=28000;
 brand="IKEA";
 shape="Cicular";
 colour="Brown";
 design="Dinning Table";
 //*/
 System.out.println("\tReinitialized");
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Shape:"+shape);
 System.out.println("Colour:"+colour);
 System.out.println("Design:"+design);
 
 
}
public static void reInit()
{
 id=2;
 price=28000;
 brand="IKEA";
 shape="Cicular";
 colour="Brown";
 design="Dinning Table";
}
}
class Mirror
{
 static int id=1;
 static int price=1549;
 static String brand="LAPO-Be the Change";
 static String shape="Circle";
 static String dimension="30L*25W Centimeteres";
 static String  magnification="5X";
 static int weight=657;
public static void main(String args[])
{
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Shape:"+shape);
 System.out.println("Dimension:"+dimension);
 System.out.println("Maximum magnification:"+magnification);
 System.out.println("Weight in grms:"+weight);
 //reInit();
 //Re-Initialization
 ///*
 id=2;
  price=1649;
  brand="AYTM";
  shape="Rectanglular";
  dimension="40L*30W Centimeteres";
  magnification="6X";
  weight=957;
  //*/
 System.out.println("\tReInilialized\t");
 System.out.println("Id:"+id);
 System.out.println("Price:"+price);
 System.out.println("Brand:"+brand);
 System.out.println("Shape:"+shape);
 System.out.println("Dimension:"+dimension);
 System.out.println("Maximum magnification:"+magnification);
 System.out.println("Weight in grms:"+weight);
  
}
public static void reInit()
{
  id=2;
  price=1649;
  brand="AYTM";
  shape="Rectanglular";
  dimension="40L*30W Centimeteres";
  magnification="6X";
  weight=957;
}
}
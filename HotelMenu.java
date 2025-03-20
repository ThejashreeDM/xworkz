class HotelMenu
{
static String menu[]={"Idli","Dosa","Coconut Rice","Curd Rice","Pongal","Filter Coffee","Uttapam","Chicken 65","Vada","Paneer Chilli"};
public static void main(String args[])
{
System.out.println("start of main");
System.out.println("\tMENU");
getMenu();
System.out.println("end of main");
}
public static void getMenu()
{
System.out.println("start of getMenu");	
for(String item:menu)
{
	System.out.println(item);
}
System.out.println("end of getMenu");
//System.out.println("1."+menu[0]+"\n"+"2."+menu[1]+"\n"+"3."+menu[2]+"\n"+"4."+menu[3]+"\n"+"5."+menu[4]+"\n"+"6."+menu[5]+"\n"+"7."+menu[6]+"\n"+"8."+menu[7]+"\n"+"9."+menu[8]+"\n"+"10."+menu[9]);
}
}

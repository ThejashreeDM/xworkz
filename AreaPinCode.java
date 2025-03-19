class AreaPinCode
{
static int pinCodes[]={509210,507121,504273,515621,505445,503302,509375,507160,516421,521333};
public static void main(String args[])
{
System.out.println("main started");
System.out.println("\tPINCODES");
getPinCodes();
System.out.println("main ended");
}
public static void getPinCodes()
{
System.out.println("inside getPinCodes");
for(int pinCode:pinCodes)
{
	System.out.println(pinCode);
}
System.out.println("end of getPinCodes");
//System.out.println("1."+pinCodes[0]+"\n"+"2."+pinCodes[1]+"\n"+"3."+pinCodes[2]+"\n"+"4."+pinCodes[3]+"\n"+"5."+pinCodes[4]+"\n"+"6."+pinCodes[5]+"\n"+"7."+pinCodes[6]+"\n"+"8."+pinCodes[7]+"\n"+"9."+pinCodes[8]+"\n"+"10."+pinCodes[9]);
}
}
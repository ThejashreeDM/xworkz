class Fridge
{
public static boolean isOnOrOff;
 public static int currentTemp;
 public static int maxTemp=4;
 public static int minTemp;
 public static void onOrOff()
 {
   if(isOnOrOff)
   {
   isOnOrOff=false;
   System.out.println("Fridge is turned off");
   }
   else
   {
   isOnOrOff=true;
   System.out.println("Fridge is turned on");
   }
 }
 public static void increaseTemp()
 {
  if(isOnOrOff){
	 if(currentTemp<maxTemp)
	 {
	      currentTemp+=1;
		  System.out.println("The current temperature is "+currentTemp);
	 }
	 else
	 {
	  System.out.println("Maximum Temperature reached");
	 }
	 }
  else
     System.out.println("First turn on the Fridge");
 
 
 
 }
 public static void decreaseTemp()
 {
  if(isOnOrOff){
	 if(currentTemp>minTemp)
	 {
	     
		  currentTemp-=1;
		  System.out.println("The current temperature is "+currentTemp);
	 
	 }
	 else
	 {
	  System.out.println("Minimum Temperature reached");
	 }
	 }
  else
     System.out.println("First turn on the Fridge");
 
 
 
 }







}
class Microwave
{

 public static boolean isOnOrOff;
 public static int currentTemp;
 public static int maxTemp=100;
 public static int minTemp;
 public static void onOrOff()
 {
   if(isOnOrOff)
   {
   isOnOrOff=false;
   System.out.println("Microwave is turned off");
   }
   else
   {
   isOnOrOff=true;
   System.out.println("Microwave is turned on");
   }
 }
 public static void increaseTemp(int step)
 {
  if(isOnOrOff){
	 if(currentTemp<maxTemp)
	 {
	     if(currentTemp+step<=maxTemp)
		 {
		  currentTemp+=step;
		  System.out.println("The current temperature is "+currentTemp);
		 }
		 else
		 {
		  System.out.println("Temperature cannot be increased up to that level");
		 
		 }
	 
	 }
	 else
	 {
	  System.out.println("Maximum Temperature reached");
	 }
	 }
  else
     System.out.println("First turn on the Microwave");
 
 
 
 }
 public static void decreaseTemp(int step)
 {
  if(isOnOrOff){
	 if(currentTemp>minTemp)
	 {
	     if((currentTemp-step)>=minTemp)
		 {
		  currentTemp-=step;
		  System.out.println("The current temperature is "+currentTemp);
		 }
		 else
		 {
		  System.out.println("Temperature cannot be decreased up to that level");
		 
		 }
	 
	 }
	 else
	 {
	  System.out.println("Minimum Temperature reached");
	 }
	 }
  else
     System.out.println("First turn on the Microwave");
 
 
 
 }
}
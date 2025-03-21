class Projector
{

public static boolean isConnected;
	public static int currentBrightness;
	public static int maxBrightness=5;
	public static int minBrightness;
public static void onOrOff()
{
     if(isConnected)
	 {
	   isConnected=false;
	   System.out.println("Projector is turned Off");
	   
	 }
	 else
	 {
	   isConnected=true;
	   System.out.println("Projector is turned On");
     }
}
public static void increaseBrightness()
{
     if(isConnected)
     {
             if(currentBrightness<maxBrightness)
             {
	            currentBrightness+=1;
	            System.out.println("The current Brightness level is "+currentBrightness);
             }
             else{
	             System.out.println("The brightness is at its maximum level");
             }
      }
     else{
	         System.out.println("First connect the Projector");
      }
}
public static void decreaseBrightness()
{
        if(isConnected)
		{
			if(currentBrightness>minBrightness)
			{
				currentBrightness-=1;
				System.out.println("The current Brightness level is "+currentBrightness);
			}
			else{
				System.out.println("The Projector is at its minimum Brightness level");
			}
		}
		else{
			System.out.println("First Connect the Projector");
		}
}



}
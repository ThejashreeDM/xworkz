class Speaker
{
	public static boolean isConnected;
	public static int currentVolume;
	public static int maxVolume=5;
	public static int minVolume;
public static void onOrOff()
{
     if(isConnected)
	 {
	   isConnected=false;
	   System.out.println("Speaker is turned Off");
	   
	 }
	 else
	 {
	   isConnected=true;
	   System.out.println("Speaker is turned On");
     }
}
public static void increaseVolume()
{
     if(isConnected)
     {
             if(currentVolume<maxVolume)
             {
	            currentVolume+=1;
	            System.out.println("The current volume is "+currentVolume);
             }
             else{
	             System.out.println("The volume is at its maximum level");
             }
      }
     else{
	         System.out.println("First connect the speaker");
      }
}
public static void decreaseVolume()
{
        if(isConnected)
		{
			if(currentVolume>minVolume)
			{
				currentVolume-=1;
				System.out.println("The current volume is "+currentVolume);
			}
			else{
				System.out.println("The Speaker is at its minimum volume");
			}
		}
		else{
			System.out.println("First Connect the Speaker");
		}
}

}
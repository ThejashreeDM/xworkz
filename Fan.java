class Fan
{
public static boolean isOnOrOff;
 public static int currentSpeed;
 public static int maxSpeed=5;
 public static int minSpeed;
 public static void onOrOff()
{
     if(isOnOrOff)
	 {
	   isOnOrOff=false;
	   System.out.println("Fan is turned Off");
	   
	 }
	 else
	 {
	   isOnOrOff=true;
	   System.out.println("Fan is turned On");
     }
}
public static void increaseSpeed()
{
     if(isOnOrOff)
     {
             if(currentSpeed<maxSpeed)
             {
	            currentSpeed+=1;
	            System.out.println("The current Speed is "+currentSpeed);
             }
             else{
	             System.out.println("The Speed is at its maximum level");
             }
      }
     else{
	         System.out.println("First switch on the Fan");
      }
}
public static void decreaseSpeed()
{
        if(isOnOrOff)
		{
			if(currentSpeed>minSpeed)
			{
				currentSpeed-=1;
				System.out.println("The current Speed is "+currentSpeed);
			}
			else{
				System.out.println("The Fan is at its minimum Speed");
			}
		}
		else{
			System.out.println("First switch on the Fan");
		}
}
}
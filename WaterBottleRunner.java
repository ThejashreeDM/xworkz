class WaterBottleRunner
{
     public static void main(String args[])
	 {
	 
	            WaterBottle cpy1 = new WaterBottle();
				cpy1.id=1;
				cpy1.capacity="500 ML";
				cpy1.price=899.00;
				cpy1.colour="Green";
				cpy1.isSuitableForHotWater=true;
				System.out.println("ID : "+cpy1.id);
				System.out.println("Capacity : "+cpy1.capacity);
				System.out.println("Price : "+cpy1.price);
				System.out.println("Colour : "+cpy1.colour);
				System.out.println("Does it suitable for Hot water? : "+cpy1.isSuitableForHotWater);
				
				System.out.println();
				
				WaterBottle cpy2 = new WaterBottle();
				cpy2.id=2;
				cpy2.capacity="1000 ML";
				cpy2.price=100.00;
				cpy2.colour="White";
				cpy2.isSuitableForHotWater=false;
				System.out.println("ID : "+cpy2.id);
				System.out.println("Capacity : "+cpy2.capacity);
				System.out.println("Price : "+cpy2.price);
				System.out.println("Colour : "+cpy2.colour);
				System.out.println("Does it suitable for Hot water? : "+cpy2.isSuitableForHotWater);
				
	 
	 
	 
	 
	 
	 }





}
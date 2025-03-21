class ShoeRunner
{
    public static void main(String shoes[])
	{
	
	       Shoe cpy1 = new Shoe();
		   cpy1.id=1;
		   cpy1.brandName="PUMA";
		   cpy1.price=3000.00;
		   cpy1.colour="Black";
		   cpy1.size=7;
		   System.out.println("ID : "+cpy1.id);
		   System.out.println("Brand Name : "+cpy1.brandName);
		   System.out.println("Price : "+cpy1.price);
		   System.out.println("Colour : "+cpy1.colour);
		   System.out.println("Size : "+cpy1.size);
		   
		   System.out.println("\n");
		   
		   
		   
		   Shoe cpy2 = new Shoe();
		   cpy2.id=2;
		   cpy2.brandName="RedTape";
		   cpy2.price=4000.00;
		   cpy2.colour="Grey and White";
		   cpy2.size=7;
		   System.out.println("ID : "+cpy2.id);
		   System.out.println("Brand Name : "+cpy2.brandName);
		   System.out.println("Price : "+cpy2.price);
		   System.out.println("Colour : "+cpy2.colour);
		   System.out.println("Size : "+cpy2.size);
		   
		   System.out.println("\n");
		   
		   Shoe cpy3 = new Shoe();
		   cpy3.id=3;
		   cpy3.brandName="Nike";
		   cpy3.price=3500.00;
		   cpy3.colour="White";
		   cpy3.size=7;
		   System.out.println("ID : "+cpy3.id);
		   System.out.println("Brand Name : "+cpy3.brandName);
		   System.out.println("Price : "+cpy3.price);
		   System.out.println("Colour : "+cpy3.colour);
		   System.out.println("Size : "+cpy3.size);
		   
	}

}
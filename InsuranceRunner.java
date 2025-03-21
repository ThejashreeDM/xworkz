class InsuranceRunner
{
   
   public static void main(String args[])
   {
   
    String insuranceName="SBI Life Insurance";
    double price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	
	insuranceName = "HDFC Ergo Life Insurance";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	insuranceName = "Max Life Insurance";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	insuranceName = "Exide Life Insurance";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	insuranceName = "Reliance Life Insurance";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	insuranceName = "Aviva Life Insurance";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);
	
	insuranceName = "ABC";
	price = Insurance.provideInsuranceInfo(insuranceName);
	if(price!=0.0)
	System.out.println("The price of the "+insuranceName+" is "+price);

   
   }
  
   
}
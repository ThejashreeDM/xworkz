class Insurance
{
    public static double provideInsuranceInfo(String insuranceName)
	{
	    double price=0.0;
		
		if(insuranceName == "SBI Life Insurance")
		   price=12000.00;
		   
		else if(insuranceName == "LIC")
		   price=8000.00;
		   
		else if(insuranceName == "HDFC Ergo Life Insurance")
		   price=6700.00;
		   
		else if(insuranceName == "Max Life Insurance")
		   price=12000.00;
		   
		else if(insuranceName == "Exide Life Insurance")
		   price=8900.00;

        else if(insuranceName == "Reliance Life Insurance")
           price=15000.00;

        else if(insuranceName == "Aviva Life Insurance")
           price=8999.00;

        else if(insuranceName == "Kotak Life Insurance")
           price=6789.00;

        else if(insuranceName == "Birla Sun Life Insurance")
           price=16000;

        else if(insuranceName == "Shriram Life Insurance")
           price=7000.00;		
		   
		else
		   System.out.println("Invalid Insurance Name... Please provide a Valid Insurance Name");
		
	    return price;
	
	}
}
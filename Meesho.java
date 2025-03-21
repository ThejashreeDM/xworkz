class Meesho
{
   public static String signUp(String email,String otp)
   {
     if(email!=null && !email.isEmpty() && otp!=null && !otp.isEmpty() && otp.length()==6)
	    return "User login Sucessfull";
	 else
	    return "User login Unsucessfull";
   
   }
   public static String signUp(long phoneNumber,String otp)
   {
     if(phoneNumber!=0 && otp!=null && !otp.isEmpty() && otp.length()==6)
	    return "User login Sucessfull";
	 else
	    return "User login Unsucessfull";
   
   }



}
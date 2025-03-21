class Instagram
{

  public static String signUp(String email,String dob,String password,String name,String userName)
  {
   boolean isEmailValid=false;
   boolean isDobValid=false;
   boolean isPasswordValid=false;
   boolean isNameValid=false;
   boolean isUserNameValid=false;
   
    if(email!=null && !email.isEmpty())
	  isEmailValid=true;
	else
	  System.out.println("Email is invalid... Please provide a valid email");
	  
	if(dob!=null && !dob.isEmpty())
	   isDobValid=true;
	else
	  System.out.println("Dob is invalid..Please provide a valid Dob");
	  
	if(password!=null && password.length()>=8 && password.length()<=16)
	   isPasswordValid=true;
	else
	   System.out.println("Password is invalid...Please Provide a valid password");
	 
	if(name!=null && name.length()>=3)
	   isNameValid=true;
	else
	   System.out.println("Name is invalid..Please provide a valid Name");
	   
	if(userName!=null && userName.length()>=3)
	   isUserNameValid=true;
	else
	   System.out.println("User Name is invalid...Please provide a valid userName");
	   
	if(isEmailValid && isDobValid && isPasswordValid && isNameValid && isUserNameValid)
	   return "User Signed Up Successfully";
	else
	   return "User SignUp unsuccessfull";
  
  
  
  }
  public static String signUp(long phoneNumber,String dob,String password,String name,String userName)
  {
   boolean isPhoneNumberValid=false;
   boolean isDobValid=false;
   boolean isPasswordValid=false;
   boolean isNameValid=false;
   boolean isUserNameValid=false;
   
    if(phoneNumber!=0)
	  isPhoneNumberValid=true;
	else
	  System.out.println("Email is invalid... Please provide a valid email");
	  
	if(dob!=null && !dob.isEmpty())
	   isDobValid=true;
	else
	  System.out.println("Dob is invalid..Please provide a valid Dob");
	  
	if(password!=null && password.length()>=8 && password.length()<=16)
	   isPasswordValid=true;
	else
	   System.out.println("Password is invalid...Please Provide a valid password");
	 
	if(name!=null && name.length()>=3)
	   isNameValid=true;
	else
	   System.out.println("Name is invalid..Please provide a valid Name");
	   
	if(userName!=null && userName.length()>=3)
	   isUserNameValid=true;
	else
	   System.out.println("User Name is invalid...Please provide a valid userName");
	   
	if(isPhoneNumberValid && isDobValid && isPasswordValid && isNameValid && isUserNameValid)
	   return "User Signed Up Successfully";
	else
	   return "User SignUp unsuccessfull";
  
  
  
  }






}
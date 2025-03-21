class Swiggy
{
public static String signUp(String phoneNumber , String name , String email , String password )
{
String registered=null;
boolean isValidated=validate(phoneNumber,name,email,password);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String phoneNumber , String name , String email , String password)
{
boolean isUserValid=false;
   boolean isPhoneNumberValid=false;
   boolean isNameValid=false;
   boolean isEmailValid=false;
   boolean isPasswordValid=false;
   
   if(phoneNumber!=null && phoneNumber.length()==10)
       isPhoneNumberValid=true;
   else
       System.out.println("Phone number is invalid.. Please enter the valid Phone Number");
   
   
    if(name!=null && name.length()>=3)
       isNameValid=true;
    else
       System.out.println("The Name is invalid..Please provide a valid Name");
	   
	if(email!=null && !email.isEmpty())
	   isEmailValid=true;
    else
	   System.out.println("The email is invalid...Please provide a valid email");   
	   
	if(password!=null && password.length()>=8 && password.length()<=16)
       isPasswordValid=true;
    else
       System.out.println("The password is invalid..Please provide a valid password");
	   

   if(isPhoneNumberValid && isNameValid && isEmailValid && isPasswordValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}
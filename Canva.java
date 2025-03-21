class Canva
{

public static String signUp(String email , String userName ,String password ,String phoneNumber)
{
String registered=null;
boolean isValidated=validate(email,userName,password,phoneNumber);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String email , String userName , String password ,String phoneNumber)
{
boolean isUserValid=false;
   boolean isEmailValid=false;
   boolean isUserNameValid=false;
   boolean isPasswordValid=false;
   boolean isPhoneNumberValid=false;
	   
	if(email!=null && !email.isEmpty())
	   isEmailValid=true;
    else
	   System.out.println("The email is invalid...Please provide a valid email");  

    if(userName!=null && userName.length()>=3)
       isUserNameValid=true;
    else
       System.out.println("The User Name is invalid..Please provide a valid User Name");	   
	   
	if(password!=null && password.length()>=8 && password.length()<=16)
       isPasswordValid=true;
    else
       System.out.println("The password is invalid..Please provide a valid password");
	   
	if(phoneNumber!=null && phoneNumber.length()==10)
       isPhoneNumberValid=true;
    else
       System.out.println("Phone number is invalid.. Please enter the valid Phone Number");
	   

   if(isEmailValid && isPasswordValid && isUserNameValid && isPhoneNumberValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}
class Zomato
{
public static String createAccount(String userName , String password , String confirmPassword , String email , String captcha )
{
String registered=null;
boolean isValidated=validate(userName,password,confirmPassword,email,captcha);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String userName , String password , String confirmPassword , String email , String captcha)
{
boolean isUserValid=false;
   boolean isUserNameValid=false;
   boolean isPasswordValid=false;
   boolean isConfirmPasswordValid=false;
   boolean isEmailValid=false;
   boolean isCaptchaValid=false;
   
    if(userName!=null && userName.length()>=3)
       isUserNameValid=true;
    else
       System.out.println("The User name is invalid..Please provide a valid User name");
	   
	if(password!=null && password.length()>=8 && password.length()<=16)
       isPasswordValid=true;
    else
       System.out.println("The password is invalid..Please provide a valid password");
	   
	if(confirmPassword.equals(password))
       isConfirmPasswordValid=true;
    else
       System.out.println("The  confirm password is invalid..Please provide a valid confirm password");
	   
	if(email!=null && !email.isEmpty())
	   isEmailValid=true;
    else
	   System.out.println("The email is invalid...Please provide a valid email");
   
   if(captcha!=null && captcha.length()==9)
       isCaptchaValid=true;
   else
       System.out.println("Captcha is invalid.. Please enter the valid Captcha");

	   
   if(isUserNameValid && isPasswordValid && isConfirmPasswordValid && isEmailValid &&isCaptchaValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}
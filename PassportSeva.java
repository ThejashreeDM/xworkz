class PassportSeva
{
public static String register(String cpvLocation,String dcdrLocation,String givenName,String surName,String dob,String email,boolean isemailLoginSame,String loginId,String password,String confirmPassword,String hintQues,String hintAns,String captcha)
{
String registered=null;
boolean isValidated=validate(cpvLocation,dcdrLocation,givenName,surName,dob,email,isemailLoginSame,loginId,password,confirmPassword,hintQues,hintAns,captcha);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String cpvLocation,String dcdrLocation,String givenName,String surName,String dob,String email,boolean isEmailLoginSame,String loginId,String password,String confirmPassword,String hintQues,String hintAns,String captcha)
{boolean isUserValid=false;
   boolean isCpvLocationValid=false;
   boolean isDcdrLocationValid=false;
   boolean isGivenNameValid=false;
   boolean isSurNameValid=false;
   boolean isDobValid=false;
   boolean isEmailValid=false;
   boolean isEmailSameAsLoginValid=false;
   boolean isLoginIdValid=false;
   boolean isPasswordValid=false;
   boolean isConfirmPasswordValid=false;
   boolean isHintQuesValid=false;
   boolean isHintAnsValid=false;
   boolean isCaptchaValid=false;
   
   if(cpvLocation!=null && !cpvLocation.isEmpty())
      isCpvLocationValid=true;
   else
      System.out.println("Invalid Cpv Location ...Please provide a valid Cpv Location");
	  
	  
   if(dcdrLocation!=null && !dcdrLocation.isEmpty())
      isDcdrLocationValid=true;
   else
      System.out.println("Invalid Dcdr Location ...Please provide a valid Dcdr Location");
	  
	  
   if(givenName!=null && givenName.length()>=3 && givenName.length()<=45)
       isGivenNameValid=true;
   else
       System.out.println("The Given name is invalid..Please provide a valid Given name");
	   
   if(surName!=null && surName.length()>=1 && surName.length()<=45)
       isSurNameValid=true;
   else
       System.out.println("The Surname is invalid..Please provide a valid Surname");

   if(dob!=null && !dob.isEmpty())
       isDobValid=true;
   else
       System.out.println("Date of Birth is invalid...Please provide valid Date of Birth");
	   
	   
   if(email!=null && !email.isEmpty())
	   isEmailValid=true;
   else
	   System.out.println("The email is invalid...Please provide a valid email");   
 
 
  if(isEmailLoginSame==true||isEmailLoginSame==false)
      isEmailSameAsLoginValid=true;
   else
      System.out.println("Please specify whether login is same as email or not");
   
   
   if((isEmailLoginSame && loginId.equals(email))||(!isEmailLoginSame && loginId!=null && !loginId.isEmpty()))
       isLoginIdValid=true;
   else
       System.out.println("Invalid login Id please provide a valid login Id");


   if(password!=null && password.length()>=8 && password.length()<=16)
       isPasswordValid=true;
   else
       System.out.println("The password is invalid..Please provide a valid password");
	   

   if(confirmPassword.equals(password))
       isConfirmPasswordValid=true;
   else
       System.out.println("The  confirm password is invalid..Please provide a valid confirm password");
	   
	   
	if(hintQues!=null && !hintQues.isEmpty())
	  isHintQuesValid=true;
	else
	  System.out.println("Please select valid hint question");
	  
	  
	if(hintAns!=null&& !hintAns.isEmpty())
	  isHintAnsValid=true;
	else
	  System.out.println("Please provide valid hint answer");
	   
	   
	if(captcha!=null && captcha.length()==7)
       isCaptchaValid=true;
    else
       System.out.println("Captcha is invalid.. Please enter the valid Captcha");

	   	   
  if(isCpvLocationValid && isDcdrLocationValid && isGivenNameValid && isSurNameValid && isDobValid && isEmailLoginSame && isEmailSameAsLoginValid && isLoginIdValid && isPasswordValid && isConfirmPasswordValid && isHintQuesValid && isHintAnsValid && isCaptchaValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;


}
}
class Facebook
{
public static String signUp(String firstName,String surname,String dob,String gender,String email,String password)
{
String registered=null;
boolean isValidated=validate(firstName,surname,dob,gender,email,password);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;

}
public static boolean validate(String firstName,String surname,String dob,String gender,String email,String password)
{
   boolean isUserValid=false;
   boolean isFirstNameValid=false;
   boolean isSurnameValid=false;
   boolean isDobValid=false;
   boolean isGenderValid=false;
   boolean isEmailValid=false;
   boolean isPasswordValid=false;
   
    if(firstName!=null && !firstName.isEmpty() &&firstName.length()>=3)
       isFirstNameValid=true;
    else
       System.out.println("The First name is invalid..Please provide a valid First name");
   
   if(surname!=null && !surname.isEmpty() &&surname.length()>=1)
       isSurnameValid=true;
    else
       System.out.println("The Surname is invalid..Please provide a valid Surname");
   
   if(dob!=null &&  !dob.isEmpty())
       isDobValid=true;
   else
       System.out.println("Date of Birth is invalid...Please provide valid Date of Birth");
   
   if(gender!=null && !gender.isEmpty())
       isGenderValid=true;
   else
       System.out.println("Gender is invalid..Please enter the valid gender");
   
   if(email!=null && !email.isEmpty())
	   isEmailValid=true;
    else
	   System.out.println("The email is invalid...Please provide a valid email");
	   
	if(password!=null && !password.isEmpty() && password.length()>=8 && password.length()<=16)
       isPasswordValid=true;
    else
       System.out.println("The password is invalid..Please provide a valid password");
	   
	if(isFirstNameValid && isSurnameValid && isDobValid && isGenderValid && isEmailValid &&isPasswordValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}

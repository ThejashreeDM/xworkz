class Flipkart
{
public static String signUp(String firstName , String lastName , String gender , String email , String mobileNumber)
{
String registerd=null;
boolean isValidated=validate(firstName , lastName , gender , email , mobileNumber);
if(isValidated)
  registerd="User Registerd Successfully";
else
  registerd="User Registration is Unsuccessful";
return registerd;
}
public static boolean validate(String firstName , String lastName , String gender , String email , String mobileNumber)
{
boolean isUserValid=false;
   boolean isFirstNameValid=false;
   boolean isLastNameValid=false;
   boolean isGenderValid=false;
   boolean isNameValid=false;
   boolean isEmailValid=false;
   boolean isMobileNumberValid=false;
   
    if(firstName!=null && firstName.length()>=3 && !firstName.isEmpty())
       isFirstNameValid=true;
    else
       System.out.println("The First name is invalid..Please provide a valid First name");
	   
	if(lastName!=null && lastName.length()>=1 && !lastName.isEmpty())
       isLastNameValid=true;
    else
       System.out.println("The Last name is invalid..Please provide a valid Last name");
	   
	if(gender!=null && !gender.isEmpty())
       isGenderValid=true;
    else
       System.out.println("Gender is invalid..Please enter the valid gender");
	   
	if(email!=null && !email.isEmpty())
	   isEmailValid=true;
    else
	   System.out.println("The email is invalid...Please provide a valid email");
   
   if(mobileNumber!=null && mobileNumber.length()==10 && !mobileNumber.isEmpty())
       isMobileNumberValid=true;
   else
       System.out.println("Mobile number is invalid.. Please enter the valid Mobile Number");

	   
   if(isFirstNameValid && isLastNameValid && isGenderValid && isEmailValid &&isMobileNumberValid )
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}
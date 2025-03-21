class Myntra
{
public static String signUp(String phoneNumber , String firstName , String email , String gender , String dob , String alternateMobileNumber)
{
String registered=null;
boolean isValidated=validate(phoneNumber,firstName,email,gender,dob,alternateMobileNumber);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String phoneNumber , String firstName , String email , String gender , String dob , String alternateMobileNumber)
{
boolean isUserValid=false;
   boolean isPhoneNumberValid=false;
   boolean isFirstNameValid=false;
   boolean isEmailValid=false;
   boolean isGenderValid=false;
   boolean isDobValid=false;
   boolean isAlternateMobileNumber=false;
   
   if(phoneNumber!=null && phoneNumber.length()==10 && !phoneNumber.isEmpty())
       isPhoneNumberValid=true;
   else
       System.out.println("Phone number is invalid.. Please enter the valid Phone Number");

   if(firstName!=null && firstName.length()>=3 && !firstName.isEmpty())
       isFirstNameValid=true;
    else
       System.out.println("The First name is invalid..Please provide a valid First name");
   
   if(email!=null && !email.isEmpty() )
	   isEmailValid=true;
   else
	   System.out.println("The email is invalid...Please provide a valid email");
	   
   if(gender!=null && !gender.isEmpty())
       isGenderValid=true;
   else
       System.out.println("Gender is invalid..Please enter the valid gender");
	   
   if(dob!=null && !dob.isEmpty())
       isDobValid=true;
   else
       System.out.println("Date of Birth is invalid...Please provide valid Date of Birth");
   
   if(alternateMobileNumber!=null && alternateMobileNumber.length()==10 && !alternateMobileNumber.isEmpty())
       isAlternateMobileNumber=true;
   else
       System.out.println("Alternate Mobile number is invalid.. Please enter the valid Alternate Mobile Number");
	   
   if(isPhoneNumberValid && isFirstNameValid && isEmailValid && isGenderValid && isDobValid && isAlternateMobileNumber)
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
}
}
   
class Amazon
{
public static String signUp(String firstName,String lastName,String phoneNumber,String dob,String mailId,String gender)
{
String userIsValidated=null;

boolean userValid=validate(firstName,lastName,phoneNumber,dob,mailId,gender);
  if(userValid)
    userIsValidated="User Successfully Registered";
  else
    userIsValidated="User Registration unsuccessfull";
return userIsValidated;

}
public static boolean validate(String firstName,String lastName,String phoneNumber,String dob,String mailId,String gender)
{
boolean userValid=false;
   boolean isFirstNameValid=false;
   boolean isLastNameValid=false;
   boolean isPhoneNumberValid=false;
   boolean isMailIdValid=false;
   boolean isDobValid=false;
   boolean isGenderValid=false;
 
 
   if(firstName!=null&&firstName.length()>=3&& !firstName.isEmpty())
      isFirstNameValid=true;
   else
      System.out.println("First name is invalid...Please provide valid First name");
  
  
   if(lastName!=null&&lastName.length()>=1 && !lastName.isEmpty())
      isLastNameValid=true;
   else
      System.out.println("Last name is invalid...Please provide valid Last name");
  
  
   if(phoneNumber!=null&&phoneNumber.length()>0&&phoneNumber.length()==10 && !phoneNumber.isEmpty())
      isPhoneNumberValid=true;
   else
      System.out.println("Phone number is invalid...Please provide valid Phone Number");
  
  
   if(mailId!=null && !mailId.isEmpty())
	   isMailIdValid=true;
   else
	   System.out.println("MailId is invalid ...Please provide valid MailId");
   
   

   if(dob!=null && !dob.isEmpty())
       isDobValid=true;
   else
       System.out.println("Date of Birth is invalid...Please provide valid Date of Birth");
   
   
   if(gender!=null&& !gender.isEmpty())
       isGenderValid=true;
   else
       System.out.println("Gender is invalid...Please provide valid gender");
   
   
if(isFirstNameValid&&isLastNameValid&&isPhoneNumberValid&&isMailIdValid&&isDobValid&&isGenderValid)
 {
       userValid=true;
 }
return userValid;


}
}
class Ajio
{
public static String joinIn(String phoneNumber,String gender,String name,String email,String inviteCode)
{
String registered=null;
boolean isValidated=validate(phoneNumber,gender,name,email,inviteCode);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String phoneNumber,String gender,String name,String email,String inviteCode)
{
boolean isUserValid=false;
   boolean isPhoneNumberValid=false;
   boolean isGenderValid=false;
   boolean isNameValid=false;
   boolean isEmailValid=false;
   boolean isInviteCodeValid=false;
   
   if(phoneNumber!=null && phoneNumber.length()==10)
       isPhoneNumberValid=true;
   else
       System.out.println("Phone number is invalid.. Please enter the valid Phone Number");

   if(gender!=null)
       isGenderValid=true;
   else
       System.out.println("Gender is invalid..Please enter the valid gender");
	   
   if(name!=null && name.length()>=3)
       isNameValid=true;
   else
       System.out.println("The name is invalid..Please provide a valid name");
   
   if(email!=null)
	   isEmailValid=true;
   else
	   System.out.println("The email is invalid...Please provide a valid email");
	   
   if((inviteCode!=null && inviteCode.length()==6)||inviteCode==null)
       isInviteCodeValid=true;
   else
       System.out.println("Invite code is invalid please provide a valid a valid invite code");
	   
   if(isPhoneNumberValid && isGenderValid && isNameValid && isEmailValid &&  isInviteCodeValid)
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;
   
}
}
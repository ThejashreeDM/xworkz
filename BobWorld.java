class BobWorld
{
public static String register(String ifscCode,String branchName,String accountNo,String micrCode)
{
String registered=null;
boolean isValidated=validate(ifscCode,branchName,accountNo,micrCode);
if(isValidated)
  registered="User Registerd Successfully";
else
  registered="User Registration is Unsuccessful";
return registered;
}
public static boolean validate(String ifscCode,String branchName,String accountNo,String micrCode)
{
boolean isUserValid=false;
   boolean isIfscCodeValid=false;
   boolean isBranchNameValid=false;
   boolean isAccountNoValid=false;
   boolean isMicrCodeValid=false;
   if(ifscCode!=null && ifscCode.length()==11)
      isIfscCodeValid=true;
   else
      System.out.println("Invalid IFSC Code....Please provide a valid IFSC Code");
	  
	  
   if(branchName!=null && !branchName.isEmpty())
      isBranchNameValid=true;
   else
      System.out.println("Invalid branch Name ...Please provide a valid Branch Name");
	  
	  
   if(accountNo!=null && accountNo.length()==14)
       isAccountNoValid=true;
   else
       System.out.println("The Given Account Number is invalid..Please provide a valid Account Number");
	   
   if(micrCode!=null && micrCode.length()==9)
       isMicrCodeValid=true;
   else
       System.out.println("The MICR Code is invalid..Please provide a valid MICR Code");
	   
	   
	if(isIfscCodeValid && isBranchNameValid && isAccountNoValid && isMicrCodeValid)
      isUserValid=true;
   else
      isUserValid=false;
return isUserValid;

}
}
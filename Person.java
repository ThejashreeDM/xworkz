class Person
{
public static void main(String args[])
{
String personName="Baba";
String pan="ABCDE1212F";
long adhaarNo=123456789123L;
long phoneNo=1234567890L;
String emailId="baba123@gmail.com";
String address1="Banglore";
String address2="Mandya";
char gender='M';
int age=99;
String dob="23/12/1926";
String father="NA";
String mother="NA";
String guardian="NA";
boolean isAlive=true;
String maritalStatus="NA";
String bloodGroup="B+";
//Implicit reference
System.out.println("Baba");

//Explicit reference
System.out.println("The name of the person is:"+personName);
System.out.println("The PAN number of the person is:"+pan);
System.out.println("The Phone number of the person is:"+adhaarNo);
System.out.println("The email Id of the Person is:"+emailId);
System.out.println("The current address of the person is:"+address1);
System.out.println("The permanent address of the person is:"+address2);
System.out.println("The gender of the person is:"+gender);
System.out.println("The age of the person is:"+age);
System.out.println("The date of birth of the person is:"+dob);
System.out.println("The father name of the person is:"+father);
System.out.println("The mother name of the person is:"+mother);
System.out.println("The guardian name of the person is:"+guardian);
System.out.println("Is the person is alive?:"+isAlive);
System.out.println("The maritalstatus of the person is:"+maritalStatus);
System.out.println("The blood group of the person is:"+bloodGroup);
}
}
class Patient
{
static int patientId=1;
static String patientName="Lakshman";
static char gender='M';
public static void main(String args[])
{
System.out.println("The patient Id is:"+patientId);
System.out.println("The Patient Name is:"+patientName);
System.out.println("The gender is:"+gender);
///*
patientId=2;
patientName="Rama";
gender='F';
//*/
//reInit();
System.out.println("\tReinitialized");
System.out.println("The patient Id is:"+patientId);
System.out.println("The Patient Name is:"+patientName);
System.out.println("The gender is:"+gender);
}
public static void reInit()
{
patientId=2;
patientName="Rama";
gender='F';
}
}
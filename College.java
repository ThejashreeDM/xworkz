class College
{
 static String collegeName="P E S College of Engineering";
 static String collegeLocation="Mandya";
 static String courseAvailable="B.E";
public static void main(String args[])
{
System.out.println("Colleg Name:"+collegeName);
System.out.println("College Location:"+collegeLocation);
System.out.println("Course Available:"+courseAvailable);
//reInit();
///*
collegeName="M I T";
collegeLocation="Mysore";
courseAvailable="B.E";
//*/
System.out.println("\tReinitialized");
System.out.println("Colleg Name:"+collegeName);
System.out.println("College Location:"+collegeLocation);
System.out.println("Course Available:"+courseAvailable);
}
public static void reInit()
{
collegeName="M I T";
collegeLocation="Mysore";
courseAvailable="B.E";
}
}
class School
{
	static int id=1;
	static String name="M E S School";
	static String location="Mandya";
	static String type="Private";
	static int upToGrade=10;
	static String syllabusType="State";
public static void main(String args[])
{
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Location:"+location);
	System.out.println("Type:"+type);
	System.out.println("Highest grade:"+upToGrade);
	System.out.println("Syllabus Type:"+syllabusType);
	//reInit();
	///*
	id=2;
	name="Adarsha School";
	location="Mandya";
	type="Private";
	upToGrade=10;
	syllabusType="State";
	//*/
	System.out.println("\tReinitialized");
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Location:"+location);
	System.out.println("Type:"+type);
	System.out.println("Highest grade:"+upToGrade);
	System.out.println("Syllabus Type:"+syllabusType);
	
}
public static void reInit()
{
    id=2;
	name="Adarsha School";
	location="Mandya";
	type="Private";
	upToGrade=10;
	syllabusType="State";
}
}
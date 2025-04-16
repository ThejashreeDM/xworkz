package com.xworkz.inheritancemodule.institute;

public class XworkzRunner
{
    public static void main(String[] args) {
        Institute institute = new Institute();
        Institute xworkzInstitute = new Xworkz();
        Xworkz xworkz = new Xworkz();
        institute.arrangeWorkshops();
        institute.conductExams();
        institute.provideService();
        institute.maintainInfrastructure();
        institute.offerCourses();
        xworkzInstitute.arrangeWorkshops();
        xworkzInstitute.conductExams();
        xworkzInstitute.provideService();
        xworkzInstitute.maintainInfrastructure();
        xworkzInstitute.offerCourses();
        xworkz.hostPlacementDrives();
        xworkz.provideInternships();
        xworkz.collaborateWithIndustries();
        xworkz.makesJobReady();
        xworkz.offerSkillDevelopment();
    }
}

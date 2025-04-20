package com.xworkz.inheritancemodule.institute;

public class Xworkz extends Institute{

     @Override
    public  void provideService()
    {
        System.out.println("Xworkz provide Java Training");
    }
    @Override
    public void offerCourses() {
        System.out.println("Offering various courses in the xworkz institute");
    }
    @Override
    public void conductExams() {
        System.out.println("Conducting mock exams for the students");
    }
    @Override
    public void provideCertificates() {
        System.out.println("Providing certificates after course completion by Xworkz");
    }
    @Override
    public void arrangeWorkshops() {
        System.out.println("Arranging workshops and seminars for the students Xworkz");
    }
    @Override
    public void maintainInfrastructure() {
        System.out.println("Maintaining the infrastructure and facilities of the Xworkz");
    }

    public void offerSkillDevelopment() {
        System.out.println("Offering skill development programs at XWorkz.");
    }

    public void provideInternships() {
        System.out.println("Providing internships and hands-on training at XWorkz.");
    }

    public void hostPlacementDrives() {
        System.out.println("Hosting placement drives for students at XWorkz.");
    }

    public void collaborateWithIndustries() {
        System.out.println("Collaborating with industries for better exposure at XWorkz.");
    }

    public void makesJobReady() {
        System.out.println("Provides skills that make students job ready");
    }
}

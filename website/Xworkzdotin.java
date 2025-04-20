package com.xworkz.inheritancemodule.website;

public class Xworkzdotin extends Website
{
    @Override
    public void provideInfo()
    {
        System.out.println("Websites provides Information about respective oraganizations");
    }
    @Override
    public void load() {
        System.out.println("Loading the xworkz website's home page");
    }
    @Override
    public void displayContent() {
        System.out.println("Displaying the content of the xworkz website");
    }
    @Override
    public void interactWithUser() {
        System.out.println("Allowing users to interact with the xworkz website");
    }
    @Override
    public void updateContent() {
        System.out.println("Updating content on the xworkz website to keep it fresh");
    }
    @Override
    public void optimizePerformance() {
        System.out.println("Optimizing the xworkz website's performance for faster load times");
    }
    public void provideCourses() {
        System.out.println("Providing various online courses at Xworkz.");
    }

    public void offerCertifications() {
        System.out.println("Offering certifications for completed courses.");
    }

    public void userRegistration() {
        System.out.println("Allowing users to register on the Xworkz website.");
    }

    public void postUpdates() {
        System.out.println("Posting the latest updates and announcements on Xworkz.");
    }

    public void provideSupport() {
        System.out.println("Providing customer support for users on Xworkz.");
    }
}

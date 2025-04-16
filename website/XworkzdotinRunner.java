package com.xworkz.inheritancemodule.website;

public class XworkzdotinRunner {
    public static void main(String[] args) {
        Website website = new Website();
        Website xworkzAsWebsite = new Xworkzdotin();
        Xworkzdotin xworkz = new Xworkzdotin();
        website.provideInfo();
        website.load();
        website.displayContent();
        website.interactWithUser();
        website.updateContent();
        website.optimizePerformance();
        xworkzAsWebsite.provideInfo();
        xworkzAsWebsite.load();
        xworkzAsWebsite.displayContent();
        xworkzAsWebsite.interactWithUser();
        xworkzAsWebsite.updateContent();
        xworkzAsWebsite.optimizePerformance();
        xworkz.provideCourses();
        xworkz.offerCertifications();
        xworkz.userRegistration();
        xworkz.postUpdates();
        xworkz.provideSupport();
    }
}

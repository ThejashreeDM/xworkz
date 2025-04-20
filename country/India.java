package com.xworkz.inheritancemodule.country;

public class India extends Country
{
    @Override
    public void toLive()
    {
        System.out.println("India is to live");
    }
    @Override
    public void declareIndependence() {
        System.out.println("The India declares its independence.");
    }

    @Override
    public void electGovernment() {
        System.out.println("The India elects its government.");
    }
    @Override
    public void maintainLaw() {
        System.out.println("The India maintains law and order.");
    }
    @Override
    public void developInfrastructure() {
        System.out.println("The India develops its infrastructure.");
    }
    @Override
    public void promoteCulture() {
        System.out.println("The India promotes its culture.");
    }

    public void celebrateRepublicDay() {
        System.out.println("India celebrates Republic Day on January 26.");
    }

    public void celebrateIndependenceDay() {
        System.out.println("India celebrates Independence Day on August 15.");
    }

    public void conductElections() {
        System.out.println("India conducts democratic elections.");
    }

    public void supportISRO() {
        System.out.println("India supports space missions through ISRO.");
    }

    public void promoteYoga() {
        System.out.println("India promotes Yoga worldwide.");
    }
}

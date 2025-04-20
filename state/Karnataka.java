package com.xworkz.inheritancemodule.state;

public class Karnataka extends State
{
    @Override
    public void toGroupPeopleOfSimilarKind()
    {
        System.out.println("Karnataka is to group Kannada Speaking people  ");
    }
    @Override
    public void defineBorders() {
        System.out.println("Defining the borders of the Karnataka state");
    }

    @Override
    public void formGovernment() {
        System.out.println("Forming the government of the Karnataka state");
    }
    @Override
    public void provideServices() {
        System.out.println("Providing public services to the residents of the Karnataka state");
    }

    @Override
    public void maintainLawAndOrder() {
        System.out.println("Maintaining law and order in the Karnataka state");
    }
    @Override
    public void manageEconomy() {
        System.out.println("Managing the Karnataka state's economy and resources.");
    }
    public void showcaseCulture() {
        System.out.println("Showcasing the rich culture and traditions of Karnataka.");
    }

    public void promoteTourism() {
        System.out.println("Promoting tourism in Karnataka's popular destinations.");
    }

    public void supportAgriculture() {
        System.out.println("Supporting agriculture, especially in the fertile lands of Karnataka.");
    }

    public void celebrateFestivals() {
        System.out.println("Celebrating the famous festivals like Dasara in Karnataka.");
    }

    public void developInfrastructure() {
        System.out.println("Developing infrastructure to boost Karnataka's growth.");
    }
}

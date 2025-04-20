package com.xworkz.inheritancemodule.homeappliances;

public class DishWasher extends HomeAppliance
{
     @Override
    public void doHouseHoldChores()
    {
        System.out.println("Purpose is to do dishes");
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on the DishWasher");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off the DishWasher");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the DishWasher");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the DishWasher");
    }
    @Override
    public void checkEfficiency() {
        System.out.println("Checking the energy efficiency of the DishWasher");
    }
    public void loadDishes() {
        System.out.println("Loading dishes into the dishwasher.");
    }

    public void addDetergent() {
        System.out.println("Adding detergent to the dishwasher.");
    }

    public void startCycle() {
        System.out.println("Starting the dishwasher cleaning cycle.");
    }

    public void checkCleanliness() {
        System.out.println("Checking the cleanliness of the dishes.");
    }

    public void emptyDishWasher() {
        System.out.println("Emptying the dishwasher after the cycle.");
    }
}

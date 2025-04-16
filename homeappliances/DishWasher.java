package com.xworkz.inheritancemodule.homeappliances;

public class DishWasher extends HomeAppliance
{
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

package com.xworkz.inheritancemodule.homeappliances;

public class DishWasherRunner
{
    public  static void main(String args[])
    {
        HomeAppliance appliance = new HomeAppliance();
        HomeAppliance dishwasher = new DishWasher();
        DishWasher myDishwasher = new DishWasher();
        appliance.checkEfficiency();
        appliance.doHouseHoldChores();
        appliance.turnOff();
        appliance.clean();
        appliance.maintain();
        dishwasher.checkEfficiency();
        dishwasher.doHouseHoldChores();
        dishwasher.turnOff();
        dishwasher.clean();
        dishwasher.maintain();
        myDishwasher.loadDishes();
        myDishwasher.emptyDishWasher();
        myDishwasher.addDetergent();
        myDishwasher.startCycle();
        myDishwasher.checkCleanliness();
    }
}

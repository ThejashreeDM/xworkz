package com.xworkz.inheritancemodule.homeappliances;

public class DishWasherRunner
{
    public  static void main(String args[])
    {
        HomeAppliance dishWasher =new DishWasher();
        DishWasher type1=(DishWasher)dishWasher;
        type1.doHouseHoldChores();
    }
}

package com.xworkz.inheritancemodule.pulses;

public class Beans extends Pulses
{
     @Override
    public void eat()
    {
        System.out.println("Beans are rich in  protein");
    }
    @Override
    public void harvest() {
        System.out.println("Harvesting the beans from the field");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the beans to remove impurities");
    }
    @Override
    public void dry() {
        System.out.println("Drying the beans to preserve them");
    }
    @Override
    public void packagePulses() {
        System.out.println("Packaging the beans for distribution");
    }
    @Override
    public void store() {
        System.out.println("Storing the beans in a cool, dry place");
    }

    public void plantBeans() {
        System.out.println("Planting the beans in the soil.");
    }

    public void waterBeans() {
        System.out.println("Watering the beans to ensure healthy growth.");
    }

    public void sortBeans() {
        System.out.println("Sorting the beans based on size and quality.");
    }

    public void cookBeans() {
        System.out.println("Cooking the beans for consumption.");
    }

    public void packageBeans() {
        System.out.println("Packaging the beans for retail sale.");
    }
}

package com.xworkz.inheritancemodule.energy;

public class Heat extends Energy
{
    @Override
    public void providesStrength()
    {
        System.out.println(" Heat Energy provides heat to do variety of tasks");
    }
    @Override
    public void generate() {
        System.out.println("Generating Heat energy.");
    }
    @Override
    public void store() {
        System.out.println("Storing Haet energy.");
    }
    @Override
    public void convert() {
        System.out.println("Converting Heat energy from one form to another.");
    }
    @Override
    public void transfer() {
        System.out.println("Transferring Heat energy.");
    }
    @Override
    public void measure() {
        System.out.println("Measuring Heat energy levels.");
    }

    public void increaseTemperature() {
        System.out.println("Heat increases the temperature of a substance.");
    }

    public void causeExpansion() {
        System.out.println("Heat causes materials to expand.");
    }

    public void enableCooking() {
        System.out.println("Heat is used in cooking food.");
    }

    public void transferByConduction() {
        System.out.println("Heat transfers by conduction.");
    }

    public void affectStateChange() {
        System.out.println("Heat causes change in states of matter.");
    }
}

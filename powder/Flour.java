package com.xworkz.inheritancemodule.powder;

public class Flour extends Powder
{
    @Override
    public void something()
    {
        System.out.println("Functionality of flour depends on type of flour");
    }
    @Override
    public void grind() {
        System.out.println("Grinding the raw material into flour");
    }
    @Override
    public void packagePowder() {
        System.out.println("Packaging the flour in bags or containers");
    }
    @Override
    public void storePowder() {
        System.out.println("Storing the flour in a dry place");
    }
    @Override
    public void testQuality() {
        System.out.println("Testing the quality of the flour");
    }
    @Override
    public void usePowder() {
        System.out.println("Using the flour for its intended purpose.");
    }
    public void siftFlour() {
        System.out.println("Sifting the flour to remove any impurities.");
    }

    public void refineFlour() {
        System.out.println("Refining the flour to improve its texture.");
    }

    public void storeFlour() {
        System.out.println("Storing the flour in an airtight container.");
    }

    public void bakeWithFlour() {
        System.out.println("Baking with flour for cakes, breads, etc.");
    }

    public void fortifyFlour() {
        System.out.println("Fortifying the flour with additional nutrients.");
    }
}

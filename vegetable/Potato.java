package com.xworkz.inheritancemodule.vegetable;

public class Potato extends Veagetable
{
    @Override
    public  void providesEnergy()
    {
        System.out.println("Potato provide us energy");

    }
    @Override
    public void grow() {
        System.out.println("Growing the potato in the soil");
    }
    @Override
    public void harvest() {
        System.out.println("Harvesting the potato when it's ready");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the potato before use");
    }
    @Override
    public void store() {
        System.out.println("Storing the potato properly to preserve freshness.");
    }
    @Override
    public void cook() {
        System.out.println("Cooking the potato for consumption.");
    }
    public void peel() {
        System.out.println("Peeling the potato before cooking.");
    }

    public void mash() {
        System.out.println("Mashing the potato to make mashed potatoes.");
    }

    public void fry() {
        System.out.println("Frying the potato to make fries or chips.");
    }

    public void bake() {
        System.out.println("Baking the potato to make baked potatoes.");
    }

    public void storeInCoolPlace() {
        System.out.println("Storing the potato in a cool, dark place to prevent sprouting.");
    }
}

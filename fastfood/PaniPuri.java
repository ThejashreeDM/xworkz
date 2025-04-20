package com.xworkz.inheritancemodule.fastfood;

public class PaniPuri extends FastFood
{
    @Override
    public void eat()
    {
        System.out.println("PaniPuri are not Healthier");
    }
    @Override
    public void prepare() {
        System.out.println("Preparing PaniPuri");
    }
    @Override
    public void cook() {
        System.out.println("Cooking the PAniPuri");
    }
    @Override
    public void serve() {
        System.out.println("Serving the PaniPuri");
    }
    @Override
    public void pack() {
        System.out.println("Packing the PaniPuri");
    }
    @Override
    public void advertise() {
        System.out.println("Advertising the PAniPuri");
    }

    public void makePurity() {
        System.out.println("Making the crispy puris for panipuri.");
    }

    public void prepareFilling() {
        System.out.println("Preparing the spicy filling for panipuri.");
    }

    public void addTamarindWater() {
        System.out.println("Adding tamarind water to the panipuri.");
    }

    public void serveWithChutney() {
        System.out.println("Serving panipuri with chutney and garnish.");
    }

    public void customizeSpiceLevel() {
        System.out.println("Customizing the spice level for panipuri.");
    }
}

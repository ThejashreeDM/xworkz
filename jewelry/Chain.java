package com.xworkz.inheritancemodule.jewelry;

public class Chain extends Jewelry
{

    @Override
    public void wear()
    {
        System.out.println("Chains are to wear");
    }
    @Override
    public void design() {
        System.out.println("Designing the chain piece.");
    }
    @Override
    public void selectMaterial() {
        System.out.println("Selecting the material for the chain.");
    }
    @Override
    public void craft() {
        System.out.println("Crafting the chain with precision.");
    }
    @Override
    public void polish() {
        System.out.println("Polishing the chain to shine.");
    }
    @Override
    public void display() {
        System.out.println("Displaying the finished chain for sale.");
    }

    public void chooseLinkType() {
        System.out.println("Choosing the type of links for the chain.");
    }

    public void addPendant() {
        System.out.println("Adding a pendant to the chain.");
    }

    public void measureLength() {
        System.out.println("Measuring the appropriate length for the chain.");
    }

    public void customizeChain() {
        System.out.println("Customizing the chain with unique designs.");
    }

    public void packageChain() {
        System.out.println("Packaging the chain for sale.");
    }
}

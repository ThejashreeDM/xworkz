package com.xworkz.inheritancemodule.biscuit;

public class BourBon extends Biscuit
{
@Override
    public void eat()
    {
        System.out.println("BourBon biscuit is a snack");
    }
    @Override
    public void bake() {
        System.out.println("Baking a BourBon biscuit.");
    }
     @Override
    public void pack() {
        System.out.println("Packing the BouurBon biscuit.");
    }
    @Override
    public void addFlavor() {
        System.out.println("Adding flavor to the  Bourbon biscuit.");
    }
     @Override
    public void checkFreshness() {
        System.out.println("Checking Bourbon biscuit freshness.");
    }
     @Override
    public void label() {
        System.out.println("Labeling the Bourbon biscuit pack.");
    }

    public void addChocolateCream() {
        System.out.println("Adding chocolate cream to Bourbon biscuit.");
    }

    public void sandwichLayers() {
        System.out.println("Sandwiching the Bourbon biscuit layers.");
    }

    public void sprinkleSugar() {
        System.out.println("Sprinkling sugar crystals on Bourbon.");
    }

    public void wrapInFoil() {
        System.out.println("Wrapping Bourbon biscuit in foil.");
    }

    public void brandStamp() {
        System.out.println("Stamping the Bourbon brand on the biscuit.");
    }
}

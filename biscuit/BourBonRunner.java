package com.xworkz.inheritancemodule.biscuit;

import com.xworkz.inheritancemodule.bank.Bob;

public class BourBonRunner
{
    public static void main(String[] args) {
        Biscuit biscuit=new Biscuit();
        Biscuit type=new BourBon();
        BourBon dark=new BourBon();
        biscuit.eat();
        biscuit.addFlavor();
        biscuit.bake();
        biscuit.checkFreshness();
        biscuit.pack();
        type.checkFreshness();
        type.pack();
        type.bake();
        type.addFlavor();
        type.eat();
        type.label();
        dark.addChocolateCream();
        dark.sandwichLayers();
        dark.brandStamp();
        dark.sprinkleSugar();
        dark.wrapInFoil();
    }
}

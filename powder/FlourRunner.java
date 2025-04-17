package com.xworkz.inheritancemodule.powder;

public class FlourRunner
{
    public static void main(String[] args) {
        Powder powder = new Powder();
        Powder flourPowder = new Flour();
        Flour flour = new Flour();
        powder.something();
        powder.grind();
        powder.packagePowder();
        powder.storePowder();
        powder.testQuality();
        powder.usePowder();
        flourPowder.something();
        flourPowder.grind();
        flourPowder.packagePowder();
        flourPowder.storePowder();
        flourPowder.testQuality();
        flourPowder.usePowder();
        flour.siftFlour();
        flour.refineFlour();
        flour.storeFlour();
        flour.bakeWithFlour();
        flour.fortifyFlour();
    }
}

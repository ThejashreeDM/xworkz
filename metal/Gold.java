package com.xworkz.inheritancemodule.metal;

public class Gold extends Metal
{
    @Override
    public void ornaments()
    {
        System.out.println("Metals are used to make ornaments");
    }
    @Override
    public void mine() {
        System.out.println("Mining the metal from the earth.");
    }
    @Override
    public void refine() {
        System.out.println("Refining the metal to remove impurities.");
    }
    @Override
    public void melt() {
        System.out.println("Melting the metal for shaping.");
    }
    @Override
    public void alloy() {
        System.out.println("Alloying the metal with other substances.");
    }
    @Override
    public void shape() {
        System.out.println("Shaping the metal into the desired form.");
    }

    public void extractGold() {
        System.out.println("Extracting gold from ores.");
    }

    public void purifyGold() {
        System.out.println("Purifying the gold to high standards.");
    }

    public void castGold() {
        System.out.println("Casting the gold into bars or jewelry.");
    }

    public void polishGold() {
        System.out.println("Polishing the gold to a brilliant shine.");
    }

    public void determinePurity() {
        System.out.println("Determining the purity of gold using tests.");
    }
}

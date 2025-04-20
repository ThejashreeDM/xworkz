package com.xworkz.inheritancemodule.gold;

public class Ring extends Gold
{
    @Override
    public void makeJewelry()
    {
        System.out.println("The purpose of gold ring is to make jewelry");
    }
    @Override
    public void mine() {
        System.out.println("Mining the gold ring from the earth.");
    }
    @Override
    public void refine() {
        System.out.println("Refining the gold ring to remove impurities.");
    }
    @Override
    public void melt() {
        System.out.println("Melting the gold ring into liquid form.");
    }
    @Override
    public void alloy() {
        System.out.println("Alloying the gold ring with other metals.");
    }
    @Override
    public void store() {
        System.out.println("Storing the gold ring safely.");
    }
    public void shapeRing() {
        System.out.println("Shaping the gold into a ring.");
    }

    public void engrave() {
        System.out.println("Engraving a design on the ring.");
    }

    public void polishRing() {
        System.out.println("Polishing the ring to a shiny finish.");
    }

    public void setStone() {
        System.out.println("Setting a gemstone on the ring.");
    }

    public void sellRing() {
        System.out.println("Selling the gold ring to a customer.");
    }

}

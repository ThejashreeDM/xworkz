package com.xworkz.inheritancemodule.stone;

public class Granite extends Stone
{
     @Override
    public void makeSculpture()
    {
        System.out.println("Granite are used to make Sculptures");
    }
    @Override
    public void mine() {
        System.out.println("Mining the Granite from quarries");
    }
    @Override
    public void cut() {
        System.out.println("Cutting the Granite into desired shapes");
    }
    @Override
    public void polish() {
        System.out.println("Polishing the Granite to enhance its appearance");
    }


    @Override
    public void store() {
        System.out.println("Storing the Granite in a safe place to avoid damage");
    }

    @Override
    public void transport() {
        System.out.println("Transporting the Granite to the processing location");
    }

    public void checkDurability() {
        System.out.println("Checking the durability and strength of the granite");
    }

    public void useInConstruction() {
        System.out.println("Using granite in construction for countertops, flooring, etc");
    }

    public void polishGranite() {
        System.out.println("Polishing granite to achieve a smooth, shiny finish");
    }

    public void colorVariants() {
        System.out.println("Exploring different color variants of granite for use");
    }

    public void cutGranite() {
        System.out.println("Cutting granite into slabs or tiles for use");
    }
}

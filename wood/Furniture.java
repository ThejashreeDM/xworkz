package com.xworkz.inheritancemodule.wood;

public class Furniture extends Wood
{
    @Override
    public void makeFurniture()
    {
        System.out.println("Funiture is made by wood");
    }
    @Override
    public void cutWood() {
        System.out.println("Cutting wood into required shapes for making furniture.");
    }
    @Override
    public void treatWood() {
        System.out.println("Treating furniture to prevent pests and decay");
    }
    @Override
    public void shapeWood() {
        System.out.println("Shaping the furniture to different designs");
    }
    @Override
    public void finishWood() {
        System.out.println("Applying finishing treatments to the furniture");
    }
    @Override
    public void storeWood() {
        System.out.println("Storing furniture in a dry place to prevent damage");
    }
    public void assemble() {
        System.out.println("Assembling the furniture pieces");
    }

    public void polish() {
        System.out.println("Polishing the furniture to give it a smooth finish");
    }

    public void move() {
        System.out.println("Moving the furniture to a new location");
    }

    public void clean() {
        System.out.println("Cleaning the furniture to maintain its appearance");
    }

    public void maintain() {
        System.out.println("Maintaining the furniture by checking for wear and tear");
    }
}

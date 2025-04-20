package com.xworkz.inheritancemodule.glass;

public class Diamond extends Glass
{
    @Override
    public void something()
    {
        System.out.println("Diamond is transparent");
    }
    @Override
    public void mold() {
        System.out.println("Molding the Diaamond into shape.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the Diamond.");
    }
    @Override
    public void cut() {
        System.out.println("Cutting the Diamond into desired pieces.");
    }
    @Override
    public void polish() {
        System.out.println("Polishing the Diamond to make it shiny.");
    }
    @Override
    public void packageGlass() {
        System.out.println("Packaging the Diamond for delivery.");
    }
    public void mine() {
        System.out.println("Mining the diamond from the earth.");
    }

    public void cutFacets() {
        System.out.println("Cutting the diamond into facets.");
    }

    public void polishDiamond() {
        System.out.println("Polishing the diamond to perfection.");
    }

    public void setInJewelry() {
        System.out.println("Setting the diamond in a piece of jewelry.");
    }

    public void value() {
        System.out.println("Determining the value of the diamond.");
    }
}

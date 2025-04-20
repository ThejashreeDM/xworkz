package com.xworkz.inheritancemodule.furniture;

public class Sofa extends Furniture
{
 @Override
    public void homeDecoration()
    {
        System.out.println("Purpose of sofa is to decorate home");
    }
    @Override
    public void assemble() {
        System.out.println("Assembling the sofa.");
    }
    @Override
    public void polish() {
        System.out.println("Polishing the sofa.");
    }

    @Override
    public void place() {
        System.out.println("Placing the sofa in the room.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the sofa.");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the sofa regularly.");
    }
    public void adjustCushions() {
        System.out.println("Adjusting the cushions of the sofa.");
    }

    public void recline() {
        System.out.println("Reclining the sofa.");
    }

    public void addThrowPillows() {
        System.out.println("Adding throw pillows to the sofa.");
    }

    public void chooseFabric() {
        System.out.println("Choosing fabric for the sofa.");
    }

    public void cleanStains() {
        System.out.println("Cleaning stains from the sofa.");
    }
}

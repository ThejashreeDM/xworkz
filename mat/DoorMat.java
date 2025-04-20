package com.xworkz.inheritancemodule.mat;

public class DoorMat extends Mat{
    @Override
    public void providesComfort()
    {
        System.out.println("Door Mats makes surfaces more comfort");
    }
    @Override
    public void weave() {
        System.out.println("Weaving the door mat using various materials.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the door mat to keep it fresh.");
    }
    @Override
    public void roll() {
        System.out.println("Rolling the door mat for easy storage.");
    }
    @Override
    public void place() {
        System.out.println("Placing the  door mat on the floor.");
    }
    @Override
    public void store() {
        System.out.println("Storing the door mat when not in use.");
    }


    public void design() {
        System.out.println("Designing the door mat with various patterns.");
    }

    public void addAntiSlip() {
        System.out.println("Adding an anti-slip layer to the door mat.");
    }

    public void personalize() {
        System.out.println("Personalizing the door mat with a welcome message.");
    }

    public void placeAtDoor() {
        System.out.println("Placing the door mat in front of the door.");
    }

    public void wash() {
        System.out.println("Washing the door mat to remove dirt.");
    }

}

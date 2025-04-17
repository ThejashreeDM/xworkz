package com.xworkz.inheritancemodule.vehicle;

public class Bus extends Vehicle
{
    public void pickUpPassengers() {
        System.out.println("Picking up passengers from the bus stop.");
    }

    public void dropOffPassengers() {
        System.out.println("Dropping off passengers at their destination.");
    }

    public void openDoors() {
        System.out.println("Opening the bus doors for passengers to board.");
    }

    public void checkCapacity() {
        System.out.println("Checking the bus capacity to ensure it is not overcrowded.");
    }

    public void announceStop() {
        System.out.println("Announcing the next bus stop to passengers.");
    }
}

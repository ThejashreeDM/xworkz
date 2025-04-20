package com.xworkz.inheritancemodule.vehicle;

public class Bus extends Vehicle
{
    @Override
    public void transport()
    {
        System.out.println("Bus are used for transport purpose");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting the Bus's engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the Bus's engine");
    }
    @Override
    public void refuel() {
        System.out.println("Refueling the Bus");
    }
    @Override
    public void drive() {
        System.out.println("Driving the Bus to the destination.");
    }
@Override
    public void park() {
        System.out.println("Parking the bus safely.");
    }
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

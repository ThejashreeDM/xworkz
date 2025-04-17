package com.xworkz.inheritancemodule.vehicle;

public class BusRunner
{
    public static void main(String args[])
    {
        Vehicle vehicle = new Vehicle();
        Vehicle busAsVehicle = new Bus();
        Bus bus = new Bus();
        vehicle.transport();
        vehicle.startEngine();
        vehicle.stopEngine();
        vehicle.refuel();
        vehicle.drive();
        vehicle.park();
        busAsVehicle.transport();
        busAsVehicle.startEngine();
        busAsVehicle.stopEngine();
        busAsVehicle.refuel();
        busAsVehicle.drive();
        busAsVehicle.park();
        bus.pickUpPassengers();
        bus.dropOffPassengers();
        bus.openDoors();
        bus.checkCapacity();
        bus.announceStop();
    }
}

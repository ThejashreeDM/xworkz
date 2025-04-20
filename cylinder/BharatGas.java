package com.xworkz.inheritancemodule.cylinder;

public class BharatGas extends Cylinder
{

    @Override
    public void providesFuel()
    {
        System.out.println("It provides fuel");
    }
    @Override
    public void fillGas() {
        System.out.println("Filling gas in the cylinder.");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the Bharat Gas.");
    }

    @Override
    public void transport() {
        System.out.println("Transporting the Bharat Gas.");
    }

    @Override
    public void checkLeakage() {
        System.out.println("Checking for gas leakage in the Bharat Gas.");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing the Bharat Gas before delivery.");
    }

    public void deliverToHome() {
        System.out.println("Delivering Bharat Gas cylinder to customer’s home.");
    }

    public void connectToStove() {
        System.out.println("Connecting Bharat Gas cylinder to the stove.");
    }

    public void registerRefill() {
        System.out.println("Registering for a Bharat Gas refill.");
    }

    public void offerSubsidy() {
        System.out.println("Offering subsidy for Bharat Gas refill.");
    }

    public void maintainRecords() {
        System.out.println("Maintaining customer records at Bharat Gas.");
    }
}

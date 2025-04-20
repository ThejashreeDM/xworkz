package com.xworkz.inheritancemodule.bag;

public class CollegeBag extends Bag
{
    @Override
    public void carryThings()
    {
        System.out.println("The purpose of  the college bag is to carry books and laptops");
    }
    @Override
    public void open() {
        System.out.println("Opening the college bag.");
    }

    @Override
    public void close() {
        System.out.println("Closing the college bag.");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the college bag.");
    }

    @Override
    public void empty() {
        System.out.println("Emptying the colege bag.");
    }
     @Override
    public void checkWeight() {
        System.out.println("Checking the bag's weight.");
    }

    public void keepLaptop() {
        System.out.println("Keeping the laptop in the college bag.");
    }

    public void takeBooks() {
        System.out.println("Taking books out of the college bag.");
    }

    public void zipUp() {
        System.out.println("Zipping up the college bag.");
    }

    public void attachIDCard() {
        System.out.println("Attaching the ID card to the college bag.");
    }

    public void putWaterBottle() {
        System.out.println("Putting the water bottle in the side pocket.");
    }
}

package com.xworkz.inheritancemodule.stationary;

public class Pensil extends Stationary
{
   @Override
    public void write()
    {
        System.out.println("Pensil helps to write");
    }
    @Override
    public void organize() {
        System.out.println("Organizing the Pencils ");
    }
    @Override
    public void store() {
        System.out.println("Storing the pencils in a safe place");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the condition of the pencil");
    }
    @Override
    public void purchase() {
        System.out.println("Purchasing new pencil items");
    }
    @Override
    public void dispose() {
        System.out.println("Disposing of old or used pensil");
    }
    public void sharpen() {
        System.out.println("Sharpening the pencil to use it.");
    }

    public void writee() {
        System.out.println("Writing with the pencil.");
    }

    public void erase() {
        System.out.println("Erasing the pencil markings.");
    }

    public void refill() {
        System.out.println("Refilling the pencil with a new lead.");
    }

    public void checkQuality() {
        System.out.println("Checking the quality of the pencil lead.");
    }

}

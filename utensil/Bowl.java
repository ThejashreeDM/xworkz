package com.xworkz.inheritancemodule.utensil;

public class Bowl extends Utensil
{
    @Override
    public void store()
    {
        System.out.println("purpose of bowl is to store something");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the bowl before use");
    }
    @Override
    public void serve() {
        System.out.println("Serving food using the bowl");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the bowl to avoid wear and tear.");
    }
    @Override
    public void dispose() {
        System.out.println("Disposing of the bowl if it is no longer usable.");
    }
    public void holdFood() {
        System.out.println("Holding food in the bowl.");
    }

    public void serveSoup() {
        System.out.println("Serving soup or liquid dishes in the bowl.");
    }

    public void stack() {
        System.out.println("Stacking the bowl with other similar utensils.");
    }

    public void microwaveSafe() {
        System.out.println("Checking if the bowl is microwave safe.");
    }

    public void decorate() {
        System.out.println("Decorating the bowl for special occasions.");
    }
}

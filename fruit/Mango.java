package com.xworkz.inheritancemodule.fruit;

public class Mango extends Fruit
{
     @Override
    public void eat()
    {
        System.out.println("Mango are to eat");
    }
    @Override
    public void grow() {
        System.out.println("The Mango is growing on the tree.");
    }

    @Override
    public void ripen() {
        System.out.println("The Mango is ripening.");
    }
    @Override
    public void harvest() {
        System.out.println("Mango is being harvested.");
    }
    @Override
    public void pack() {
        System.out.println("The Mango is packed for sale.");
    }
    @Override
    public void sell() {
        System.out.println("The Mango is sold at the market.");
    }


    public void taste() {
        System.out.println("Mango is sweet and tangy.");
    }

    public void peel() {
        System.out.println("Peeling the mango.");
    }

    public void makeSmoothie() {
        System.out.println("Making a mango smoothie.");
    }

    public void makePickle() {
        System.out.println("Making mango pickle.");
    }

    public void serveWithStickyRice() {
        System.out.println("Serving mango with sticky rice.");
    }
}

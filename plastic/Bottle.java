package com.xworkz.inheritancemodule.plastic;

public class Bottle extends Plastic
{
    @Override
    public void makeThings()
    {
        System.out.println("Plastic Bottle is used to make different things for decoration purpose");
    }
    @Override
    public void manufacture() {
        System.out.println("Manufacturing plastic bottle from raw materials.");
    }
    @Override
    public void mold() {
        System.out.println("Molding the plastic bottle into shapes.");
    }
    @Override
    public void recycle() {
        System.out.println("Recycling plastic bottle to reduce waste.");
    }
    @Override
    public void store() {
        System.out.println("Storing the plastic bottle ");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing of plastic bottle responsibly.");
    }
    public void designBottle() {
        System.out.println("Designing the bottle shape and size.");
    }

    public void produceBottle() {
        System.out.println("Producing the bottle using plastic molding.");
    }

    public void fillBottle() {
        System.out.println("Filling the bottle with liquid or content.");
    }

    public void labelBottle() {
        System.out.println("Labeling the bottle with brand or information.");
    }

    public void sealBottle() {
        System.out.println("Sealing the bottle for packaging.");
    }
}

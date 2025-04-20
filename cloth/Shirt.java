package com.xworkz.inheritancemodule.cloth;

public class Shirt extends Cloth
{
    @Override
    public void wear()
    {
        System.out.println("Shirts are used to wear");
    }
    @Override
    public void weave() {
        System.out.println("Weaving the Shirt.");
    }
     @Override
    public void dye() {
        System.out.println("Dyeing the Shirt.");
    }
     @Override
    public void dry() {
        System.out.println("Drying the Shirt.");
    }
    @Override
    public void iron() {
        System.out.println("Ironing the Shirt.");
    }
     @Override
    public void fold() {
        System.out.println("Folding the Shirt.");
    }

    public void stitchSleeves() {
        System.out.println("Stitching sleeves for the shirt.");
    }

    public void addButtons() {
        System.out.println("Adding buttons to the shirt.");
    }

    public void attachCollar() {
        System.out.println("Attaching collar to the shirt.");
    }

    public void checkSize() {
        System.out.println("Checking the size of the shirt.");
    }

    public void brandTag() {
        System.out.println("Adding brand tag to the shirt.");
    }
}

package com.xworkz.inheritancemodule.hairaccessories;

public class HairPin extends HairAccessory
{
    @Override
    public void hairStyling()
    {
        System.out.println("HairPin helps to do HairStyle");
    }
    @Override
    public void selectStyle() {
        System.out.println("Selecting the style of HairPin");
    }
    @Override
    public void chooseColor() {
        System.out.println("Choosing the color of the hairpin");
    }
    @Override
    public void matchOutfit() {
        System.out.println("Matching the hairpin with the outfit.");
    }
    @Override
    public void pack() {
        System.out.println("Packing the hairpin for sale.");
    }
    @Override
    public void promote() {
        System.out.println("Promoting the hairpin in the market.");
    }

    public void designPin() {
        System.out.println("Designing a unique hair pin.");
    }

    public void attachToHair() {
        System.out.println("Attaching the hair pin to the hair.");
    }

    public void adjustPin() {
        System.out.println("Adjusting the hair pin for a secure fit.");
    }

    public void decoratePin() {
        System.out.println("Decorating the hair pin with beads or gems.");
    }

    public void removePin() {
        System.out.println("Removing the hair pin from the hair.");
    }
}

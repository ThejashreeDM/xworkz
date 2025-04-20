package com.xworkz.inheritancemodule.doll;

public class Barbie extends Doll
{
     @Override
    public void play()
    {
        System.out.println("Barbie is to Play");
    }
    @Override
    public void makeDoll() {
        System.out.println("Making a basic barbie.");
    }
    @Override
    public void paintFace() {
        System.out.println("Painting the barbie's face.");
    }
    @Override
    public void sewClothes() {
        System.out.println("Sewing clothes for the barbie.");
    }
    @Override
    public void packDoll() {
        System.out.println("Packing the barbie for delivery.");
    }
    @Override
    public void displayDoll() {
        System.out.println("Displaying the barbie on the shelf.");
    }
    public void styleHair() {
        System.out.println("Styling Barbie's hair.");
    }

    public void addAccessories() {
        System.out.println("Adding accessories to Barbie.");
    }

    public void changeOutfits() {
        System.out.println("Changing Barbie's outfits.");
    }

    public void poseBarbie() {
        System.out.println("Posing Barbie for display.");
    }

    public void createBarbieStory() {
        System.out.println("Creating a story for Barbie.");
    }
}

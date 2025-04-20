package com.xworkz.inheritancemodule.doll;

public class BarbieRunner
{
    public static void main(String[] args) {
        Doll doll = new Doll();
        Doll barbieDoll = new Barbie();
        Barbie barbie = new Barbie();


        doll.play();
        doll.displayDoll();
        doll.makeDoll();
        doll.packDoll();
        doll.paintFace();
        barbieDoll.play();
        barbieDoll.displayDoll();
        barbieDoll.makeDoll();
        barbieDoll.packDoll();
        barbieDoll.paintFace();
        barbie.play();
        barbie.displayDoll();
        barbie.paintFace();
        barbie.makeDoll();
        barbie.packDoll();
        barbie.changeOutfits();
        barbie.addAccessories();
        barbie.createBarbieStory();
        barbie.poseBarbie();
        barbie.styleHair();
    }
}

package com.xworkz.inheritancemodule.festival;

public class Deepavali extends Festival
{

     @Override
    public  void celebrate()
    {
        System.out.println("Depavali is Celebrated");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating for the Deepavali.");
    }

    @Override
    public void inviteFamily() {
        System.out.println("Inviting family and friends to the Depavali.");
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing food for the Depavali.");
    }
    @Override
    public void exchangeGifts() {
        System.out.println("Exchanging gifts during the Depavali.");
    }

    public void lightDiyas() {
        System.out.println("Lighting diyas for Deepavali.");
    }

    public void burstCrackers() {
        System.out.println("Bursting crackers during Deepavali.");
    }

    public void worshipGoddessLakshmi() {
        System.out.println("Worshipping Goddess Lakshmi on Deepavali.");
    }

    public void wearNewClothes() {
        System.out.println("Wearing new clothes for Deepavali.");
    }

    public void decorateWithRangoli() {
        System.out.println("Decorating the house with Rangoli for Deepavali.");
    }
}

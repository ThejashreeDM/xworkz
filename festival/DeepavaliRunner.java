package com.xworkz.inheritancemodule.festival;

public class DeepavaliRunner
{
    public static void main(String[] args) {
        Festival festival = new Festival();
        Festival deepavaliFestival = new Deepavali();
        Deepavali deepavali = new Deepavali();
        festival.celebrate();
        festival.inviteFamily();
        festival.decorate();
        festival.exchangeGifts();
        festival.prepareFood();
        deepavaliFestival.celebrate();
        deepavaliFestival.inviteFamily();
        deepavaliFestival.decorate();
        deepavaliFestival.exchangeGifts();
        deepavaliFestival.prepareFood();
        deepavali.celebrate();
        deepavali.inviteFamily();
        deepavali.decorate();
        deepavali.exchangeGifts();
        deepavali.prepareFood();
        deepavali.decorateWithRangoli();
        deepavali.burstCrackers();
        deepavali.lightDiyas();
        deepavali.wearNewClothes();
        deepavali.worshipGoddessLakshmi();
    }
}

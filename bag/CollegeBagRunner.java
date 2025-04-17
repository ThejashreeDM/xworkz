package com.xworkz.inheritancemodule.bag;

public class CollegeBagRunner
{
    public static void main(String[] args) {
       Bag bag=new Bag();
       Bag collegeBag=new CollegeBag();
       CollegeBag skyBag=new CollegeBag();
        bag.carryThings();
        bag.carry();
        bag.close();
        bag.open();
        bag.empty();
        collegeBag.carryThings();
        collegeBag.empty();
        collegeBag.open();
        collegeBag.close();
        collegeBag.carry();
        skyBag.attachIDCard();
        skyBag.keepLaptop();
        skyBag.putWaterBottle();
        skyBag.zipUp();
        skyBag.checkWeight();
    }
}

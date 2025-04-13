package com.xworkz.inheritancemodule.bag;

public class CollegeBagRunner
{
    public static void main(String[] args) {
       Bag bag=new CollegeBag();
       CollegeBag collegeBag=(CollegeBag)bag;
        bag.carryThings();
    }
}

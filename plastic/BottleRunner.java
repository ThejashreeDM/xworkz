package com.xworkz.inheritancemodule.plastic;

public class BottleRunner {
    public static void main(String[] args) {
        Plastic bottle=new Bottle();
        Bottle cello=(Bottle)bottle;
        cello.makeThings();
    }
}

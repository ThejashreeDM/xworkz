package com.xworkz.inheritancemodule.plastic;

public class BottleRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        Plastic plasticBottle = new Bottle();
        Bottle bottle = new Bottle();
        plastic.makeThings();
        plastic.manufacture();
        plastic.mold();
        plastic.recycle();
        plastic.store();
        plastic.dispose();
        plasticBottle.makeThings();
        plasticBottle.manufacture();
        plasticBottle.mold();
        plasticBottle.recycle();
        plasticBottle.store();
        plasticBottle.dispose();
        bottle.designBottle();
        bottle.produceBottle();
        bottle.fillBottle();
        bottle.labelBottle();
        bottle.sealBottle();
    }
}

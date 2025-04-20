package com.xworkz.inheritancemodule.gold;

public class RingRunner
{
    public static void main(String args[])
    {
        Gold gold = new Gold();
        Gold goldenRing = new Ring();
        Ring ring = new Ring();
        gold.melt();
        gold.alloy();
        gold.makeJewelry();
        gold.mine();
        gold.store();
        goldenRing.melt();
        goldenRing.alloy();
        goldenRing.makeJewelry();
        goldenRing.mine();
        goldenRing.store();
        ring.melt();
        ring.alloy();
        ring.makeJewelry();
        ring.mine();
        ring.store();
        ring.setStone();
        ring.engrave();
        ring.sellRing();
        ring.shapeRing();
        ring.polishRing();
    }
}

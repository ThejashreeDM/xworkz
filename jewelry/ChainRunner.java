package com.xworkz.inheritancemodule.jewelry;

public class ChainRunner
{
    public static void main(String args[])
    {
        Jewelry jewelry = new Jewelry();
        Jewelry chainJewelry = new Chain();
        Chain chain = new Chain();
        jewelry.craft();
        jewelry.selectMaterial();
        jewelry.wear();
        jewelry.design();
        jewelry.display();
        chainJewelry.craft();
        chainJewelry.selectMaterial();
        chainJewelry.wear();
        chainJewelry.design();
        chainJewelry.display();
        chain.craft();
        chain.selectMaterial();
        chain.wear();
        chain.design();
        chain.display();
        chain.chooseLinkType();
        chain.addPendant();
        chain.customizeChain();
        chain.measureLength();
        chain.chooseLinkType();

    }
}

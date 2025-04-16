package com.xworkz.inheritancemodule.stone;

public class GraniteRunner
{
    public static void main(String args[])
    {
        Stone stone = new Stone();
        Stone graniteAsStone = new Granite();
        Granite granite = new Granite();
        stone.makeSculpture();
        stone.mine();
        stone.cut();
        stone.polish();
        stone.store();
        stone.transport();
        graniteAsStone.makeSculpture();
        graniteAsStone.mine();
        graniteAsStone.cut();
        graniteAsStone.polish();
        graniteAsStone.store();
        graniteAsStone.transport();
        granite.checkDurability();
        granite.useInConstruction();
        granite.polishGranite();
        granite.colorVariants();
        granite.cutGranite();

    }
}

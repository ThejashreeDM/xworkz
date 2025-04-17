package com.xworkz.inheritancemodule.metal;

public class GoldRunner
{
    public static void main(String args[])
    {
        Metal metal = new Metal();
        Metal goldMetal = new Gold();
        Gold gold = new Gold();
        metal.alloy();
        metal.shape();
        metal.ornaments();
        metal.melt();
        metal.mine();
        goldMetal.alloy();
        goldMetal.shape();
        goldMetal.ornaments();
        goldMetal.melt();
        goldMetal.mine();
        gold.purifyGold();
        gold.castGold();
        gold.extractGold();
        gold.determinePurity();
        gold.polishGold();
    }
}

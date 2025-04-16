package com.xworkz.inheritancemodule.glass;

public class DiamondRunner
{
    public static void main(String[] args) {
        Glass glass = new Glass();
        Glass shiningGlass = new Diamond();
        Diamond diamond = new Diamond();
        glass.cut();
        glass.clean();
        glass.mold();
        glass.packageGlass();
        glass.polish();
        shiningGlass.cut();
        shiningGlass.clean();
        shiningGlass.mold();
        shiningGlass.packageGlass();
        shiningGlass.polish();
        diamond.cut();
        diamond.cutFacets();
        diamond.polishDiamond();
        diamond.value();
        diamond.mine();
    }
}

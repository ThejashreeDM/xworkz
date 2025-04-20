package com.xworkz.inheritancemodule.furniture;

public class SofaRunner
{
    public static void main(String args[])
    {
        Furniture furniture = new Furniture();
        Furniture seating = new Sofa();
        Sofa sofa = new Sofa();
        furniture.assemble();
        furniture.maintain();
        furniture.polish();
        furniture.clean();
        furniture.place();
        seating.assemble();
        seating.maintain();
        seating.polish();
        seating.clean();
        seating.place();
        sofa.assemble();
        sofa.maintain();
        sofa.polish();
        sofa.clean();
        sofa.place();
        sofa.adjustCushions();
        sofa.addThrowPillows();
        sofa.chooseFabric();
        sofa.cleanStains();
        sofa.recline();
    }
}

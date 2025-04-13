package com.xworkz.inheritancemodule.wood;

public class FurnitureRunner
{
    public static void main(String args[])
    {
        Wood furniture=new Furniture();
        Furniture sofa=(Furniture)furniture;
        sofa.makeFurniture();
    }
}

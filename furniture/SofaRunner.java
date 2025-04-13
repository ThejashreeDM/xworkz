package com.xworkz.inheritancemodule.furniture;

public class SofaRunner
{
    public static void main(String args[])
    {
        Furniture furniture=new Sofa();
        Sofa type1=(Sofa)furniture;
        type1.homeDecoration();
    }
}

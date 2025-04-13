package com.xworkz.inheritancemodule.vegetable;

public class PotatoRunner
{
    public static void main(String args[])
    {
        Veagetable potato=new Potato();
        Potato type1=(Potato)potato;
        type1.providesEnergy();

    }
}

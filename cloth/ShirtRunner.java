package com.xworkz.inheritancemodule.cloth;

public class ShirtRunner
{
    public static void main(String args[])
    {
        Cloth shirt=new Cloth();
        Cloth type=new Shirt();
        Shirt raymond=new Shirt();
        shirt.dry();
        shirt.dye();
        shirt.fold();
        shirt.iron();
        type.wear();
        type.dry();
        type.dye();
        type.fold();
        type.iron();
        type.wear();
        raymond.addButtons();
        raymond.attachCollar();
        raymond.brandTag();
        raymond.checkSize();
        raymond.stitchSleeves();
    }
}

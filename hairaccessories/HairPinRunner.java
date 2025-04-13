package com.xworkz.inheritancemodule.hairaccessories;

public class HairPinRunner
{
    public static void main(String args[])
    {
        HairAccessory hairPin=new HairPin();
        HairPin sujatha=(HairPin)hairPin;
        sujatha.hairStyling();
    }
}

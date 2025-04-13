package com.xworkz.inheritancemodule.gold;

public class RingRunner
{
    public static void main(String args[])
    {
        Gold gold=new Ring();
        Ring name=(Ring)gold;
        name.makeJewelry();
    }
}

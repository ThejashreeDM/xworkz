package com.xworkz.inheritancemodule.metal;

public class GoldRunner
{
    public static void main(String args[])
    {
        Metal gold=new Gold();
        Gold type1=(Gold)gold;
        type1.ornaments();
    }
}

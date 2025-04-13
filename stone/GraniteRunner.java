package com.xworkz.inheritancemodule.stone;

public class GraniteRunner
{
    public static void main(String args[])
    {
        Stone type1=new Granite();
        Granite type=(Granite)type1;
        type.makeSculpture();

    }
}

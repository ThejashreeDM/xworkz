package com.xworkz.inheritancemodule.cloth;

public class ShirtRunner
{
    public static void main(String args[])
    {
        Cloth shirt=new Shirt();
        Shirt raymond=(Shirt)shirt;
        raymond.wear();
    }
}

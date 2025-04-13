package com.xworkz.inheritancemodule.gadget;

public class MobileRunner
{
    public static void main(String args[])
    {
        Gadget gadget=new Mobile();
        Mobile samsung=(Mobile)gadget;
        samsung.entertainment();
    }
}

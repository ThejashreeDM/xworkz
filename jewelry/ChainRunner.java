package com.xworkz.inheritancemodule.jewelry;

public class ChainRunner
{
    public static void main(String args[])
    {
        Jewelry jewelry=new Chain();
        Chain chain=(Chain)jewelry;
        chain.wear();
    }
}

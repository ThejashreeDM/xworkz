package com.xworkz.inheritancemodule.shop;

public class TeaShopRunner
{
    public static void main(String args[])
    {
        Shop type=new TeaShop();
        TeaShop name=(TeaShop)type;
        name.trading();
    }
}

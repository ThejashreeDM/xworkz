package com.xworkz.inheritancemodule.biscuit;

import com.xworkz.inheritancemodule.bank.Bob;

public class BourBonRunner
{
    public static void main(String[] args) {
        Biscuit biscuit=new BourBon();
        BourBon type=(BourBon)biscuit;
        biscuit.eat();
    }
}

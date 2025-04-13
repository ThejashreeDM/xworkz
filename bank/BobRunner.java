package com.xworkz.inheritancemodule.bank;

public class BobRunner
{
    public static void main(String[] args) {
        Bank bank=new Bob();
        Bob bob=(Bob)bank;
        bob.toProvideFinancialService();
    }
}

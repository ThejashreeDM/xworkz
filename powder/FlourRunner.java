package com.xworkz.inheritancemodule.powder;

public class FlourRunner
{
    public static void main(String[] args) {
        Powder flour=new Flour();
        Flour wheatFlour=(Flour)flour;
        wheatFlour.something();
    }
}

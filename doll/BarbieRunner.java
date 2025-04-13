package com.xworkz.inheritancemodule.doll;

public class BarbieRunner
{
    public static void main(String[] args) {
        Doll doll=new Barbie();
        Barbie barbie=(Barbie)doll;
        barbie.play();
    }
}

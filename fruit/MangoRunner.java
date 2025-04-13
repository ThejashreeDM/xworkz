package com.xworkz.inheritancemodule.fruit;

public class MangoRunner
{
    public static void main(String args[])
    {
        Fruit fruit=new Mango();
        Mango type1=(Mango)fruit;
        type1.eat();
    }
}

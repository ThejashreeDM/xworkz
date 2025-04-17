package com.xworkz.inheritancemodule.fruit;

public class MangoRunner
{
    public static void main(String args[])
    {

        Fruit fruit = new Fruit();
        Fruit sweetFruit = new Mango();
        Mango mango = new Mango();
        fruit.grow();
        fruit.harvest();
        fruit.pack();
        fruit.sell();
        fruit.eat();
        sweetFruit.grow();
        sweetFruit.harvest();
        sweetFruit.pack();
        sweetFruit.sell();
        sweetFruit.eat();
        mango.makePickle();
        mango.peel();
        mango.makeSmoothie();
        mango.serveWithStickyRice();
        mango.taste();
    }
}

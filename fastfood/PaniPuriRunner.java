package com.xworkz.inheritancemodule.fastfood;

public class PaniPuriRunner
{
    public static void main(String[] args) {
        FastFood food = new FastFood();
        FastFood streetFood = new PaniPuri();
        PaniPuri panipuri = new PaniPuri();
        food.advertise();
        food.cook();
        food.serve();
        food.pack();
        food.eat();
        streetFood.advertise();
        streetFood.cook();
        streetFood.serve();
        streetFood.pack();
        streetFood.eat();
        panipuri.addTamarindWater();
        panipuri.customizeSpiceLevel();
        panipuri.makePurity();
        panipuri.serveWithChutney();
        panipuri.prepareFilling();

    }
}

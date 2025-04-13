package com.xworkz.inheritancemodule.energy;

public class HaetRunner {
    public static void main(String[] args) {
        Energy energy=new Heat();
        Heat heat=(Heat)energy;
        heat.providesStrength();
    }
}

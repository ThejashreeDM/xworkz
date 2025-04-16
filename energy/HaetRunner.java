package com.xworkz.inheritancemodule.energy;

public class HaetRunner {
    public static void main(String[] args) {
        Energy energy = new Energy();
        Energy heatEnergy = new Heat();
        Heat heat = new Heat();
         energy.convert();
        energy.transfer();
        energy.providesStrength();
        energy.measure();
        energy.generate();
        heatEnergy.convert();
        heatEnergy.transfer();
        heatEnergy.providesStrength();
        heatEnergy.measure();
        heatEnergy.generate();
        heat.transferByConduction();
        heat.affectStateChange();
        heat.causeExpansion();
        heat.transferByConduction();
        heat.enableCooking();
    }
}

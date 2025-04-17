package com.xworkz.inheritancemodule.mettall;

public class WireRunner
{
    public static void main(String[] args) {
        Mettall metal = new Mettall();
        Mettall  wireMetal = new Wire();
        Wire wire = new Wire();
        metal.alloy();
        metal.melt();
        metal.makeThings();
        metal.refine();
        metal.cast();
        wireMetal.alloy();
        wireMetal.melt();
        wireMetal.makeThings();
        wireMetal.refine();
        wireMetal.cast();
        wire.coilWire();
        wire.insulateWire();
        wire.cutWire();
        wire.drawWire();
        wire.testWireStrength();
    }
}

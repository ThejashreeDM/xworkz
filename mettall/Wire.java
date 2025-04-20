package com.xworkz.inheritancemodule.mettall;

public class Wire extends Mettall
{
    @Override
    public void makeThings()
    {
        System.out.println("Wires are used in making manyThings");
    }
    @Override
    public void mine() {
        System.out.println("Mining the metal wire  from the earth.");
    }
    @Override
    public void refine() {
        System.out.println("Refining the metal wire to remove impurities.");
    }
    @Override
    public void melt() {
        System.out.println("Melting the metal wire to make it pliable.");
    }
    @Override
    public void alloy() {
        System.out.println("Creating an alloy by mixing metal wires");
    }


    @Override
    public void cast() {
        System.out.println("Casting the metalwire into shapes.");
    }
    public void drawWire() {
        System.out.println("Drawing the metal into thin wire.");
    }

    public void insulateWire() {
        System.out.println("Insulating the wire with a protective coating.");
    }

    public void coilWire() {
        System.out.println("Coiling the wire for storage or use.");
    }

    public void testWireStrength() {
        System.out.println("Testing the strength and flexibility of the wire.");
    }

    public void cutWire() {
        System.out.println("Cutting the wire into desired lengths.");
    }
}

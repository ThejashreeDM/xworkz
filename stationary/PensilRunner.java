package com.xworkz.inheritancemodule.stationary;

public class PensilRunner
{
    public static void main(String args[])
    {
        Stationary stationary = new Stationary();
        Stationary pencilAsStationary = new Pensil();
        Pensil pencil = new Pensil();
        stationary.write();
        stationary.organize();
        stationary.store();
        stationary.maintain();
        stationary.purchase();
        stationary.dispose();
        pencilAsStationary.write();
        pencilAsStationary.organize();
        pencilAsStationary.store();
        pencilAsStationary.maintain();
        pencilAsStationary.purchase();
        pencilAsStationary.dispose();
        pencil.write();
        pencil.organize();
        pencil.store();
        pencil.maintain();
        pencil.purchase();
        pencil.dispose();
        pencil.writee();
        pencil.erase();
        pencil.refill();
        pencil.checkQuality();
    }
}

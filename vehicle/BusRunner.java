package com.xworkz.inheritancemodule.vehicle;

public class BusRunner
{
    public static void main(String args[])
    {
        Vehicle bus=new Bus();
        Bus ksrtc=(Bus)bus;
        ksrtc.transport();
    }
}

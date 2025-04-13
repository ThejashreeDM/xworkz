package com.xworkz.inheritancemodule.digitaldevice;

public class ComputerRunner
{
    public static void main(String[] args) {
        DigitalDevice device=new Computer();
        Computer computer=(Computer)device;
        computer.makeWorkEasy();
    }
}

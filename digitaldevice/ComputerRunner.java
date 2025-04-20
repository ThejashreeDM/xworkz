package com.xworkz.inheritancemodule.digitaldevice;

public class ComputerRunner
{
    public static void main(String[] args) {
        DigitalDevice device=new DigitalDevice();
        DigitalDevice computer=new Computer();
        Computer dell=new Computer();
        device.connectToNetwork();
        device.makeWorkEasy();
        device.performTask();
        device.powerOn();
        device.powerOff();
        computer.connectToNetwork();
        computer.makeWorkEasy();
        computer.performTask();
        computer.powerOn();
        computer.powerOff();
        dell.connectToNetwork();
        dell.makeWorkEasy();
        dell.performTask();
        dell.powerOn();
        dell.powerOff();
        dell.compileCode();
        dell.openBrowser();
        dell.playMedia();
        dell.saveFile();
        dell.runProgram();



    }
}

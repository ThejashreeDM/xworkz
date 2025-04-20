package com.xworkz.inheritancemodule.digitaldevice;

public class Computer extends DigitalDevice
{
    @Override
    public  void makeWorkEasy()
    {
        System.out.println("Digital Devices makes our work easy");
    }

    @Override
    public void powerOn() {
        System.out.println("Computer is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer is powered off.");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Computer is connecting to the network.");
    }

    @Override
    public void performTask() {
        System.out.println("Computer is performing its task.");
    }
    @Override
    public void updateSoftware() {
        System.out.println("Computer is updating software.");
    }

    public void openBrowser() {
        System.out.println("Computer is opening the web browser.");
    }

    public void runProgram() {
        System.out.println("Computer is running a program.");
    }

    public void saveFile() {
        System.out.println("Computer is saving a file.");
    }

    public void compileCode() {
        System.out.println("Computer is compiling code.");
    }

    public void playMedia() {
        System.out.println("Computer is playing media.");
    }
}

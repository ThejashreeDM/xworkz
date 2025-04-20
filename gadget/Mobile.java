package com.xworkz.inheritancemodule.gadget;

public class Mobile extends Gadget
{
    @Override
    public void entertainment()
    {
        System.out.println("Mobile provides us entertainment");
    }
    @Override
    public void powerOn() {
        System.out.println("Powering on the mobile.");
    }
    @Override
    public void powerOff() {
        System.out.println("Powering off the mobile.");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Connecting the mobile to Wi-Fi.");
    }
    @Override
    public void updateSoftware() {
        System.out.println("Updating the mobile's software.");
    }
    @Override
    public void charge() {
        System.out.println("Charging the mobile.");
    }

    public void makeCall() {
        System.out.println("Making a call from the mobile.");
    }

    public void sendMessage() {
        System.out.println("Sending a message from the mobile.");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with the mobile camera.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet on the mobile.");
    }

    public void installApp() {
        System.out.println("Installing an app on the mobile.");
    }
}

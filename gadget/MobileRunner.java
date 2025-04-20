package com.xworkz.inheritancemodule.gadget;

public class MobileRunner
{
    public static void main(String args[])
    {
        Gadget gadget = new Gadget();
        Gadget phoneGadget = new Mobile();
        Mobile mobile = new Mobile();
        gadget.powerOn();
        gadget.powerOff();
        gadget.charge();
        gadget.connectToWifi();
        gadget.updateSoftware();
        phoneGadget.powerOn();
        phoneGadget.powerOff();
        phoneGadget.charge();
        phoneGadget.connectToWifi();
        phoneGadget.updateSoftware();
        mobile.powerOn();
        mobile.powerOff();
        mobile.charge();
        mobile.connectToWifi();
        mobile.updateSoftware();
        mobile.makeCall();
        mobile.browseInternet();
        mobile.installApp();
        mobile.sendMessage();
        mobile.takePhoto();
    }
}

package com.xworkz.inheritancemodule.hairaccessories;

public class HairPinRunner
{
    public static void main(String args[])
    {
        HairAccessory accessories = new HairAccessory();
        HairPin pin = new HairPin();
        HairPin hairPin = new HairPin();
        accessories.hairStyling();
        accessories.chooseColor();
        accessories. matchOutfit();
        accessories.selectStyle();
        accessories.pack();
        pin.hairStyling();
        pin.chooseColor();
        pin.matchOutfit();
        pin.selectStyle();
        pin.pack();
        hairPin.hairStyling();
        hairPin.chooseColor();
        hairPin.matchOutfit();
        hairPin.selectStyle();
        hairPin.pack();
        hairPin.adjustPin();
        hairPin.attachToHair();
        hairPin.decoratePin();
        hairPin.designPin();
        hairPin.removePin();
    }
    }


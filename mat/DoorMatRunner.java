package com.xworkz.inheritancemodule.mat;

public class DoorMatRunner
{
    public static void main(String[] args)
    {
        Mat mat = new Mat();
        Mat doorMat = new DoorMat();
        DoorMat myDoorMat = new DoorMat();
        mat.clean();
        mat.providesComfort();
        mat.place();
        mat.store();
        mat.roll();
        doorMat.clean();
        doorMat.providesComfort();
        doorMat.place();
        doorMat.store();
        doorMat.roll();
        myDoorMat.personalize();
        myDoorMat.addAntiSlip();
        myDoorMat.design();
        myDoorMat.wash();
        myDoorMat.placeAtDoor();
    }
}

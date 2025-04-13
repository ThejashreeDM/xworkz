package com.xworkz.inheritancemodule.mat;

public class DoorMatRunner
{
    public static void main(String[] args) {
        Mat mat=new DoorMat();
        DoorMat doorMat=(DoorMat)mat;
        doorMat.providesComfort();
    }
}

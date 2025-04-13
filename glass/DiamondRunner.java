package com.xworkz.inheritancemodule.glass;

public class DiamondRunner
{
    public static void main(String[] args) {
        Glass glass=new Diamond();
        Diamond type=(Diamond)glass;
        type.something();
    }
}

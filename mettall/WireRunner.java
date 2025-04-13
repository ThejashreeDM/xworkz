package com.xworkz.inheritancemodule.mettall;

public class WireRunner
{
    public static void main(String[] args) {
        Mettall copper=new Wire();
        Wire wire=(Wire) copper;
        wire.makeThings();
    }
}

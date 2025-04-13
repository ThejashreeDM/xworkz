package com.xworkz.inheritancemodule.sport;

public class CricketRunner {
    public static void main(String args[])
    {
        Sport type1=new Cricket();
        Cricket cricket=(Cricket)type1;
        cricket.exercise();
    }
}

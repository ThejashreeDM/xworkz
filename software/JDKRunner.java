package com.xworkz.inheritancemodule.software;

public class JDKRunner
{
    public static void main(String[] args) {
        Software software=new JDK();
        JDK isSoftware=(JDK)software;
        isSoftware.provideService();
    }
}

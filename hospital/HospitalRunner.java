package com.xworkz.inheritancemodule.hospital;

public class HospitalRunner
{
    public static void main(String args[])
    {
        Hospital hospital=new Mims();
        Mims mims=(Mims)hospital;
        mims.treat();
    }
}

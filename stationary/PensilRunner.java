package com.xworkz.inheritancemodule.stationary;

public class PensilRunner
{
    public static void main(String args[])
    {
        Stationary pencil=new Pensil();
        Pensil apsara=(Pensil)pencil;
        apsara.write();
    }
}

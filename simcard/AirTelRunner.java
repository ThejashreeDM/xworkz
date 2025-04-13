package com.xworkz.inheritancemodule.simcard;

public class AirTelRunner
{     public static void main(String args[])
{
    SimCard type=new AirTel();
    AirTel airTel=(AirTel)type;
    airTel.communication();

}
}

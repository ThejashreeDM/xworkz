package com.xworkz.inheritancemodule.simcard;

public class AirTelRunner
{     public static void main(String args[])
{
    SimCard simCard = new SimCard();
    SimCard airtel = new AirTel();
    AirTel airTel = new AirTel();
    simCard.communication();
    simCard.activate();
    simCard.deactivate();
    simCard.checkBalance();
    simCard.recharge();
    simCard.updateSettings();
    airtel.communication();
    airtel.activate();
    airtel.deactivate();
    airtel.checkBalance();
    airtel.recharge();
    airtel.updateSettings();
    airTel.provide4G();
    airTel.offerPlans();
    airTel.customerSupport();
    airTel.activateRoaming();
    airTel.sendPromotions();

}
}

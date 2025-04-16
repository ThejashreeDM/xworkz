package com.xworkz.inheritancemodule.simcard;

public class SimCard
{      public void communication()
    {
    System.out.println("SimCard is used to provide internet ");
    }
    public void activate() {
        System.out.println("Activating the SIM card.");
    }

    public void deactivate() {
        System.out.println("Deactivating the SIM card.");
    }

    public void checkBalance() {
        System.out.println("Checking the balance on the SIM card.");
    }

    public void recharge() {
        System.out.println("Recharging the SIM card with a top-up.");
    }

    public void updateSettings() {
        System.out.println("Updating the settings for the SIM card.");
    }
}

package com.xworkz.inheritancemodule.simcard;

public class AirTel extends SimCard
{
    @Override
    public void communication()
    {
        System.out.println("AirTel SimCard is used to provide internet ");
    }
    @Override
    public void activate() {
        System.out.println("Activating the AirTel SIM card");
    }
    @Override
    public void deactivate() {
        System.out.println("Deactivating the AirTel SIM card");
    }


    @Override
    public void checkBalance() {
        System.out.println("Checking the balance on the AirTel SIM card");
    }
    @Override
    public void recharge() {
        System.out.println("Recharging the AirTel SIM card with a top-up");
    }
    @Override
    public void updateSettings() {
        System.out.println("Updating the settings for the AirTel SIM card");
    }
    public void provide4G() {
        System.out.println("Providing 4G network services for high-speed internet.");
    }

    public void offerPlans() {
        System.out.println("Offering a variety of prepaid and postpaid plans.");
    }

    public void customerSupport() {
        System.out.println("Providing customer support for any queries or issues.");
    }

    public void activateRoaming() {
        System.out.println("Activating international roaming for the Airtel SIM card.");
    }

    public void sendPromotions() {
        System.out.println("Sending promotional offers and discounts to Airtel customers.");
    }

}

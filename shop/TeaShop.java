package com.xworkz.inheritancemodule.shop;

public class TeaShop extends Shop
{
     @Override
    public void trading()
    {
        System.out.println("TeaShop is used for trading tea");
    }
    @Override
    public void openShop() {
        System.out.println("Opening the teashop for the day.");
    }


    @Override
    public void sellProduct() {
        System.out.println("Selling tea to customers");
    }
    @Override
    public void manageInventory() {
        System.out.println("Managing the inventory of goods used to make tea");
    }
    @Override
    public void handlePayment() {
        System.out.println("Handling customer payments for the tea");
    }


    @Override
    public void closeShop() {
        System.out.println("Closing the teashop after business hours");
    }
    public void serveTea() {
        System.out.println("Serving a variety of tea to customers");
    }

    public void prepareSnacks() {
        System.out.println("Preparing snacks to accompany the tea");
    }

    public void createAmbience() {
        System.out.println("Creating a cozy and inviting ambiance for tea lovers");
    }

    public void offerSpecials() {
        System.out.println("Offering daily specials and seasonal teas");
    }
    public void cleanTeaShop() {
        System.out.println("Cleaning the Tea Shop after serving");
    }
}

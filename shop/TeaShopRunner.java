package com.xworkz.inheritancemodule.shop;

public class TeaShopRunner
{
    public static void main(String args[])
    {
        Shop shop = new Shop();
        Shop teaShop = new TeaShop();
        TeaShop tea = new TeaShop();
        shop.trading();
        shop.openShop();
        shop.sellProduct();
        shop.manageInventory();
        shop.handlePayment();
        shop.closeShop();
        teaShop.trading();
        teaShop.openShop();
        teaShop.sellProduct();
        teaShop.manageInventory();
        teaShop.handlePayment();
        teaShop.closeShop();
        tea.serveTea();
        tea.prepareSnacks();
        tea.createAmbience();
        tea.offerSpecials();
    }
}

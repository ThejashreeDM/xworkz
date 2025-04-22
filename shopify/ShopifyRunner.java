package com.xworkz.tostring.shopify;

public class ShopifyRunner
{
    public static void main(String[] args) {

        ShopifyDto user = new ShopifyDto();
        user.setShopifyId("shopify2025");
        user.setUserName("Ayaan");
        user.setEmail("ayaan@shopify.com");
        user.setPassword("shopify@2025");
        user.setConfirmPassword("shopify@2025");
        user.setContactNumber(9876645678L);

        System.out.println(user);
    }
}

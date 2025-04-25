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

        ShopifyDto user1 = new ShopifyDto();
        user1.setShopifyId("shopify2025");
        user1.setUserName("Ayaan");
        user1.setEmail("ayaan@shopify.com");
        user1.setPassword("shopify@2025");
        user1.setConfirmPassword("shopify@2025");
        user1.setContactNumber(9876645678L);

        ShopifyDto user2= new ShopifyDto();
        user2.setShopifyId("shopify2023");
        user2.setUserName("Ayushi");
        user2.setEmail("ayushi@shopify.com");
        user2.setPassword("shopify@2023");
        user2.setConfirmPassword("shopify@2023");
        user2.setContactNumber(9876645667L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

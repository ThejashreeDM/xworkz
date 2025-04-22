package com.xworkz.tostring.shopclues;

public class ShopCluesRunner {


    public static void main(String[] args) {
        ShopCluesDto user = new ShopCluesDto();
        user.setEmail("shopclues.user@example.com");
        user.setUserName("Theju");
        user.setUserPassword("Theju@123");
        user.setRetypePassword("Theju@123");
        user.setPreferredLanguage("English");

        System.out.println(user);
    }
}

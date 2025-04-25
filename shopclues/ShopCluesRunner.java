package com.xworkz.tostring.shopclues;

public class ShopCluesRunner {


    public static void main(String[] args) {
        ShopCluesDto user = new ShopCluesDto();
        user.setEmail("shopclues.user@example.com");
        user.setUserName("Theju");
        user.setUserPassword("Theju@123");
        user.setRetypePassword("Theju@123");
        user.setPreferredLanguage("English");

        ShopCluesDto user1 = new ShopCluesDto();
        user1.setEmail("shopclues.user@example.com");
        user1.setUserName("Theju");
        user1.setUserPassword("Theju@123");
        user1.setRetypePassword("Theju@123");
        user1.setPreferredLanguage("English");

        ShopCluesDto user2 = new ShopCluesDto();
        user2.setEmail("shopclues.user@example.com");
        user2.setUserName("Thejashree");
        user2.setUserPassword("Theju@1234");
        user2.setRetypePassword("Theju@1234");
        user2.setPreferredLanguage("English");

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

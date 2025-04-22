package com.xworkz.tostring.wish;

public class WishRunner
{

    public static void main(String[] args) {

        WishDto user = new WishDto();
        user.setWishId("wish2025");
        user.setUserName("Neha");
        user.setEmail("neha@wish.com");
        user.setPassword("wish@2025");
        user.setConfirmPassword("wish@2025");
        user.setContactNumber(9876556789L);

        System.out.println(user);
    }
}

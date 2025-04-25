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

        WishDto user1 = new WishDto();
        user1.setWishId("wish2025");
        user1.setUserName("Neha");
        user1.setEmail("neha@wish.com");
        user1.setPassword("wish@2025");
        user1.setConfirmPassword("wish@2025");
        user1.setContactNumber(9876556789L);

        WishDto user2 = new WishDto();
        user2.setWishId("wish2025");
        user2.setUserName("Nisha");
        user2.setEmail("nisha@wish.com");
        user2.setPassword("wish@2025");
        user2.setConfirmPassword("wish@2025");
        user2.setContactNumber(9874656789L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

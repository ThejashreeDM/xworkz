package com.xworkz.tostring.bestbuy;

public class BestBuyRunner
{
    public static void main(String[] args) {

        BestBuyDto user = new BestBuyDto();
        user.setBestBuyId("bestbuy2025");
        user.setUserName("Sophia");
        user.setEmail("sophia@bestbuy.com");
        user.setPassword("best@2025");
        user.setConfirmPassword("best@2025");
        user.setContactNumber(9876634567L);

        BestBuyDto user1 = new BestBuyDto();
        user1.setBestBuyId("bestbuy2025");
        user1.setUserName("Sophia");
        user1.setEmail("sophia@bestbuy.com");
        user1.setPassword("best@2025");
        user1.setConfirmPassword("best@2025");
        user1.setContactNumber(9876634567L);


        BestBuyDto user2 = new BestBuyDto();
        user2.setBestBuyId("bestbuy2023");
        user2.setUserName("Sherni");
        user2.setEmail("sherni@bestbuy.com");
        user2.setPassword("best@2023");
        user2.setConfirmPassword("best@2023");
        user2.setContactNumber(9378634567L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}

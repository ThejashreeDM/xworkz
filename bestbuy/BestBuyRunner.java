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

        System.out.println(user);
    }
}

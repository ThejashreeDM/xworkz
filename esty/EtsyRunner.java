package com.xworkz.tostring.esty;

public class EtsyRunner {


    public static void main(String[] args) {

        EtsyDto user = new EtsyDto();
        user.setEtsyId("etsy2025");
        user.setUserName("Divya");
        user.setEmail("divya@etsy.com");
        user.setPassword("etsy@2025");
        user.setConfirmPassword("etsy@2025");
        user.setContactNumber(9876512345L);

        System.out.println(user);
    }
}

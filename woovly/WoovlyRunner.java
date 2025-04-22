package com.xworkz.tostring.woovly;

public class WoovlyRunner
{
    public static void main(String[] args) {

        WoovlyDto user = new WoovlyDto();
        user.setWoovlyId("woovly2025");
        user.setUserName("Divya");
        user.setEmail("divya@woovly.com");
        user.setPassword("woovly@2025");
        user.setConfirmPassword("woovly@2025");
        user.setContactNumber(9876756789L);

        System.out.println(user);
    }
}

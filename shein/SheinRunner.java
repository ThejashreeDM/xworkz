package com.xworkz.tostring.shein;

public class SheinRunner
{
    public static void main(String[] args) {

        SheinDto user = new SheinDto();
        user.setSheinId("shein2025");
        user.setUserName("Ananya");
        user.setEmail("ananya@shein.com");
        user.setPassword("shein@2025");
        user.setConfirmPassword("shein@2025");
        user.setContactNumber(9876523456L);

        System.out.println(user);
    }
}

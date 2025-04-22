package com.xworkz.tostring.nordstrom;

public class NordStromRunner
{
    public static void main(String[] args) {

        NordStromDto user = new NordStromDto();
        user.setNordStromId("nordstrom2025");
        user.setUserName("Rhea");
        user.setEmail("rhea@nordstrom.com");
        user.setPassword("nord@2025");
        user.setConfirmPassword("nord@2025");
        user.setContactNumber(9876690123L);

        System.out.println(user);
    }
}

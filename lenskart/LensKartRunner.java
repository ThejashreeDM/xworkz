package com.xworkz.tostring.lenskart;

public class LensKartRunner
{
    public static void main(String[] args) {

        LensKartDto user = new LensKartDto();
        user.setLenskartId("lenskart2025");
        user.setUserName("Arjun");
        user.setEmail("arjun@lenskart.com");
        user.setPassword("lens@2025");
        user.setConfirmPassword("lens@2025");
        user.setContactNumber(9876567890L);

        System.out.println(user);
    }
}

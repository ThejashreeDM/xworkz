package com.xworkz.tostring.gocolors;

public class GoColorsRunner
{
    public static void main(String[] args) {

        GoColorsDto user = new GoColorsDto();
        user.setGoColorsId("gocolors2025");
        user.setUserName("Sneha");
        user.setEmail("sneha@gocolors.com");
        user.setPassword("colors@2025");
        user.setConfirmPassword("colors@2025");
        user.setContactNumber(9876712345L);

        System.out.println(user);
    }
}

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

        GoColorsDto user1 = new GoColorsDto();
        user1.setGoColorsId("gocolors2025");
        user1.setUserName("Sneha");
        user1.setEmail("sneha@gocolors.com");
        user1.setPassword("colors@2025");
        user1.setConfirmPassword("colors@2025");
        user1.setContactNumber(9876712345L);

        GoColorsDto user2 = new GoColorsDto();
        user2.setGoColorsId("gocolors2025");
        user2.setUserName("Sneha");
        user2.setEmail("sneha@gocolors.com");
        user2.setPassword("colors@2025");
        user2.setConfirmPassword("colors@2025");
        user2.setContactNumber(9876712345L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

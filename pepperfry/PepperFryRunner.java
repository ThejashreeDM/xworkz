package com.xworkz.tostring.pepperfry;

public class PepperFryRunner
{
    public static void main(String[] args) {

        PepperFryDto user = new PepperFryDto();
        user.setPepperfryId("pepperfry2025");
        user.setUserName("Rohit");
        user.setEmail("rohit@pepperfry.com");
        user.setPassword("pepper@2025");
        user.setConfirmPassword("pepper@2025");
        user.setContactNumber(9876534567L);


        PepperFryDto user1 = new PepperFryDto();
        user1.setPepperfryId("pepperfry2025");
        user1.setUserName("Rohit");
        user1.setEmail("rohit@pepperfry.com");
        user1.setPassword("pepper@2025");
        user1.setConfirmPassword("pepper@2025");
        user1.setContactNumber(9876534567L);


        PepperFryDto user2 = new PepperFryDto();
        user2.setPepperfryId("pepperfry2025");
        user2.setUserName("Rohinya");
        user2.setEmail("rohinya@pepperfry.com");
        user2.setPassword("pepper@2025");
        user2.setConfirmPassword("pepper@2025");
        user2.setContactNumber(7890123456L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

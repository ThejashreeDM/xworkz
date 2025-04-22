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

        System.out.println(user);
    }
}

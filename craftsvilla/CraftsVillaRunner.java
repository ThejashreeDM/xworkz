package com.xworkz.tostring.craftsvilla;

public class CraftsVillaRunner
{
    public static void main(String[] args) {

        CraftsVillaDto user = new CraftsVillaDto();
        user.setCraftsVillaId("craftsvilla2025");
        user.setUserName("Deepika");
        user.setEmail("deepika@craftsvilla.com");
        user.setPassword("crafts@2025");
        user.setConfirmPassword("crafts@2025");
        user.setContactNumber(9876689012L);

        System.out.println(user);
    }
}

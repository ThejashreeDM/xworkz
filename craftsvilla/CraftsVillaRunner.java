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


        CraftsVillaDto user1 = new CraftsVillaDto();
        user1.setCraftsVillaId("craftsvilla2025");
        user1.setUserName("Deepika");
        user1.setEmail("deepika@craftsvilla.com");
        user1.setPassword("crafts@2025");
        user1.setConfirmPassword("crafts@2025");
        user1.setContactNumber(9876689012L);

        CraftsVillaDto user2 = new CraftsVillaDto();
        user2.setCraftsVillaId("craftsvilla2018");
        user2.setUserName("Deepak");
        user2.setEmail("deepak@craftsvilla.com");
        user2.setPassword("crafts@2018");
        user2.setConfirmPassword("crafts@2018");
        user2.setContactNumber(9876617012L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}

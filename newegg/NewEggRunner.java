package com.xworkz.tostring.newegg;


public class NewEggRunner
{
    public static void main(String[] args) {

        NewEggDto user = new NewEggDto();
        user.setNewEggId("newegg2025");
        user.setUserName("Arjun");
        user.setEmail("arjun@newegg.com");
        user.setPassword("egg@2025");
        user.setConfirmPassword("egg@2025");
        user.setContactNumber(9876723456L);

        NewEggDto user1 = new NewEggDto();
        user1.setNewEggId("newegg2025");
        user1.setUserName("Arjun");
        user1.setEmail("arjun@newegg.com");
        user1.setPassword("egg@2025");
        user1.setConfirmPassword("egg@2025");
        user1.setContactNumber(9876723456L);

        NewEggDto user2 = new NewEggDto();
        user2.setNewEggId("newegg2024");
        user2.setUserName("Anmol");
        user2.setEmail("anmol@newegg.com");
        user2.setPassword("egg@2024");
        user2.setConfirmPassword("egg@2024");
        user2.setContactNumber(9876729056L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

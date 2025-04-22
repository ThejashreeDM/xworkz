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

        System.out.println(user);
    }
}

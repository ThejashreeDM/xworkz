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

        LensKartDto user1 = new LensKartDto();
        user1.setLenskartId("lenskart2025");
        user1.setUserName("Arjun");
        user1.setEmail("arjun@lenskart.com");
        user1.setPassword("lens@2025");
        user1.setConfirmPassword("lens@2025");
        user1.setContactNumber(9876567890L);

        LensKartDto user2 = new LensKartDto();
        user2.setLenskartId("lenskart2023");
        user2.setUserName("Anmol");
        user2.setEmail("anmol@lenskart.com");
        user2.setPassword("lens@2023");
        user2.setConfirmPassword("lens@2023");
        user2.setContactNumber(9876297890L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

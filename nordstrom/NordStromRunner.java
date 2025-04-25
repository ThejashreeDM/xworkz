package com.xworkz.tostring.nordstrom;

public class NordStromRunner
{
    public static void main(String[] args) {

        NordStromDto user = new NordStromDto();
        user.setNordStromId("nordstrom2025");
        user.setUserName("Rhea");
        user.setEmail("rhea@nordstrom.com");
        user.setPassword("nord@2025");
        user.setConfirmPassword("nord@2025");
        user.setContactNumber(9876690123L);

        NordStromDto user1 = new NordStromDto();
        user1.setNordStromId("nordstrom2025");
        user1.setUserName("Rhea");
        user1.setEmail("rhea@nordstrom.com");
        user1.setPassword("nord@2025");
        user1.setConfirmPassword("nord@2025");
        user1.setContactNumber(9876690123L);

        NordStromDto user2 = new NordStromDto();
        user2.setNordStromId("nordstrom2025");
        user2.setUserName("Ria");
        user2.setEmail("ria@nordstrom.com");
        user2.setPassword("nord@2025");
        user2.setConfirmPassword("nord@2025");
        user2.setContactNumber(9876690723L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

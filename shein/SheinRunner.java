package com.xworkz.tostring.shein;

public class SheinRunner
{
    public static void main(String[] args) {

        SheinDto user = new SheinDto();
        user.setSheinId("shein2025");
        user.setUserName("Ananya");
        user.setEmail("ananya@shein.com");
        user.setPassword("shein@2025");
        user.setConfirmPassword("shein@2025");
        user.setContactNumber(9876523456L);

        SheinDto user1 = new SheinDto();
        user1.setSheinId("shein2025");
        user1.setUserName("Ananya");
        user1.setEmail("ananya@shein.com");
        user1.setPassword("shein@2025");
        user1.setConfirmPassword("shein@2025");
        user1.setContactNumber(9876523456L);

        SheinDto user2 = new SheinDto();
        user2.setSheinId("shein2025");
        user2.setUserName("Amrutha");
        user2.setEmail("amrutha@shein.com");
        user2.setPassword("shein@2025");
        user2.setConfirmPassword("shein@2025");
        user2.setContactNumber(9834523456L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

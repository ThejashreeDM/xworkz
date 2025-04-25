package com.xworkz.tostring.woovly;

public class WoovlyRunner
{
    public static void main(String[] args) {

        WoovlyDto user = new WoovlyDto();
        user.setWoovlyId("woovly2025");
        user.setUserName("Divya");
        user.setEmail("divya@woovly.com");
        user.setPassword("woovly@2025");
        user.setConfirmPassword("woovly@2025");
        user.setContactNumber(9876756789L);

        WoovlyDto user1 = new WoovlyDto();
        user1.setWoovlyId("woovly2025");
        user1.setUserName("Divya");
        user1.setEmail("divya@woovly.com");
        user1.setPassword("woovly@2025");
        user1.setConfirmPassword("woovly@2025");
        user1.setContactNumber(9876756789L);

        WoovlyDto user2 = new WoovlyDto();
        user2.setWoovlyId("woovly2025");
        user2.setUserName("Diya");
        user2.setEmail("diya@woovly.com");
        user2.setPassword("woovly@2025");
        user2.setConfirmPassword("woovly@2025");
        user2.setContactNumber(9845756789L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

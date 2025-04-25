package com.xworkz.tostring.zivame;

public class ZivameRunner
{
    public static void main(String[] args) {

        ZivameDto user = new ZivameDto();
        user.setZivameId("zivame2025");
        user.setUserName("Anjali");
        user.setEmail("anjali@zivame.com");
        user.setPassword("zivame@2025");
        user.setConfirmPassword("zivame@2025");
        user.setContactNumber(9876678901L);

        ZivameDto user1 = new ZivameDto();
        user1.setZivameId("zivame2025");
        user1.setUserName("Anjali");
        user1.setEmail("anjali@zivame.com");
        user1.setPassword("zivame@2025");
        user1.setConfirmPassword("zivame@2025");
        user1.setContactNumber(9876678901L);

        ZivameDto user2 = new ZivameDto();
        user2.setZivameId("zivame2025");
        user2.setUserName("Anmol");
        user2.setEmail("anmol@zivame.com");
        user2.setPassword("zivame@2025");
        user2.setConfirmPassword("zivame@2025");
        user2.setContactNumber(9876656901L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

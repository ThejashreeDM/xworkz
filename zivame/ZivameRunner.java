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

        System.out.println(user);
    }
}

package com.xworkz.tostring.purpulle;

public class PurplleRunner
{
    public static void main(String[] args) {

        PurplleDto user = new PurplleDto();
        user.setPurplleId("purplle2025");
        user.setUserName("Kavya");
        user.setEmail("kavya@purplle.com");
        user.setPassword("purple@2025");
        user.setConfirmPassword("purple@2025");
        user.setContactNumber(9876598765L);

        System.out.println(user);
    }
}

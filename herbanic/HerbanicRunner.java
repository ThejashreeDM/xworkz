package com.xworkz.tostring.herbanic;

public class HerbanicRunner
{
    public static void main(String[] args) {

        HerbanicDto user = new HerbanicDto();
        user.setHerbanicId("herbanic2025");
        user.setUserName("Shreya");
        user.setEmail("shreya@herbanic.com");
        user.setPassword("herb@2025");
        user.setConfirmPassword("herb@2025");
        user.setContactNumber(9876501234L);

        System.out.println(user);
    }
}

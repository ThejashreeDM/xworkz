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

        HerbanicDto user1= new HerbanicDto();
        user1.setHerbanicId("herbanic2025");
        user1.setUserName("Shreya");
        user1.setEmail("shreya@herbanic.com");
        user1.setPassword("herb@2025");
        user1.setConfirmPassword("herb@2025");
        user1.setContactNumber(9876501234L);

        HerbanicDto user2 = new HerbanicDto();
        user2.setHerbanicId("herbanic2025");
        user2.setUserName("Shruthi");
        user2.setEmail("shruthi@herbanic.com");
        user2.setPassword("herb@2025");
        user2.setConfirmPassword("herb@2025");
        user2.setContactNumber(9876291234L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

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

        PurplleDto user2 = new PurplleDto();
        user2.setPurplleId("purplle2025");
        user2.setUserName("Kavya");
        user2.setEmail("kavya@purplle.com");
        user2.setPassword("purple@2025");
        user2.setConfirmPassword("purple@2025");
        user2.setContactNumber(9876598765L);

        PurplleDto user1 = new PurplleDto();
        user1.setPurplleId("purplle2023");
        user1.setUserName("Kumari");
        user1.setEmail("kumari@purplle.com");
        user1.setPassword("purple@2023");
        user1.setConfirmPassword("purple@20223");
        user1.setContactNumber(7896598765L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

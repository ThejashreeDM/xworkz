package com.xworkz.tostring.sephora;



public class SephoraRunner
{
    public static void main(String[] args) {

        SephoraDto user = new SephoraDto();
        user.setSephoraId("sephora2025");
        user.setUserName("Megha");
        user.setEmail("megha@sephora.com");
        user.setPassword("sephora@2025");
        user.setConfirmPassword("sephora@2025");
        user.setContactNumber(9876734567L);

        SephoraDto user1 = new SephoraDto();
        user1.setSephoraId("sephora2025");
        user1.setUserName("Megha");
        user1.setEmail("megha@sephora.com");
        user1.setPassword("sephora@2025");
        user1.setConfirmPassword("sephora@2025");
        user1.setContactNumber(9876734567L);

        SephoraDto user2 = new SephoraDto();
        user2.setSephoraId("sephora2025");
        user2.setUserName("Megha");
        user2.setEmail("megha@sephora.com");
        user2.setPassword("sephora@2025");
        user2.setConfirmPassword("sephora@2025");
        user2.setContactNumber(9876734567L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

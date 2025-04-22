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

        System.out.println(user);
    }
}

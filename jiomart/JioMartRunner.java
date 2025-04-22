package com.xworkz.tostring.jiomart;

public class JioMartRunner
{
    public static void main(String[] args) {

        JioMartDto user = new JioMartDto();
        user.setJiomartId("jiomart2025");
        user.setUserName("Megha");
        user.setEmail("megha@jiomart.com");
        user.setPassword("jiom@2025");
        user.setConfirmPassword("jiom@2025");
        user.setContactNumber(9876578901L);

        System.out.println(user);
    }
}

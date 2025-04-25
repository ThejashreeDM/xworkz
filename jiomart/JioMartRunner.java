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

        JioMartDto user1 = new JioMartDto();
        user1.setJiomartId("jiomart2025");
        user1.setUserName("Megha");
        user1.setEmail("megha@jiomart.com");
        user1.setPassword("jiom@2025");
        user1.setConfirmPassword("jiom@2025");
        user1.setContactNumber(9876578901L);

        JioMartDto user2 = new JioMartDto();
        user2.setJiomartId("jiomart2024");
        user2.setUserName("Mouna");
        user2.setEmail("mouna@jiomart.com");
        user2.setPassword("jiom@2024");
        user2.setConfirmPassword("jiom@2024");
        user2.setContactNumber(9876208901L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

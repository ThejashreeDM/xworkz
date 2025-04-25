package com.xworkz.tostring.esty;

public class EtsyRunner {


    public static void main(String[] args) {

        EtsyDto user = new EtsyDto();
        user.setEtsyId("etsy2025");
        user.setUserName("Divya");
        user.setEmail("divya@etsy.com");
        user.setPassword("etsy@2025");
        user.setConfirmPassword("etsy@2025");
        user.setContactNumber(9876512345L);

        EtsyDto user1 = new EtsyDto();
        user1.setEtsyId("etsy2025");
        user1.setUserName("Divya");
        user1.setEmail("divya@etsy.com");
        user1.setPassword("etsy@2025");
        user1.setConfirmPassword("etsy@2025");
        user1.setContactNumber(9876512345L);

        EtsyDto user2 = new EtsyDto();
        user2.setEtsyId("etsy2034");
        user2.setUserName("Div");
        user2.setEmail("div@etsy.com");
        user2.setPassword("etsy@2034");
        user2.setConfirmPassword("etsy@2034");
        user2.setContactNumber(9872512345L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}

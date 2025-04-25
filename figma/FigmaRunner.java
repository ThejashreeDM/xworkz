package com.xworkz.tostring.figma;

public class FigmaRunner
{
    public static void main(String[] args) {

        FigmaDto user = new FigmaDto();
        user.setFigmaId("figma2025");
        user.setUserName("Ishaan");
        user.setEmail("ishaan@figma.com");
        user.setPassword("figma@2025");
        user.setConfirmPassword("figma@2025");
        user.setContactNumber(9876612345L);

        FigmaDto user1 = new FigmaDto();
        user1.setFigmaId("figma2025");
        user1.setUserName("Ishaan");
        user1.setEmail("ishaan@figma.com");
        user1.setPassword("figma@2025");
        user1.setConfirmPassword("figma@2025");
        user1.setContactNumber(9876612345L);

        FigmaDto user2 = new FigmaDto();
        user2.setFigmaId("figma2018");
        user2.setUserName("Inchara");
        user2.setEmail("inchara@figma.com");
        user2.setPassword("figma@2018");
        user2.setConfirmPassword("figma@2018");
        user2.setContactNumber(9812312345L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

    }
}

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

        System.out.println(user);
    }
}

package com.xworkz.tostring.onshape;

public class OnShapeRunner
{
    public static void main(String[] args) {

        OnShapeDto user = new OnShapeDto();
        user.setOnShapeId("onshape2025");
        user.setUserName("Raj");
        user.setEmail("raj@onshape.com");
        user.setPassword("onshape@2025");
        user.setConfirmPassword("onshape@2025");
        user.setContactNumber(9876623456L);

        System.out.println(user);
    }
}

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

        OnShapeDto user1 = new OnShapeDto();
        user1.setOnShapeId("onshape2025");
        user1.setUserName("Raj");
        user1.setEmail("raj@onshape.com");
        user1.setPassword("onshape@2025");
        user1.setConfirmPassword("onshape@2025");
        user1.setContactNumber(9876623456L);


        OnShapeDto user2 = new OnShapeDto();
        user2.setOnShapeId("onshape2024");
        user2.setUserName("Raju");
        user2.setEmail("raju@onshape.com");
        user2.setPassword("onshape@2024");
        user2.setConfirmPassword("onshape@2024");
        user2.setContactNumber(9876623489L);


        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

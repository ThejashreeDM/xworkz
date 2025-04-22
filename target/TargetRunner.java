package com.xworkz.tostring.target;

public class TargetRunner
{
    public static void main(String[] args) {

        TargetDto user = new TargetDto();
        user.setTargetId("target2025");
        user.setUserName("Sneha");
        user.setEmail("sneha@target.com");
        user.setPassword("target@2025");
        user.setConfirmPassword("target@2025");
        user.setContactNumber(9876545678L);

        System.out.println(user);
    }
}

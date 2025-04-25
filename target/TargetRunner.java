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

        TargetDto user1 = new TargetDto();
        user1.setTargetId("target2025");
        user1.setUserName("Sneha");
        user1.setEmail("sneha@target.com");
        user1.setPassword("target@2025");
        user1.setConfirmPassword("target@2025");
        user1.setContactNumber(9876545678L);

        TargetDto user2 = new TargetDto();
        user2.setTargetId("target2023");
        user2.setUserName("Sharvi");
        user2.setEmail("sharvi@target.com");
        user2.setPassword("target@2023");
        user2.setConfirmPassword("target@2023");
        user2.setContactNumber(9876545645L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}

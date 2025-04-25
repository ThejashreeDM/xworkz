package com.xworkz.tostring.fynd;

public class FyndRunner
{
    public static void main(String[] args) {

        FyndDto user = new FyndDto();
        user.setFyndId("fynd2025");
        user.setUserName("Nikhil");
        user.setEmail("nikhil@fynd.com");
        user.setPassword("fynd@2025");
        user.setConfirmPassword("fynd@2025");
        user.setContactNumber(9876767890L);

        FyndDto user1 = new FyndDto();
        user1.setFyndId("fynd2025");
        user1.setUserName("Nikhil");
        user1.setEmail("nikhil@fynd.com");
        user1.setPassword("fynd@2025");
        user1.setConfirmPassword("fynd@2025");
        user1.setContactNumber(9876767890L);

        FyndDto user2 = new FyndDto();
        user2.setFyndId("fynd2019");
        user2.setUserName("Niharika");
        user2.setEmail("niharika@fynd.com");
        user2.setPassword("fynd@2019");
        user2.setConfirmPassword("fynd@2019");
        user2.setContactNumber(9874767890L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));

    }
}

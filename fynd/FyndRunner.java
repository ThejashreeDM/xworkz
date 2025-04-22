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

        System.out.println(user);
    }
}

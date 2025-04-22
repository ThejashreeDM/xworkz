package com.xworkz.tostring.urbanladder;

public class UrbanLadderRunner
{
    public static void main(String[] args) {

        UrbanLadderDto user = new UrbanLadderDto();
        user.setUrbanLadderId("urbanladder2025");
        user.setUserName("Ravi");
        user.setEmail("ravi@urbanladder.com");
        user.setPassword("ladder@2025");
        user.setConfirmPassword("ladder@2025");
        user.setContactNumber(9876667890L);

        System.out.println(user);
    }
}

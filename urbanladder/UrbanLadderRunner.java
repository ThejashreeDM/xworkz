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


        UrbanLadderDto user1 = new UrbanLadderDto();
        user1.setUrbanLadderId("urbanladder2025");
        user1.setUserName("Ravi");
        user1.setEmail("ravi@urbanladder.com");
        user1.setPassword("ladder@2025");
        user1.setConfirmPassword("ladder@2025");
        user1.setContactNumber(9876667890L);


        UrbanLadderDto user2= new UrbanLadderDto();
        user2.setUrbanLadderId("urbanladder2023");
        user2.setUserName("Rekha");
        user2.setEmail("rekha@urbanladder.com");
        user2.setPassword("ladder@2023");
        user2.setConfirmPassword("ladder@2023");
        user2.setContactNumber(9876667836L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
    }
}

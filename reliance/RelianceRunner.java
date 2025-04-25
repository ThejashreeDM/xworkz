package com.xworkz.tostring.reliance;

public class RelianceRunner
{

        public static void main(String[] args) {

            RelianceDto user = new RelianceDto();
            user.setRelianceId("reliance2025");
            user.setUserName("Varun");
            user.setEmail("varun@reliance.com");
            user.setPassword("rel@2025");
            user.setConfirmPassword("rel@2025");
            user.setContactNumber(9876543211L);

            RelianceDto user1 = new RelianceDto();
            user1.setRelianceId("reliance2025");
            user1.setUserName("Varun");
            user1.setEmail("varun@reliance.com");
            user1.setPassword("rel@2025");
            user1.setConfirmPassword("rel@2025");
            user1.setContactNumber(9876543211L);

            RelianceDto user2 = new RelianceDto();
            user2.setRelianceId("reliance2023");
            user2.setUserName("Vamika");
            user2.setEmail("vamika@reliance.com");
            user2.setPassword("rel@2023");
            user2.setConfirmPassword("rel@2023");
            user2.setContactNumber(9346543211L);

            System.out.println(user);
            System.out.println(user.equals(user1));
            System.out.println(user.equals(user2));
        }
    }



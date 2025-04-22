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

            System.out.println(user);
        }
    }



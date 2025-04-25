package com.xworkz.linkedinapp;
import com.xworkz.linkedinapp.linkedin.LinkedInDto;
import com.xworkz.linkedinapp.register.LinkedInSignIn;

public class LinkedInRunner {
        public static void main(String[] args) {

            LinkedInDto user = new LinkedInDto();
            user.setUsername("harshitha123");
            user.setFullName("Harshitha Shree");
            user.setEmail("harshitha@linkedin.com");
            user.setPassword("linkedInPass1");
            user.setConfirmPassword("linkedInPass1");
            user.setContactNumber(9876543210L);

            LinkedInDto user1 = new LinkedInDto();
            user1.setUsername("harshitha123");
            user1.setFullName("Harshitha Shree");
            user1.setEmail("harshitha@linkedin.com");
            user1.setPassword("linkedInPass1");
            user1.setConfirmPassword("linkedInPass1");
            user1.setContactNumber(9876543210L);

            LinkedInDto user2 = new LinkedInDto();
            user2.setUsername("thejasree");
            user2.setFullName("Thejashree");
            user2.setEmail("theju@linkedin.com");
            user2.setPassword("linked123");
            user2.setConfirmPassword("linkedIn123");
            user2.setContactNumber(9876543123L);

            LinkedInSignIn login = new LinkedInSignIn();
            boolean result = login.startSession(user);
            System.out.println(user);

            System.out.println(user.equals(user1));
            System.out.println(user1.equals(user2));
        }
    }



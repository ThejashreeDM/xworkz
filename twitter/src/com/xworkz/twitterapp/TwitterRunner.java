package com.xworkz.twitterapp;
import com.xworkz.twitterapp.twitter.TwitterDto;
import com.xworkz.twitterapp.signin.TwitterSignIn;

public class TwitterRunner {
        public static void main(String[] args) {

            TwitterDto user = new TwitterDto();
            user.setHandle("Thejashree");
            user.setDisplayName("Thejashree D M");
            user.setEmail("theju11304@gmail.com");
            user.setPassword("123456789");
            user.setConfirmPassword("123456789");
            user.setMobileNumber(1234567890L);


            TwitterDto user1 = new TwitterDto();
            user1.setHandle("Thejashree");
            user1.setDisplayName("Thejashree D M");
            user1.setEmail("theju11304@gmail.com");
            user1.setPassword("123456789");
            user1.setConfirmPassword("123456789");
            user1.setMobileNumber(1234567890L);


            TwitterDto user2 = new TwitterDto();
            user2.setHandle("Theju");
            user2.setDisplayName("Theju D M");
            user2.setEmail("theju11304@gmail.com");
            user2.setPassword("456456789");
            user2.setConfirmPassword("456456789");
            user2.setMobileNumber(9834567890L);

            TwitterSignIn login = new TwitterSignIn();
            boolean loggedIn = login.beginSession(user);
            System.out.println(user);
            System.out.println(user.equals(user1));
            System.out.println(user1.equals(user2));

        }
    }



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

            TwitterSignIn login = new TwitterSignIn();
            boolean loggedIn = login.beginSession(user);
            System.out.println(user);

        }
    }



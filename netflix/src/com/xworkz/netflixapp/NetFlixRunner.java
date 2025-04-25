package com.xworkz.netflixapp;
import com.xworkz.netflixapp.netflix.NetflixDto;
import com.xworkz.netflixapp.signin.NetflixUserSignin;

public class NetFlixRunner {
        public static void main(String[] args) {

            NetflixDto user = new NetflixDto();
            user.setUserId("netflixuser2025");
            user.setUserName("Harshitha");
            user.setEmail("harshitha@netflix.com");
            user.setPassword("netflix@2025");
            user.setConfirmPassword("netflix@2025");
            user.setMobileNumber(9876543210L);

            NetflixDto user1 = new NetflixDto();
            user1.setUserId("netflixuser2025");
            user1.setUserName("Harshitha");
            user1.setEmail("harshitha@netflix.com");
            user1.setPassword("netflix@2025");
            user1.setConfirmPassword("netflix@2025");
            user1.setMobileNumber(9876543210L);

            NetflixDto user2 = new NetflixDto();
            user2.setUserId("netflixuser2025");
            user2.setUserName("Thejashree");
            user2.setEmail("thejashree@netflix.com");
            user2.setPassword("netflix@2025");
            user2.setConfirmPassword("netflix@2025");
            user2.setMobileNumber(9872043210L);

            NetflixUserSignin login = new NetflixUserSignin();
            boolean status = login.attemptLogin(user);

            System.out.println("Login status: " + status);
            System.out.println(user);
            System.out.println(user1.equals(user1));
            System.out.println(user2.equals(user2));

        }
    }



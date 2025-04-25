package com.xworkz.appleapp;
import com.xworkz.appleapp.apple.AppleDto;
import com.xworkz.appleapp.register.AppleLogin;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AppleRunner {


        public static void main(String[] args) {

            AppleDto user = new AppleDto();
            user.setAppleId("appleuser2025");
            user.setUserName("Harshitha");
            user.setEmail("harshitha@apple.com");
            user.setPassword("apple@2025");
            user.setConfirmPassword("apple@2025");
            user.setContactNumber(9876543210L);

            AppleDto user1 = new AppleDto();
            user1.setAppleId("appleuser2025");
            user1.setUserName("Harshitha");
            user1.setEmail("harshitha@apple.com");
            user1.setPassword("apple@2025");
            user1.setConfirmPassword("apple@2025");
            user1.setContactNumber(9876543210L);

            AppleDto user2 = new AppleDto();
            user2.setAppleId("apple2025");
            user2.setUserName("Theju");
            user2.setEmail("theju@apple.com");
            user2.setPassword("apple@2025");
            user2.setConfirmPassword("apple@2025");
            user2.setContactNumber(9876543890L);

            AppleLogin login = new AppleLogin();
            boolean result = login.verifySignIn(user);

            System.out.println("Login success: " + result);
            System.out.println(user);
            System.out.println(user.equals(user1));
            System.out.println(user1.equals(user2));
        }
    }



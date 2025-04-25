package com.xworkz.googleapp;

import com.xworkz.googleapp.google.GoogleDto;
import com.xworkz.googleapp.googlesignin.GoogleSignIn;

public class GoogleRunner {

        public static void main(String[] args) {

            GoogleDto googleDto = new GoogleDto();
            googleDto.setEmail("anuup123@gmail.com");
            googleDto.setPhoneNumber("9876543210");
            googleDto.setUsername("Anup123");
            googleDto.setPassword("Anupama123");
            googleDto.setConfirmPassword("Anupama123");

            GoogleDto googleDto1 = new GoogleDto();
            googleDto1.setEmail("anuup123@gmail.com");
            googleDto1.setPhoneNumber("9876543210");
            googleDto1.setUsername("Anup123");
            googleDto1.setPassword("Anupama123");
            googleDto1.setConfirmPassword("Anupama123");

            GoogleDto googleDto2 = new GoogleDto();
            googleDto2.setEmail("anuup123@gmail.com");
            googleDto2.setPhoneNumber("9876543210");
            googleDto2.setUsername("Anup123");
            googleDto2.setPassword("Anupama123");
            googleDto2.setConfirmPassword("Anupama123");

            GoogleSignIn googleSignIn = new GoogleSignIn();
            boolean result = googleSignIn.attemptLogin(googleDto);

            if (result) {
                System.out.println("Login successful ");
            } else {
                System.out.println("Login failed ");
            }
            System.out.println(googleDto);
            System.out.println(googleDto.equals(googleDto1));
            System.out.println(googleDto1.equals(googleDto2));
        }
    }



package com.xworkz.myntraapp;

import com.xworkz.myntraapp.constants.Gender;
import com.xworkz.myntraapp.myntra.MyntraDto;
import com.xworkz.myntraapp.myntralogin.MyntraLogin;

public class MyntraRunner {
    public static void main(String[] args) {


        MyntraDto myntraDto = new MyntraDto();
        myntraDto.setPhoneNumber(562851890L);
        myntraDto.setFullName("Prithiv");
        myntraDto.setEmailId("priii56@gmail.com");
        myntraDto.setGender(Gender.MALE);
        myntraDto.setDob("09-05-2000");
        myntraDto.setLocation("Bangalore");

        MyntraDto myntraDto1 = new MyntraDto();
        myntraDto1.setPhoneNumber(562851890L);
        myntraDto1.setFullName("Prithiv");
        myntraDto1.setEmailId("priii56@gmail.com");
        myntraDto1.setGender(Gender.MALE);
        myntraDto1.setDob("09-05-2000");
        myntraDto1.setLocation("Bangalore");

        MyntraDto myntraDto2 = new MyntraDto();
        myntraDto2.setPhoneNumber(932851890L);
        myntraDto2.setFullName("Prarthane");
        myntraDto2.setEmailId("prarthana12@gmail.com");
        myntraDto2.setGender(Gender.FEMALE);
        myntraDto2.setDob("4-03-2003");
        myntraDto2.setLocation("Mysore");

        MyntraLogin myntraLogin = new MyntraLogin();
        boolean isValid = myntraLogin.logIn(myntraDto);

        if (isValid == true) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful");

        }
        System.out.println(myntraDto);
        System.out.println(myntraDto.equals(myntraDto1));
        System.out.println(myntraDto1.equals(myntraDto2));
    }
    }


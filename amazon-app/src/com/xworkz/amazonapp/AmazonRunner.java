package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.AmazonDto;
import com.xworkz.amazonapp.amazonlogin.AmazonLogin;

public class AmazonRunner {
    public static void main(String[] args) {

        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setEmailId("baba132@gmail.com");
        amazonDto.setPhoneNumber("4578909797");
        amazonDto.setFullName("Baba Singh");
        amazonDto.setPassword("Babu902789");
        amazonDto.setConfirmPassword("Babu902789");

        AmazonDto amazonDto1 = new AmazonDto();
        amazonDto.setEmailId("baba132@gmail.com");
        amazonDto.setPhoneNumber("4578909797");
        amazonDto.setFullName("Baba Singh");
        amazonDto.setPassword("Babu902789");
        amazonDto.setConfirmPassword("Babu902789");

        AmazonDto amazonDto2 = new AmazonDto();
        amazonDto.setEmailId("babu132@gmail.com");
        amazonDto.setPhoneNumber("4578909797");
        amazonDto.setFullName("Babu Singh");
        amazonDto.setPassword("Baba902789");
        amazonDto.setConfirmPassword("Baba902789");

        AmazonLogin amazonLogin = new AmazonLogin();
        boolean ref = amazonLogin.signIn(amazonDto);

        if (ref == true) {
            System.out.println("User signIn successful");
        } else {
            System.out.println("User signIn unsuccessful");
        }
        System.out.println(amazonDto);
        System.out.println(amazonDto.equals(amazonDto1));
        System.out.println(amazonDto1.equals(amazonDto2));

    }
}

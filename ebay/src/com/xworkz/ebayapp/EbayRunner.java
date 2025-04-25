package com.xworkz.ebayapp;

import com.xworkz.ebayapp.ebay.EbayDto;
import com.xworkz.ebayapp.ebayregistration.EbayRegister;

public class EbayRunner {
    public static void main(String[] args) {

        EbayDto ebayDto = new EbayDto();
        ebayDto.setFirstName("Baba");
        ebayDto.setLastName("Singh");
        ebayDto.setEmail("babaaa56@gmail.com");
        ebayDto.setPassWord("bahsjkk808");
        ebayDto.setConfirmPassWord("bahsjkk808");

        EbayDto ebayDto1 = new EbayDto();
        ebayDto1.setFirstName("Baba");
        ebayDto1.setLastName("Singh");
        ebayDto1.setEmail("babaaa56@gmail.com");
        ebayDto1.setPassWord("bahsjkk808");
        ebayDto1.setConfirmPassWord("bahsjkk808");

        EbayDto ebayDto2 = new EbayDto();
        ebayDto2.setFirstName("Babu");
        ebayDto2.setLastName("Singh");
        ebayDto2.setEmail("babuuu56@gmail.com");
        ebayDto2.setPassWord("babujkk808");
        ebayDto2.setConfirmPassWord("babujkk808");

        EbayRegister ebayRegister = new EbayRegister();
        boolean isValid = ebayRegister.register(ebayDto);

        if (isValid == true) {
            System.out.println("Registration successful");
        } else {
            System.out.println("Registration unsuccessful");

        }
        System.out.println(ebayDto);
        System.out.println(ebayDto.equals(ebayDto1));
        System.out.println(ebayDto1.equals(ebayDto2));

    }
}

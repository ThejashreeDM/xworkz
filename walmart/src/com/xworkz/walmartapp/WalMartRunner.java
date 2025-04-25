package com.xworkz.walmartapp;

import com.xworkz.walmartapp.login.UserLogIn;
import com.xworkz.walmartapp.walmart.WalMartDto;

public class WalMartRunner {
    public static void main(String[] args) {


        WalMartDto walMartDto = new WalMartDto();
        walMartDto.setEmailId("theju11304@gmail.com");
        walMartDto.setFirstName("Thejashree");
        walMartDto.setLastName("D M");
        walMartDto.setPhoneNumber("098765434");
        walMartDto.setPassWord("gfwq^*590");

        WalMartDto walMartDto1 = new WalMartDto();
        walMartDto1.setEmailId("theju11304@gmail.com");
        walMartDto1.setFirstName("Thejashree");
        walMartDto1.setLastName("D M");
        walMartDto1.setPhoneNumber("098765434");
        walMartDto1.setPassWord("gfwq^*590");

        WalMartDto walMartDto2 = new WalMartDto();
        walMartDto2.setEmailId("theju11304@gmail.com");
        walMartDto2.setFirstName("Thejashree");
        walMartDto2.setLastName("D M");
        walMartDto2.setPhoneNumber("098765434");
        walMartDto2.setPassWord("gfwq^*590");

        UserLogIn userLogIn = new UserLogIn();
        boolean ref = userLogIn.customerProfileValidation( walMartDto);

        if(ref == true){
            System.out.println("login successful");
        }
        else{
            System.out.println("login unsuccessful");
        }
        System.out.println(walMartDto);
        System.out.println(walMartDto.equals(walMartDto1));
        System.out.println(walMartDto1.equals(walMartDto2));

    }
}

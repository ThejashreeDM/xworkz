package com.xworkz.snapdealapp;

import com.xworkz.snapdealapp.register.SnapDealRegistration;
import com.xworkz.snapdealapp.snapdeal.SnapDealDto;

public class SnapDealRunner {
    public static void main(String[] args) {


        SnapDealDto snapDealDto = new SnapDealDto();
        snapDealDto.setEmailId("john567@gmail.com");
        snapDealDto.setMobileNumber(3456789090L);
        snapDealDto.setName("John Smith");
        snapDealDto.setDob("08-02-2001");
        snapDealDto.setPassWord("john07%809");

        SnapDealDto snapDealDto1 = new SnapDealDto();
        snapDealDto1.setEmailId("john567@gmail.com");
        snapDealDto1.setMobileNumber(3456789090L);
        snapDealDto1.setName("John Smith");
        snapDealDto1.setDob("08-02-2001");
        snapDealDto1.setPassWord("john07%809");

        SnapDealDto snapDealDto2 = new SnapDealDto();
        snapDealDto2.setEmailId("theju11304@gmail.com");
        snapDealDto2.setMobileNumber(5656789090L);
        snapDealDto2.setName("Thejashree D M");
        snapDealDto2.setDob("11-03-2004");
        snapDealDto2.setPassWord("Theju@04");

        SnapDealRegistration snapDealRegistration = new SnapDealRegistration();
        boolean msg = snapDealRegistration.userRegistrationValidation(snapDealDto);

        if(msg == true)
            System.out.println("Registration Successful");
        else
            System.out.println("Registration unsuccessful");
        System.out.println(snapDealDto);
        System.out.println(snapDealDto.equals(snapDealDto1));
        System.out.println(snapDealDto1.equals(snapDealDto2));
    }
}

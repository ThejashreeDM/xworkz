package com.xworkz.nykaaapp;

import com.xworkz.nykaaapp.nykaa.NykaaDto;
import com.xworkz.nykaaapp.userlogin.NykaaUserLogIn;

public class NykaaRunner {
    public static void main(String[] args) {


        NykaaDto nykaaDto = new NykaaDto();
        nykaaDto.setEmailId("ram123@gmail.com");
        nykaaDto.setName("Ramarjun");
        nykaaDto.setMobileNumber("689793074");
        nykaaDto.setPassWord("rammu0980");
        nykaaDto.setConfirmPassWord("rammu0980");

        NykaaDto nykaaDto1 = new NykaaDto();
        nykaaDto1.setEmailId("ram123@gmail.com");
        nykaaDto1.setName("Ramarjun");
        nykaaDto1.setMobileNumber("689793074");
        nykaaDto1.setPassWord("rammu0980");
        nykaaDto1.setConfirmPassWord("rammu0980");

        NykaaDto nykaaDto2= new NykaaDto();
        nykaaDto2.setEmailId("ram673@gmail.com");
        nykaaDto2.setName("RamDev");
        nykaaDto2.setMobileNumber("689794574");
        nykaaDto2.setPassWord("ramdev1234");
        nykaaDto2.setConfirmPassWord("ramdev1234");

        NykaaUserLogIn nykaaUserLogIn = new NykaaUserLogIn();
        boolean ref = nykaaUserLogIn.validateUserLogIn(nykaaDto);;

        if(ref == true){
            System.out.println("User Login successful");
        }
        else{
            System.out.println("User Login unsuccessful");
        }
        System.out.println(nykaaDto);
        System.out.println(nykaaDto.equals(nykaaDto1));
        System.out.println(nykaaDto1.equals(nykaaDto2));
    }
    }


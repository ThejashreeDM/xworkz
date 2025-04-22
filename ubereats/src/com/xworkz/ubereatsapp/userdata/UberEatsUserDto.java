package com.xworkz.ubereatsapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UberEatsUserDto {

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String deliveryAddress;
       @Override
        public String toString()
        {
                return "UberEatsUberDto{\nEmail : "+email+"\nPhone Number : "+phoneNumber+"\nPassword : "+password+"\nFull Name : "+fullName+"Delivery Address : "+deliveryAddress+"}";

        }


    }



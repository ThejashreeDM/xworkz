package com.xworkz.olafoods.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OlaFoodsUserDto
{

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String deliveryArea;

    @Override
    public String toString()
    {
            return "OlaFoodsUserDto{\nEmail : "+email +"\nPhone Number : "+phoneNumber +"\nPassword : "+password +"\nFull Name : "+fullName+"\nDelivery Area : "+deliveryArea+"}";
    }
    }



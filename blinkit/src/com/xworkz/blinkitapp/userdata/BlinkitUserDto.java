package com.xworkz.blinkitapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BlinkitUserDto
{
    private String email;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String deliveryAddress;

    @Override
    public String toString()
    {
        return "BlinkitUserDto{\nEmail : "+email+"\nPhone Number : "+phoneNumber+"\nPassword : "+password+"\nFull Name : "+fullName+"\nDeliveryAddress : "+deliveryAddress+"}";

    }

}



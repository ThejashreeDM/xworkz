package com.xworkz.zeptoapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ZeptoUserDto
{



    private String email;
    private String phoneNumber;
    private String password;
    private String name;
    private String address;

    public String toString()
    {
        return "ZeptoUserDto{\nEmail : "+email+"\nPhone Number : "+phoneNumber+"\nPassword : "+password+"Name : "+name+"Address : "+address;
    }


}

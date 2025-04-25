package com.xworkz.zeptoapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (obj instanceof ZeptoUserDto) {
            ZeptoUserDto child = (ZeptoUserDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber, password, name, address);
    }
}

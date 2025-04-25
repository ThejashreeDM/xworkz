package com.xworkz.blinkitapp.userdata;

import com.xworkz.blinkitapp.signup.Blinkit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (obj instanceof BlinkitUserDto) {
            BlinkitUserDto child = (BlinkitUserDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber, password, fullName, deliveryAddress);
    }
}



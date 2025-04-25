package com.xworkz.olafoods.userdata;

import com.xworkz.olafoods.signup.OlaFoods;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (obj instanceof OlaFoodsUserDto )
        {
            OlaFoodsUserDto child = (OlaFoodsUserDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber, password, fullName, deliveryArea);
    }
}



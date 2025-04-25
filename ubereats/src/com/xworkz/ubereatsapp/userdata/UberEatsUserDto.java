package com.xworkz.ubereatsapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (obj instanceof UberEatsUserDto) {
            UberEatsUserDto child = (UberEatsUserDto) obj;
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



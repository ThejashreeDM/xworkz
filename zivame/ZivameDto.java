package com.xworkz.tostring.zivame;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class ZivameDto
{


        private String zivameId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;

        @Override
        public String toString() {
            return "ZivameDto{\n" + "Id : " + zivameId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
        }
        public boolean equals(Object obj) {
                if (obj instanceof ZivameDto) {
                        ZivameDto child = (ZivameDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(zivameId, userName, email, password, confirmPassword, contactNumber);
        }
}

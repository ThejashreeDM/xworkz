package com.xworkz.tostring.sephora;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class SephoraDto
{

        private String sephoraId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;

        @Override
        public String toString() {
            return "SephoraDto{\n" + "Id : " + sephoraId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
        }
        @Override
        public boolean equals(Object obj) {
                if (obj instanceof SephoraDto) {
                        SephoraDto child = (SephoraDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(sephoraId, userName, email, password, confirmPassword, contactNumber);
        }
}

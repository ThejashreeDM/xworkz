package com.xworkz.tostring.gocolors;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

public class GoColorsDto
{

        private String goColorsId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;

        @Override
        public String toString() {
            return "GoColorsDto{\n" + "Id : " + goColorsId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
        }

        @Override
        public int hashCode() {
                return Objects.hash(goColorsId, userName, email, password, confirmPassword, contactNumber);
        }

        @Override
        public boolean equals(Object obj)
        {
                if(obj instanceof GoColorsDto)
                {
                        GoColorsDto child=(GoColorsDto) obj;
                        if(this.hashCode() == child.hashCode())
                        {
                                return true;
                        }
                }
                return false;

        }
}

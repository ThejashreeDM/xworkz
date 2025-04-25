package com.xworkz.ajioapp.userdata;

import com.xworkz.ajioapp.signup.Ajio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class AjioUserDto
{

        private String email;
        private String mobileNumber;
        private String password;
        private String fullName;
        private String gender;

        public String toString()
        {
                return "AjioUserDto{\nEmail : "+email+"Mobile Number : "+mobileNumber+"\nPassword : "+password+"\nFull Name : "+fullName+"\nGender : "+gender+"}";

        }

        public boolean equals(Object obj) {
                if (obj instanceof AjioUserDto) {
                        AjioUserDto child = (AjioUserDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(email, mobileNumber, password, fullName, gender);
        }
}



package com.xworkz.googleapp.google;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class GoogleDto {

        private String email;
        private String phoneNumber;
        private String username;
        private String password;
        private String confirmPassword;


        public String toString()
        {
                return "GoogleDto{\nEmail : "+email+"\nPhone Number : "+phoneNumber+"\nUserName : "+username+"Password : "+password+"ConfirmPassword : "+confirmPassword+"}";
        }
        public boolean equals(Object obj) {
                if (obj instanceof GoogleDto) {
                        GoogleDto child = (GoogleDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(email, phoneNumber, username, password, confirmPassword);
        }
}



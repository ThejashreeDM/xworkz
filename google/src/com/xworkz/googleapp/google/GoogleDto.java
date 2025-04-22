package com.xworkz.googleapp.google;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


}



package com.xworkz.netflixapp.netflix;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NetflixDto {

        private String userId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long mobileNumber;
        @Override
public String toString()
{
        return "NetFlixDto{\nUser Id : "+userId+"\nUser Name : "+userName+"\nEmail : "+email+"\nPassword : "+password+"\nConfirm Password : "+confirmPassword+"\nMobile Number : "+mobileNumber+"}";

}

    }



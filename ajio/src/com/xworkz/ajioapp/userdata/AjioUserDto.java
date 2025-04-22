package com.xworkz.ajioapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


    }



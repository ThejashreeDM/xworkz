package com.xworkz.linkedinapp.linkedin;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class LinkedInDto {
        private String username;
        private String fullName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;
    public String toString()
    {
            return "LinkedInDto{\nUserName : "+username+"\nFull Name : "+fullName+"\n Email : "+email+"\nPassword : "+password+"\n Confirm Password : "+confirmPassword+"\nContact Number : "+contactNumber+"}";
    }
    public boolean equals(Object obj) {
        if (obj instanceof LinkedInDto) {
            LinkedInDto child = (LinkedInDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(username, fullName, email, password, confirmPassword, contactNumber);
    }
}



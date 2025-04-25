package com.xworkz.netflixapp.netflix;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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
        public boolean equals(Object obj) {
                if (obj instanceof NetflixDto) {
                        NetflixDto child = (NetflixDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(userId, userName, email, password, confirmPassword, mobileNumber);
        }
}



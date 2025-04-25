package com.xworkz.twitterapp.twitter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class TwitterDto {

        private String handle;
        private String displayName;
        private String email;
        private String password;
        private String confirmPassword;
        private long mobileNumber;

        public String toString()
        {
                return "TwitterDto{\nHandle : "+handle+"\nDisplay Name : "+displayName+"\nEmail : "+email+"\nPassword : "+password+"\nConfirm Password : "+confirmPassword+"\nMobile Number : "+mobileNumber+"}";
        }
        public boolean equals(Object obj) {
                if (obj instanceof TwitterDto) {
                        TwitterDto child = (TwitterDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(handle, displayName, email, password, confirmPassword, mobileNumber);
        }
}



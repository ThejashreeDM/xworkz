package com.xworkz.snapdealapp.snapdeal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class SnapDealDto {

        private String emailId ;
        private long mobileNumber ;
        private String name ;
        private String dob;
        private String passWord;

        @Override
        public String toString() {
                return "SnapDealDto{\nEmail Id : "+emailId+"\nMobile Number : "+mobileNumber+"\nName : "+name+"\nD O B : "+dob+"\nPassword : "+passWord+"}";
        }

        public boolean equals(Object obj) {
                if (obj instanceof SnapDealDto) {
                        SnapDealDto child = (SnapDealDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(emailId, mobileNumber, name, dob, passWord);
        }
}



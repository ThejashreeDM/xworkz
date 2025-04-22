package com.xworkz.snapdealapp.snapdeal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}



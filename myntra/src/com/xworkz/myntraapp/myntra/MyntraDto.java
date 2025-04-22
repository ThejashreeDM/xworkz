package com.xworkz.myntraapp.myntra;

import lombok.Getter;
import lombok.NoArgsConstructor;


import com.xworkz.myntraapp.constants.Gender;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MyntraDto {
   private long phoneNumber ;
    private String fullName ;
    private String emailId ;
    private Gender gender ;
    private String dob ;
    private String location;

    public String toString()
    {
     return "MyntraDto{\nPhonrNumber : "+phoneNumber+"\nFull Name : "+fullName+"\nEmail Id : "+emailId+"\nGender : "+gender+"\n DOB : "+dob+"Location : "+location+"}";

    }

}

package com.xworkz.myntraapp.myntra;

import lombok.Getter;
import lombok.NoArgsConstructor;


import com.xworkz.myntraapp.constants.Gender;
import lombok.Setter;

import java.util.Objects;

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
 public boolean equals(Object obj) {
  if (obj instanceof MyntraDto) {
   MyntraDto child = (MyntraDto) obj;
   if (this.hashCode() == child.hashCode()) {
    return true;
   }
  }
  return false;

 }

 @Override
 public int hashCode() {
  return Objects.hash(phoneNumber, fullName, emailId, gender, dob, location);
 }
}

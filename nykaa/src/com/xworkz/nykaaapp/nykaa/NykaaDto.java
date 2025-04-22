package com.xworkz.nykaaapp.nykaa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NykaaDto {
    private String emailId;
    private String name;
    private String mobileNumber;
    private String passWord;
    private String confirmPassWord;
   public String toString()
   {
       return "NykaaDto{\nEmailId : "+emailId+"\nName : "+name+"\nMobile Number : "+mobileNumber+"\nPassword : "+passWord+"\nConfirm Password : "+confirmPassWord+"}";
   }

}
